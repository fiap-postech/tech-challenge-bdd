package br.com.fiap.tech.challenge.bdd.definitions;

import br.com.fiap.tech.challenge.bdd.request.AddCartItemRequest;
import br.com.fiap.tech.challenge.bdd.request.Auth;
import br.com.fiap.tech.challenge.bdd.request.CreateCartRequest;
import br.com.fiap.tech.challenge.bdd.response.CartResponse;
import br.com.fiap.tech.challenge.bdd.response.CustomerResponse;
import br.com.fiap.tech.challenge.bdd.response.ProductResponseList;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

import static br.com.fiap.tech.challenge.bdd.Constants.SERVICE_HOST;
import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class CartStepDefinition {

    private static final String GET_CUSTOMER_ENDPOINT = SERVICE_HOST + "/customer?document=00000000000";
    private static final String CREATE_CART_ENDPOINT = SERVICE_HOST + "/cart";
    private static final String ADD_ITEM_CART_ENDPOINT = SERVICE_HOST + "/cart/%s/items";
    private static final String CLOSE_CART_ENDPOINT = SERVICE_HOST + "/cart/%s/close";
    private static final String GET_PRODUCT_ENDPOINT = SERVICE_HOST + "/product?category=%s";

    private CustomerResponse customerResponse;
    private static Response cartResponse;
    private AddCartItemRequest addCartItemRequest;

    @Given("I already identified myself as customer")
    public void i_already_identified_myself_as_customer() {
        customerResponse = given()
                .contentType("application/json")
                .auth()
                .oauth2(Auth.token)
            .when()
                .get(GET_CUSTOMER_ENDPOINT)
                .then()
                .statusCode(200)
                .body(matchesJsonSchemaInClasspath("./schemas/CustomerResponseSchema.json"))
                .extract()
                .as(CustomerResponse.class);
    }

    @When("I try to create a new cart")
    public void i_try_to_create_a_new_cart() {
        var createCartRequest = new CreateCartRequest()
                .setCustomerId(customerResponse.getId());

        cartResponse = given()
                .contentType("application/json")
                .auth()
                .oauth2(Auth.token)
                .body(createCartRequest)
            .when()
                .post(CREATE_CART_ENDPOINT);
    }

    @Given("I have a product from category {string} and a quantity {int}")
    public void i_have_a_product_from_category_and_a_quantity(String category, Integer quantity) {
        var productResponse = given()
                .contentType("application/json")
                .auth()
                .oauth2(Auth.token)
            .when()
                .get(String.format(GET_PRODUCT_ENDPOINT, category))
                .then()
                .extract()
                .as(ProductResponseList.class)
                .getContent()
                .iterator().next();

        addCartItemRequest = new AddCartItemRequest()
                .setProductId(productResponse.getId())
                .setQuantity(quantity);
    }

    @When("I try to add a product in cart")
    public void i_try_to_add_a_product_in_cart() {
        var cartId = cartResponse
                .then()
                .extract()
                .as(CartResponse.class)
                .getId();

        ResponseStepDefinition.response = given()
                .contentType("application/json")
                .auth()
                .oauth2(Auth.token)
                .body(addCartItemRequest)
            .when()
                .post(String.format(ADD_ITEM_CART_ENDPOINT, cartId));
    }

    @Then("I should receive a success from cart flow")
    public void i_should_receive_a_success_from_cart_flow() {
        cartResponse.then()
                .statusCode(201)
                .body(matchesJsonSchemaInClasspath("./schemas/CartResponseSchema.json"));
    }

    @When("I try to checkout my cart")
    public void i_try_to_checkout_my_cart() {
        var cartId = cartResponse
                .then()
                .extract()
                .as(CartResponse.class)
                .getId();

        ResponseStepDefinition.response = given()
                .contentType("application/json")
                .auth()
                .oauth2(Auth.token)
            .when()
                .post(String.format(CLOSE_CART_ENDPOINT, cartId));
    }

    @Then("I should receive a success response without body from cart flow")
    public void i_should_receive_a_success_response_without_body_from_cart_flow() {
        ResponseStepDefinition.response.then()
                .statusCode(204);
    }
}