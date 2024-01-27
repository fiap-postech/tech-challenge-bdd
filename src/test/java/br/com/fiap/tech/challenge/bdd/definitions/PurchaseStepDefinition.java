package br.com.fiap.tech.challenge.bdd.definitions;

import br.com.fiap.tech.challenge.bdd.actors.ManufactureActor;
import br.com.fiap.tech.challenge.bdd.actors.PurchaseActor;
import br.com.fiap.tech.challenge.bdd.actors.TopicActor;
import br.com.fiap.tech.challenge.bdd.dto.PurchaseInputDTO;
import br.com.fiap.tech.challenge.bdd.fixture.Fixture;
import br.com.fiap.tech.challenge.bdd.request.Auth;
import br.com.fiap.tech.challenge.bdd.response.PurchaseResponse;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.time.Duration;

import static br.com.fiap.tech.challenge.bdd.Constants.SERVICE_HOST;
import static br.com.fiap.tech.challenge.bdd.fixture.PurchaseInputDTOFixture.sandwichAndBeveragePurchaseInputDTO;
import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;
import static org.awaitility.Awaitility.await;

public class PurchaseStepDefinition {

    private static PurchaseInputDTO input;
    public static PurchaseResponse purchaseResponse;
    private static final String UPDATE_PURCHASE_STATUS_ENDPOINT = SERVICE_HOST + "/purchase/%s/%s";

    @Given("a payment was confirmed")
    public void a_payment_was_confirmed() {
        input = Fixture.create(sandwichAndBeveragePurchaseInputDTO());
        TopicActor.publish("prd-payment-done-topic", input);
    }

    @Then("a purchase should be created for this payment")
    public void a_purchase_should_be_created_for_this_payment() {
        await()
                .pollInterval(Duration.ofSeconds(2))
                .atMost(Duration.ofSeconds(20))
                .untilAsserted(() -> {
                    var result = PurchaseActor.getPurchaseByPaymentId(input.getPayment().getId());
                    assertThat(result).isNotNull().isPresent();

                    result.ifPresent(p -> purchaseResponse = p);
                });
    }

    @Then("that purchase exists in manufacture")
    public void that_purchase_exists_in_manufacture() {
        await()
                .pollInterval(Duration.ofSeconds(2))
                .atMost(Duration.ofSeconds(20))
                .untilAsserted(() -> {
                    var result = ManufactureActor.getManufactureById(purchaseResponse.getId());
                    assertThat(result).isNotNull().isPresent();
                });
    }

    @And("I have a purchase created")
    public void i_have_a_purchase_created() {
        PurchaseActor.getPurchaseByPaymentId(input.getPayment().getId()).ifPresent(p -> purchaseResponse = p);
    }

    @When("I try to update a purchase status to newStatus {string}")
    public void i_try_to_update_a_purchase_status_to_new_status(String status) {
        ResponseStepDefinition.response = given()
                .contentType("application/json")
                .auth()
                .oauth2(Auth.token)
            .when()
                .put(String.format(UPDATE_PURCHASE_STATUS_ENDPOINT, purchaseResponse.getId(), status));
    }
}
