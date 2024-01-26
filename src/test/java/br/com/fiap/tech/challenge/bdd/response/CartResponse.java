package br.com.fiap.tech.challenge.bdd.response;

import java.math.BigDecimal;
import java.util.List;

public class CartResponse {

    private String id;

    private BigDecimal total;

    private BigDecimal subtotal;

    private BigDecimal discount;

    private CustomerResponse customer;

    private List<CartItemResponse> items;

    public String getId() {
        return id;
    }

    public CartResponse setId(String id) {
        this.id = id;
        return this;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public CartResponse setTotal(BigDecimal total) {
        this.total = total;
        return this;
    }

    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public CartResponse setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
        return this;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public CartResponse setDiscount(BigDecimal discount) {
        this.discount = discount;
        return this;
    }

    public CustomerResponse getCustomer() {
        return customer;
    }

    public CartResponse setCustomer(CustomerResponse customer) {
        this.customer = customer;
        return this;
    }

    public List<CartItemResponse> getItems() {
        return items;
    }

    public CartResponse setItems(List<CartItemResponse> items) {
        this.items = items;
        return this;
    }
}