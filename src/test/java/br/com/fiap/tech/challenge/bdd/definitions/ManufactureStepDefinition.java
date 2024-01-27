package br.com.fiap.tech.challenge.bdd.definitions;

import br.com.fiap.tech.challenge.bdd.actors.ManufactureActor;
import br.com.fiap.tech.challenge.bdd.request.Auth;
import br.com.fiap.tech.challenge.bdd.response.ManufactureResponse;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import static br.com.fiap.tech.challenge.bdd.Constants.SERVICE_HOST;
import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;

public class ManufactureStepDefinition {

    private static final String UPDATE_MANUFACTURE_STATUS_ENDPOINT = SERVICE_HOST + "/manufacture/%s/%s";

    private ManufactureResponse manufactureResponse;

    @Given("I have a manufacture created")
    public void i_have_a_manufacture_created() {
        var result = ManufactureActor.getManufactureById(PurchaseStepDefinition.purchaseResponse.getId());

        assertThat(result).isNotNull().isPresent();
        result.ifPresent(m -> manufactureResponse = m);
    }

    @When("I try to update a manufacture status to newStatus {string}")
    public void i_try_to_update_a_manufacture_status_to_new_status(String status) {
        ResponseStepDefinition.response = given()
                .contentType("application/json")
                .auth()
                .oauth2(Auth.token)
            .when()
                .put(String.format(UPDATE_MANUFACTURE_STATUS_ENDPOINT, manufactureResponse.getId(), status));
    }


}
