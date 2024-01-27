package br.com.fiap.tech.challenge.bdd.dto;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;


public class ProductInputDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = 1464909268054662495L;

    private String id;
    private String name;
    private String description;
    private String image;
    private BigDecimal price;
    private BigDecimal fullPrice;
    private BigDecimal discount;
    private Boolean enabled;

    public String getId() {
        return id;
    }

    public ProductInputDTO setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public ProductInputDTO setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public ProductInputDTO setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getImage() {
        return image;
    }

    public ProductInputDTO setImage(String image) {
        this.image = image;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public ProductInputDTO setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public BigDecimal getFullPrice() {
        return fullPrice;
    }

    public ProductInputDTO setFullPrice(BigDecimal fullPrice) {
        this.fullPrice = fullPrice;
        return this;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public ProductInputDTO setDiscount(BigDecimal discount) {
        this.discount = discount;
        return this;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public ProductInputDTO setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
}
