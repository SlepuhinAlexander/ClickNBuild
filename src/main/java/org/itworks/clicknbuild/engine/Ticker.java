package org.itworks.clicknbuild.engine;

import org.itworks.clicknbuild.config.ConfigLoader;
import org.itworks.clicknbuild.config.Configs;
import org.itworks.clicknbuild.util.math.MathHelper;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * A scheduled timer that periodically fires {@link Ticking#tick()} notifications to all registered {@link Ticking}
 * objects once in a certain time period.
 */
public final class Ticker {
    /**
     * Default rate (in ms) at which this <code>Ticker</code> would fire notifications.
     */
    private static final int DEFAULT_RATE = Integer.parseInt(ConfigLoader.inst().get(Configs.TICKING_RATE));

    private static final int MIN_RATE = 100;
    private static final int MAX_RATE = 1000;

    private static volatile Ticker inst;

    /**
     * Collection of all {@link Ticking} objects that should receive {@link Ticking#tick()} notification each time.
     */
    private final CopyOnWriteArraySet<Ticking> objects = new CopyOnWriteArraySet<>();

    /**
     * Timer object implementing periodicity.
     */
    private Timer timer = new Timer();

    /**
     * Current {@link #timer} period set.
     */
    private int rate = DEFAULT_RATE;

    private Ticker() {
    }

    public static Ticker inst() {
        Ticker local = inst;
        if (local == null) {
            synchronized (Ticker.class) {
                local = inst;
                if (local == null) {
                    inst = local = new Ticker();
                }
            }
        }
        return local;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = MathHelper.clamp(rate, MIN_RATE, MAX_RATE);
    }

    public void register(Ticking object) {
        if (object == null) return;
        objects.add(object);
    }

    public void delist(Ticking object) {
        if (object == null) return;
        objects.remove(object);
    }

    public void start() {
        stop();
        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                objects.forEach(Ticking::tick);
            }
        }, 0, rate);
    }

    public void start(int rate) {
        setRate(rate);
        start();
    }

    public void stop() {
        timer.cancel();
    }

    public void clear() {
        stop();
        objects.clear();
    }
}
