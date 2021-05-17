package com.productio.production.models;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.sql.Timestamp;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "productionlines")
@EntityListeners(AuditingEntityListener.class)
public class ProductionLine {

    public ProductionLine(long id, long producedItemId, long quantityPerMinute) {
        this.id = id;
        this.producedItemId = producedItemId;
        this.quantityPerMinute = quantityPerMinute;
    }

    public ProductionLine() {

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, updatable = false)
    private long id;

    @NotBlank
    private long producedItemId;

    @NotBlank
    private long quantityPerMinute;

    public long getId() {
        return id;
    }

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
