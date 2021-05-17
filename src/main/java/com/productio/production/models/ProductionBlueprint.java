package com.productio.production.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.sql.Timestamp;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "productionblueprints")
@EntityListeners(AuditingEntityListener.class)
public class ProductionBlueprint {

    public ProductionBlueprint(long id, ProductionItem item, @NotBlank long materialId, @NotBlank long quantity) {
        this.id = id;
        this.item = item;
        this.materialId = materialId;
        this.quantity = quantity;
    }

    public ProductionBlueprint() {

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, updatable = false)
    private long id;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_id")
    private ProductionItem item;

    @NotBlank
    private long materialId;

    @NotBlank
    private long quantity;

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public long getId() {
        return id;
    }

    public ProductionItem getItem() {
        return item;
    }

    public void setItem(ProductionItem item) {
        this.item = item;
    }

    public long getMaterialId() {
        return materialId;
    }

    public void setMaterialId(long materialId) {
        this.materialId = materialId;
    }
}
