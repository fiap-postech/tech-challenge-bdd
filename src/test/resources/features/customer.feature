Feature: Customer

  @CustomerTest
  Scenario Outline: Create a new Customer
    Given I am authenticated
    And I have a name "<name>", a document "<document>", an email "<email>"
    When I try to create a new customer
    Then I should receive response status <httpStatus> with schema "<schema>"

    Examples:
      | name                            | document    | email                                         | httpStatus | schema                      |
      | Maite Leticia Novaes            | 86484640807 | maite-novaes74@pobox.com                      | 201        | CustomerResponseSchema.json |
      | Ayla Aparecida Galvao           | 95124558969 | aylaaparecidagalvao@predilectasorocaba.com.br | 400        | APIErrorSchema.json         |
      | Danilo Sergio Kaique dos Santos | 65284066936 | danilosergiodossantos                         | 400        | APIErrorSchema.json         |
      |                                 | 65284066936 | danilosergiodossantos                         | 400        | APIErrorSchema.json         |