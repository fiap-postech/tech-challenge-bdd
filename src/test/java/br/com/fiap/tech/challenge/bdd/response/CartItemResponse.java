package br.com.fiap.tech.challenge.bdd.response;

import java.math.BigDecimal;

public class CartItemResponse {

    private ProductResponse product;

    private int quantity;

    private BigDecimal total;

    private BigDecimal subtotal;

    private BigDecimal discount;

    public ProductResponse getProduct() {
        return product;
    }

    public CartItemResponse setProduct(ProductResponse product) {
        this.product = product;
        return this;
    }

    public int getQuantity() {
        return quantity;
    }

    public CartItemResponse setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public CartItemResponse setTotal(BigDecimal total) {
        this.total = total;
        return this;
    }

    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public CartItemResponse setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
        return this;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public CartItemResponse setDiscount(BigDecimal discount) {
        this.discount = discount;
        return this;
    }
}
