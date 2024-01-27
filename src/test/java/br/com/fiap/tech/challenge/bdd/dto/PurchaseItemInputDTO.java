package br.com.fiap.tech.challenge.bdd.dto;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

public class PurchaseItemInputDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = -3104288659566784282L;

    private ProductInputDTO product;
    private Integer quantity;
    private BigDecimal fullPrice;
    private BigDecimal price;
    private BigDecimal discount;

    public ProductInputDTO getProduct() {
        return product;
    }

    public PurchaseItemInputDTO setProduct(ProductInputDTO product) {
        this.product = product;
        return this;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public PurchaseItemInputDTO setQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    public BigDecimal getFullPrice() {
        return fullPrice;
    }

    public PurchaseItemInputDTO setFullPrice(BigDecimal fullPrice) {
        this.fullPrice = fullPrice;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public PurchaseItemInputDTO setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public PurchaseItemInputDTO setDiscount(BigDecimal discount) {
        this.discount = discount;
        return this;
    }
}
