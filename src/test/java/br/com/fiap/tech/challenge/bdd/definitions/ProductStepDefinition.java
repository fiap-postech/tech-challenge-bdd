package br.com.fiap.tech.challenge.bdd.definitions;

import br.com.fiap.tech.challenge.bdd.request.Auth;
import br.com.fiap.tech.challenge.bdd.request.CreateProductRequest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import java.math.BigDecimal;

import static br.com.fiap.tech.challenge.bdd.Constants.SERVICE_HOST;
import static io.restassured.RestAssured.given;

public class ProductStepDefinition {

    private static final String CREATE_PRODUCT_ENDPOINT = SERVICE_HOST + "/product";

    private CreateProductRequest createProductRequest;

    @Given("I have a name {string}, a description {string}, a price {double}, an image {string} and category {string}")
    public void i_have_a_name_a_description_a_price_an_image_and_category(String name,
                                                                          String description,
                                                                          Double price,
                                                                          String image,
                                                                          String category) {
        createProductRequest = new CreateProductRequest()
                .setName(name)
                .setDescription(description)
                .setPrice(BigDecimal.valueOf(price))
                .setImage(image)
                .setCategory(category);
    }

    @When("I try to create a new product")
    public void i_try_to_create_a_new_product() {
        ResponseStepDefinition.response = given()
                .contentType("application/json")
                .auth()
                .oauth2(Auth.token)
                .body(createProductRequest)
            .when()
                .post(CREATE_PRODUCT_ENDPOINT);
    }

}
