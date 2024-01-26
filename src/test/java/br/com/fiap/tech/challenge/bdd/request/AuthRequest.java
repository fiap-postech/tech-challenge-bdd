package br.com.fiap.tech.challenge.bdd.request;

public class AuthRequest {

    private String document;

    public String getDocument() {
        return document;
    }

    public AuthRequest setDocument(String document) {
        this.document = document;
        return this;
    }

    public static AuthRequest consumer() {
        return new AuthRequest()
                .setDocument("00000000000");
    }
}
