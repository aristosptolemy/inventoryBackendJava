package com.example.inventory.model;

import java.time.OffsetDateTime;

public class Product {
    private Long id;
    private String productCode;
    private String name;
    private String category;
    private String maker;
    private String unit;
    private Boolean isActive;
    private OffsetDateTime createdAt;
    private OffsetDateTime updatedAt;

    public Product(
            Long id,
            String productCode,
            String name,
            String category,
            String maker,
            String unit,
            Boolean isActive,
            OffsetDateTime createdAt,
            OffsetDateTime updatedAt
    ) {
        this.id = id;
        this.productCode = productCode;
        this.name = name;
        this.category = category;
        this.maker = maker;
        this.unit = unit;
        this.isActive = isActive;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Long getId() {
        return id;
    }

    public String getProductCode() {
        return productCode;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getMaker() {
        return maker;
    }

    public String getUnit() {
        return unit;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }
}