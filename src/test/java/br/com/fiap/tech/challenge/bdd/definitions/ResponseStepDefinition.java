package br.com.fiap.tech.challenge.bdd.definitions;

import io.cucumber.java.en.Then;
import io.restassured.response.Response;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class ResponseStepDefinition {

    public static Response response;

    @Then("I should receive response status {int} with schema {string}")
    public void i_should_receive_response_status_with_schema(Integer status, String schema) {
        response.then()
                .statusCode(status)
                .body(matchesJsonSchemaInClasspath("./schemas/" + schema));
    }
}
