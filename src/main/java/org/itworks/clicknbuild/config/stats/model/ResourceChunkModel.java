package org.itworks.clicknbuild.config.stats.model;

import org.itworks.clicknbuild.engine.model.ResourceChunk;

public class ResourceChunkModel {
    private String type;
    private Double amount;

    public static ResourceChunkModel valueOf(ResourceChunk value) {
        if (value == null) return null;
        ResourceChunkModel result = new ResourceChunkModel();
        result.setType(value.type.type);
        result.setAmount(value.getAmount());
        return result;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
