package org.itworks.clicknbuild.engine.model;

import org.itworks.clicknbuild.config.stats.model.ResChunkModel;
import org.itworks.clicknbuild.util.math.M;

import java.util.Objects;

public final class ResChunk {
    public final ResType type;
    private double amount;

    public ResChunk(ResType type, double amount) {
        this.type = Objects.requireNonNull(type);
        setAmount(amount);
    }

    public ResChunk(ResType type) {
        this(type, 0);
    }

    public static ResChunk valueOf(ResChunkModel value) {
        if (value == null) return null;
        ResType type = ResType.get(value.getType());
        if (type == null) return null;
        ResChunk result = new ResChunk(type);
        if (value.getAmount() != null) result.setAmount(value.getAmount());
        return result;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = M.clamp(amount);
    }

    public void add(double amount) {
        setAmount(this.amount + amount);
    }

    public void sub(double amount) {
        setAmount(this.amount - amount);
    }

    public void mul(double multiplier) {
        setAmount(this.amount * multiplier);
    }

    public ResChunk copy() {
        return new ResChunk(this.type, this.amount);
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
        return Objects.hash(type, amount);
    }
}
