package br.com.fiap.tech.challenge.bdd.definitions;

import br.com.fiap.tech.challenge.bdd.request.Auth;
import br.com.fiap.tech.challenge.bdd.request.AuthRequest;
import br.com.fiap.tech.challenge.bdd.response.AuthResponse;
import io.cucumber.java.en.Given;

import static br.com.fiap.tech.challenge.bdd.Constants.SERVICE_HOST;
import static io.restassured.RestAssured.given;

public class AuthStepDefinition {

    private static final String AUTH_ENDPOINT = SERVICE_HOST + "/auth";

    @Given("I am authenticated")
    public void i_am_authenticated() {
        var response = given()
                .contentType("application/json")
                .body(AuthRequest.consumer())
            .when()
                .post(AUTH_ENDPOINT)
            .then()
                .statusCode(200);

        Auth.token = response.extract().as(AuthResponse.class).getAccessToken();
    }
}
