Feature: Manufacture

  @ManufactureTest
  Scenario: Create a purchase
    Given I am authenticated
    And a payment was confirmed
    Then a purchase should be created for this payment
    And that purchase exists in manufacture

  @ManufactureTest
  Scenario Outline: Update a manufacture status
    Given I am authenticated
    And I have a manufacture created
    When I try to update a manufacture status to newStatus "<newStatus>"
    Then I should receive response status <httpStatus> with schema "<schema>"

    Examples:
      | newStatus    | httpStatus | schema                         |
      | MADE         | 400        | APIErrorSchema.json            |
      | DELIVERED    | 400        | APIErrorSchema.json            |
      | MAKING       | 200        | ManufactureResponseSchema.json |
      | MAKING       | 400        | APIErrorSchema.json            |
      | WAITING_MAKE | 400        | APIErrorSchema.json            |
      | DELIVERED    | 400        | APIErrorSchema.json            |
      | MADE         | 200        | ManufactureResponseSchema.json |
      | MADE         | 400        | APIErrorSchema.json            |
      | MAKING       | 400        | APIErrorSchema.json            |
      | WAITING_MAKE | 400        | APIErrorSchema.json            |
      | DELIVERED    | 200        | ManufactureResponseSchema.json |
      | WAITING_MAKE | 400        | APIErrorSchema.json            |
      | MAKING       | 400        | APIErrorSchema.json            |
      | MADE         | 400        | APIErrorSchema.json            |
      | DELIVERED    | 400        | APIErrorSchema.json            |