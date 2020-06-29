package org.itworks.clicknbuild.config.stats.model;

import org.itworks.clicknbuild.engine.model.ResStat;

public class ResStatModel {
    private String type;
    private Double amount;

    public static ResStatModel valueOf(ResStat value) {
        if (value == null) return null;
        ResStatModel result = new ResStatModel();
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
