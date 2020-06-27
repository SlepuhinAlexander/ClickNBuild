package org.itworks.clicknbuild.engine.model;

import org.itworks.clicknbuild.config.stats.model.ResourceChunkModel;
import org.itworks.clicknbuild.util.math.M;

import java.util.Objects;

public final class ResourceChunk implements Comparable<ResourceChunk> {
    public final ResourceType type;
    private double amount;

    public ResourceChunk(ResourceType type, double amount) {
        this.type = Objects.requireNonNull(type);
        setAmount(amount);
    }

    public ResourceChunk(ResourceType type) {
        this(type, 0);
    }

    public static ResourceChunk valueOf(ResourceChunkModel value) {
        if (value == null) return null;
        ResourceType type = ResourceType.get(value.getType());
        if (type == null) return null;
        ResourceChunk result = new ResourceChunk(type);
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

    public ResourceChunk copy() {
        return new ResourceChunk(this.type, this.amount);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ResourceChunk)) return false;
        ResourceChunk resourceChunk = (ResourceChunk) o;
        return type == resourceChunk.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, amount);
    }

    @Override
    public int compareTo(ResourceChunk o) {
        return this.type.ordinal() - o.type.ordinal();
    }
}
