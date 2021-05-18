package com.productio.production.models;

public class ProductionLineDTO {

    public ProductionLineDTO(long producedItemId, long quantityPerMinute) {
        this.producedItemId = producedItemId;
        this.quantityPerMinute = quantityPerMinute;
    }

    public ProductionLineDTO() {

    }

    private long producedItemId;

    private long quantityPerMinute;

    public long getProducedItemId() {
        return producedItemId;
    }

    public void setProducedItemId(long producedItemId) {
        this.producedItemId = producedItemId;
    }

    public long getQuantityPerMinute() {
        return quantityPerMinute;
    }

    public void setQuantityPerMinute(long quantityPerMinute) {
        this.quantityPerMinute = quantityPerMinute;
    }
}
