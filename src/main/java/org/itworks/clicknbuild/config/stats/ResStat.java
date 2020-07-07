package org.itworks.clicknbuild.config.stats;

import org.itworks.clicknbuild.engine.model.ResType;
import org.itworks.clicknbuild.util.math.MathHelper;

import java.util.Objects;

/**
 * In-game resource unit: {@link ResType} - type of an in-game resource; and its amonut.
 * The amount cannot be negative.
 * Non-nullable: null <code>ResStat</code> does not make any sense.
 */
@SuppressWarnings("UnusedReturnValue")
public final class ResStat {
    private ResType type;

    private double amount;

    public ResStat() {
    }

    public ResStat(ResType type, double amount) {
        this.type = Objects.requireNonNull(type);
        setAmount(amount);
    }

    public ResStat(ResType type) {
        this(type, 0);
    }

    public ResType getType() {
        return type;
    }

    public void setType(ResType type) {
        this.type = Objects.requireNonNull(type);
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
