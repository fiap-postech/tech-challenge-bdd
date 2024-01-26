package br.com.fiap.tech.challenge.bdd.definitions;

import br.com.fiap.tech.challenge.bdd.request.Auth;
import br.com.fiap.tech.challenge.bdd.request.CreateCustomerRequest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import static br.com.fiap.tech.challenge.bdd.Constants.SERVICE_HOST;
import static io.restassured.RestAssured.given;


public class CustomerStepDefinition {

    private static final String CREATE_CUSTOMER_ENDPOINT = SERVICE_HOST + "/customer";

    private CreateCustomerRequest createCustomerRequest;

    @Given("I have a name {string}, a document {string}, an email {string}")
    public void i_have_a_name_a_document_an_email(String name, String document, String email) {
        createCustomerRequest = new CreateCustomerRequest();

        createCustomerRequest.setDocument(document);
        createCustomerRequest.setName(name);
        createCustomerRequest.setEmail(email);
    }

    @When("I try to create a new customer")
    public void i_try_to_create_a_new_customer() {
        ResponseStepDefinition.response = given()
                .contentType("application/json")
                .auth()
                .oauth2(Auth.token)
                .body(createCustomerRequest)
            .when()
                .post(CREATE_CUSTOMER_ENDPOINT);
    }
}
