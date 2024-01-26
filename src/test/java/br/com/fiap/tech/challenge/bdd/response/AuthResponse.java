package br.com.fiap.tech.challenge.bdd.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AuthResponse {

    @JsonProperty("access_token")
    private String accessToken;

    public String getAccessToken() {
        return accessToken;
    }

    public AuthResponse setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
}
