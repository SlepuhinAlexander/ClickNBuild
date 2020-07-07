package org.itworks.clicknbuild.engine.res;

import com.google.common.util.concurrent.AtomicDouble;
import org.itworks.clicknbuild.config.stats.ResStat;
import org.itworks.clicknbuild.util.math.MathHelper;

import java.util.Objects;

@SuppressWarnings("UnusedReturnValue")
public final class ResChunk {

    /**
     * Resource type stored in this object.
     */
    public final ResType type;

    /**
     * Volatile amount of this <code>ResType</code> resource.
     * Used in multiple ways depending on context.
     * Cannot be negative.
     * <b>Always</b> limited by the <code>max</code> param of this object.
     *
     * In some use cases might be immutable and always equal to the corresponding <code>max</code> (which would be
     * immutable as well).
     */
    private final AtomicDouble current = new AtomicDouble();

    /**
     * Upper limit for the <code>current</code> amount of this <code>ResType</code> resource that could be held in
     * this object.
     * Could be either immutable and volatile, depending on usage context.
     */
    private final AtomicDouble max = new AtomicDouble();

    public ResChunk(ResType type, double current, double max) {
        max = MathHelper.clamp(max);
        current = MathHelper.clamp(current, max);
        this.type = Objects.requireNonNull(type);
        setCurrent(current);
        setMax(max);
    }

    public ResChunk(ResType type, double currentAndMax) {
        this(type, currentAndMax, currentAndMax);
    }

    public ResChunk(ResType type) {
        this(type, 0d);
    }

    public double get() {
        return getCurrent();
    }

    public double getCurrent() {
        return current.get();
    }

    public double getMax() {
        return max.get();
    }

    public ResChunk set(double amount) {
        return setCurrent(amount);
    }

    public ResChunk setCurrent(double amount) {
        current.set(MathHelper.clamp(amount, getMax()));
        return this;
    }

    public ResChunk setMax(double amount) {
        max.set(MathHelper.clamp(amount));
        current.set(MathHelper.clamp(current.get(), max.get()));
        return this;
    }

    public ResChunk add(double delta) {
        return setCurrent(MathHelper.clamp(getCurrent() + delta, getMax()));
    }

    public ResChunk add(ResStat res) {
        if (res == null || !res.getType().equals(type)) return this;
        return add(res.getAmount());
    }

    public ResChunk add(ResChunk res) {
        if (res == null || !res.type.equals(type)) return this;
        return add(res.get());
    }

    public ResChunk sub(double delta) {
        return setCurrent(MathHelper.clamp(getCurrent() - delta, getMax()));
    }

    public ResChunk sub(ResStat res) {
        if (res == null || !res.getType().equals(type)) return this;
        return sub(res.getAmount());
    }

    public ResChunk sub(ResChunk res) {
        if (res == null || !res.type.equals(type)) return this;
        return sub(res.get());
    }

    public ResChunk copy() {
        return new ResChunk(type, get(), getMax());
    }

    public ResStat toResStat() {
        return new ResStat(type, get());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ResChunk)) return false;
        ResChunk resChunk = (ResChunk) o;
        return type == resChunk.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }
}
