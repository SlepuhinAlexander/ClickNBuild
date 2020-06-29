package org.itworks.clicknbuild.config.stats.model;

import org.itworks.clicknbuild.engine.model.ResChunk;

public class ResChunkModel {
    private String type;
    private Double amount;

    public static ResChunkModel valueOf(ResChunk value) {
        if (value == null) return null;
        ResChunkModel result = new ResChunkModel();
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
