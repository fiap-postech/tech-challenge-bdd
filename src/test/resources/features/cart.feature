Feature: Product

  @CartTest
  Scenario: Create a Cart
    Given I am authenticated
    And I already identified myself as customer
    When I try to create a new cart
    Then I should receive a success from cart flow

  @CartTest
  Scenario Outline: Add Product to a Cart
    Given I am authenticated
    And I have a product from category "<category>" and a quantity <quantity>
    When I try to add a product in cart
    Then I should receive response status <httpStatus> with schema "<schema>"

    Examples:
      | category   | quantity | httpStatus | schema                  |
      | SANDWICH   | 2        | 200        | CartResponseSchema.json |
      | DESSERT    | 3        | 200        | CartResponseSchema.json |
      | SIDE_DISH  | 3        | 200        | CartResponseSchema.json |
      | SIDE_DISH  | -1       | 400        | APIErrorSchema.json     |
      | BEVERAGE   | 4        | 200        | CartResponseSchema.json |
      | BEVERAGE   |          | 400        | APIErrorSchema.json     |
      | COMBO      | 2        | 200        | CartResponseSchema.json |
      | COMBO      | 2        | 400        | APIErrorSchema.json     |

  @CartTest
  Scenario: Cart Checkout
    Given I am authenticated
    And I already identified myself as customer
    When I try to create a new cart
    Then I should receive a success from cart flow
