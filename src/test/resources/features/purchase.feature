Feature: Purchase

  @PurchaseTest
  Scenario: Create a purchase
    Given I am authenticated
    And a payment was confirmed
    Then a purchase should be created for this payment
    And that purchase exists in manufacture

  @PurchaseTest
  Scenario Outline: Update a purchase status
    Given I am authenticated
    And I have a purchase created
    When I try to update a purchase status to newStatus "<newStatus>"
    Then I should receive response status <httpStatus> with schema "<schema>"

  Examples:
    | newStatus | httpStatus | schema                      |
    | MAKING    | 200        | PurchaseResponseSchema.json |
    | MADE      | 200        | PurchaseResponseSchema.json |
    | DELIVERED | 200        | PurchaseResponseSchema.json |