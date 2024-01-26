package br.com.fiap.tech.challenge.bdd.response;

import java.math.BigDecimal;

public class ProductResponse {

    private String id;
    private String name;
    private String description;
    private String image;
    private BigDecimal price;
    private BigDecimal fullPrice;
    private BigDecimal discount;
    private String category;
    private boolean enabled;
    private String type;
    private ProductResponse beverage;
    private ProductResponse sandwich;
    private ProductResponse sideDish;

    public String getId() {
        return id;
    }

    public ProductResponse setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public ProductResponse setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public ProductResponse setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getImage() {
        return image;
    }

    public ProductResponse setImage(String image) {
        this.image = image;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public ProductResponse setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public BigDecimal getFullPrice() {
        return fullPrice;
    }

    public ProductResponse setFullPrice(BigDecimal fullPrice) {
        this.fullPrice = fullPrice;
        return this;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public ProductResponse setDiscount(BigDecimal discount) {
        this.discount = discount;
        return this;
    }

    public String getCategory() {
        return category;
    }

    public ProductResponse setCategory(String category) {
        this.category = category;
        return this;
    }

    public boolean getEnabled() {
        return enabled;
    }

    public ProductResponse setEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public String getType() {
        return type;
    }

    public ProductResponse setType(String type) {
        this.type = type;
        return this;
    }

    public ProductResponse getBeverage() {
        return beverage;
    }

    public ProductResponse setBeverage(ProductResponse beverage) {
        this.beverage = beverage;
        return this;
    }

    public ProductResponse getSandwich() {
        return sandwich;
    }

    public ProductResponse setSandwich(ProductResponse sandwich) {
        this.sandwich = sandwich;
        return this;
    }

    public ProductResponse getSideDish() {
        return sideDish;
    }

    public ProductResponse setSideDish(ProductResponse sideDish) {
        this.sideDish = sideDish;
        return this;
    }
}