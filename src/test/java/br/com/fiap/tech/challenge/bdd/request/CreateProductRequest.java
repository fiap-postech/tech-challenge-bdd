package br.com.fiap.tech.challenge.bdd.request;

import java.math.BigDecimal;

public class CreateProductRequest {

    private String type = "single";
    private String name;
    private String description;
    private BigDecimal price;
    private String image;
    private String category;

    public String getType() {
        return type;
    }

    public CreateProductRequest setType(String type) {
        this.type = type;
        return this;
    }

    public String getName() {
        return name;
    }

    public CreateProductRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CreateProductRequest setDescription(String description) {
        this.description = description;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public CreateProductRequest setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public String getImage() {
        return image;
    }

    public CreateProductRequest setImage(String image) {
        this.image = image;
        return this;
    }

    public String getCategory() {
        return category;
    }

    public CreateProductRequest setCategory(String category) {
        this.category = category;
        return this;
    }
}
