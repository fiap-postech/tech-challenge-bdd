package br.com.fiap.tech.challenge.bdd.response;

public class CustomerResponse {

    private String id;
    private String name;
    private String email;
    private String document;
    private boolean enabled;

    public String getId() {
        return id;
    }

    public CustomerResponse setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public CustomerResponse setName(String name) {
        this.name = name;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public CustomerResponse setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getDocument() {
        return document;
    }

    public CustomerResponse setDocument(String document) {
        this.document = document;
        return this;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public CustomerResponse setEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }
}
