package br.com.fiap.tech.challenge.bdd.request;

public class AddCartItemRequest {

    private String productId;

    private int quantity;

    public String getProductId() {
        return productId;
    }

    public AddCartItemRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }

    public int getQuantity() {
        return quantity;
    }

    public AddCartItemRequest setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }
}