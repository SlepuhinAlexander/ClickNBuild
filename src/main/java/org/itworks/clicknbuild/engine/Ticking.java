package org.itworks.clicknbuild.engine;

/**
 * A class implementing this interface can be registered in the {@link Ticker} class to receive periodic
 * {@link #tick()} notifications and react to them somehow.
 */
public interface Ticking {
    void tick();

    default void subscribe() {
        Ticker.inst().register(this);
    }

    default void unsubscribe() {
        Ticker.inst().delist(this);
    }
}
