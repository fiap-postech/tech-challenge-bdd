package br.com.fiap.tech.challenge.bdd.response;

import java.math.BigDecimal;

public class PurchaseItemResponse {

    private ProductResponse product;
    private Integer quantity;
    private BigDecimal price;
    private BigDecimal discount;

    public ProductResponse getProduct() {
        return product;
    }

    public PurchaseItemResponse setProduct(ProductResponse product) {
        this.product = product;
        return this;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public PurchaseItemResponse setQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public PurchaseItemResponse setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public PurchaseItemResponse setDiscount(BigDecimal discount) {
        this.discount = discount;
        return this;
    }
}
