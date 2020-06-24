package org.itworks.clicknbuild.config.stats.model;

public class ResourceModel {
    private String type;
    private Boolean tradable;
    private Double price;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getTradable() {
        return tradable;
    }

    public void setTradable(Boolean tradable) {
        this.tradable = tradable;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ResourceModel{" +
               "type='" + type + '\'' +
               ", tradable=" + tradable +
               ", price=" + price +
               '}';
    }
}
