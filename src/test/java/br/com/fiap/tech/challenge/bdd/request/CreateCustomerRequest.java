package br.com.fiap.tech.challenge.bdd.request;

public class CreateCustomerRequest {

    private String name;
    private String email;
    private String document;

    public String getName() {
        return name;
    }

    public CreateCustomerRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public CreateCustomerRequest setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getDocument() {
        return document;
    }

    public CreateCustomerRequest setDocument(String document) {
        this.document = document;
        return this;
    }
}
