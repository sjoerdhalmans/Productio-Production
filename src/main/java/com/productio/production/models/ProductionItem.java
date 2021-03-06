package com.productio.production.models;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.List;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "productionitems")
@EntityListeners(AuditingEntityListener.class)
public class ProductionItem {

    public ProductionItem(long id, List<ProductionBlueprint> requiredMaterials, @NotBlank long price, @NotBlank String name, @NotBlank String shortDescription, @NotBlank String currency) {
        this.id = id;
        this.requiredMaterials = requiredMaterials;
        this.price = price;
        this.name = name;
        this.shortDescription = shortDescription;
        this.currency = currency;
    }

    public ProductionItem() {

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, updatable = false)
    private long id;

    @OneToMany(mappedBy = "item", cascade = CascadeType.ALL)
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<ProductionBlueprint> requiredMaterials;

    @NotBlank
    private long price;

    @NotBlank
    private String name;

    @NotBlank
    private String shortDescription;

    @NotBlank
    private String currency;

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public long getId() {
        return id;
    }

    public List<ProductionBlueprint> getRequiredMaterials() {
        return requiredMaterials;
    }

    public void setRequiredMaterials(List<ProductionBlueprint> requiredMaterials) {
        this.requiredMaterials = requiredMaterials;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }
}
