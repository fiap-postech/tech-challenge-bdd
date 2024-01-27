package br.com.fiap.tech.challenge.bdd.dto;

import java.io.Serial;
import java.io.Serializable;

public class CustomerInputDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = -447066642189592390L;

    private String id;
    private String name;
    private String email;
    private String document;
    private boolean enabled;

    public String getId() {
        return id;
    }

    public CustomerInputDTO setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public CustomerInputDTO setName(String name) {
        this.name = name;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public CustomerInputDTO setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getDocument() {
        return document;
    }

    public CustomerInputDTO setDocument(String document) {
        this.document = document;
        return this;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public CustomerInputDTO setEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }
}
