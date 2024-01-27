package br.com.fiap.tech.challenge.bdd.response;

public class ManufactureItemResponse {

    private ProductResponse product;
    private Integer quantity;

    public ProductResponse getProduct() {
        return product;
    }

    public ManufactureItemResponse setProduct(ProductResponse product) {
        this.product = product;
        return this;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public ManufactureItemResponse setQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }
}
