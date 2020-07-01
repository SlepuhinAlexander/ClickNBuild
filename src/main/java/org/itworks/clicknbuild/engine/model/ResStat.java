package org.itworks.clicknbuild.engine.model;

import org.itworks.clicknbuild.config.stats.model.ResStatModel;
import org.itworks.clicknbuild.util.math.MathHelper;

import java.util.Objects;

@SuppressWarnings("UnusedReturnValue")
public final class ResStat {
    public final ResType type;

    private double amount;

    public ResStat(ResType type, double amount) {
        this.type = Objects.requireNonNull(type);
        setAmount(amount);
    }

    public ResStat(ResType type) {
        this(type, 0);
    }

    public static ResStat valueOf(ResStatModel value) {
        if (value == null) return null;
        ResType type = ResType.get(value.getType());
        if (type == null) return null;
        ResStat result = new ResStat(type);
        if (value.getAmount() != null) result.setAmount(value.getAmount());
        return result;
    }

    public double getAmount() {
        return amount;
    }

    public ResStat setAmount(double amount) {
        this.amount = MathHelper.clamp(amount);
        return this;
    }

    public ResStat add(double amount) {
        return setAmount(this.amount + amount);
    }

    public ResStat sub(double amount) {
        return setAmount(this.amount - amount);
    }

    public ResStat mul(double multiplier) {
        return setAmount(this.amount * multiplier);
    }

    public ResStat copy() {
        return new ResStat(this.type, this.amount);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ResStat)) return false;
        ResStat resStat = (ResStat) o;
        return type == resStat.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, amount);
    }
}
