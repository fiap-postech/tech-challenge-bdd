package br.com.fiap.tech.challenge.bdd.request;

public class CreateCartRequest {

    private String customerId;

    public String getCustomerId() {
        return customerId;
    }

    public CreateCartRequest setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }
}