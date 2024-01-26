Feature: Product

  @ProductTest
  Scenario Outline: Create a new Product
    Given I am authenticated
    And I have a name "<name>", a description "<description>", a price <price>, an image "<image>" and category "<category>"
    When I try to create a new product
    Then I should receive response status <httpStatus> with schema "<schema>"

    Examples:
      | name             | description                         | price  | image                                | category   | httpStatus | schema                           |
      | X Salada         | Um belo X Salada                    | 23.50  | http://localhost:8888/lanche.png     |  SANDWICH  | 201        | SingleProductResponseSchema.json |
      | X Salada         | Um belo X Salada                    | -3.50  | http://localhost:8888/lanche.png     |  SANDWICH  | 400        | APIErrorSchema.json              |
      | Bolo Formigueiro | Um bolo irresitível                 | 8.50   | http://localhost:8888/sobremesa.png  |  DESSERT   | 201        | SingleProductResponseSchema.json |
      | Bolo Formigueiro | Um bolo irresitível                 | 8.50   | ./sobremesa.png                      |  DESSERT   | 400        | APIErrorSchema.json              |
      | Bolo Formigueiro | Um bolo irresitível                 | 8.50   |                                      |  DESSERT   | 400        | APIErrorSchema.json              |
      | Mandioca Frita   | Uma bela porção de madioca sequinha | 7.50   | http://localhost:8888/mandioca.png   |  SIDE_DISH | 201        | SingleProductResponseSchema.json |
      |                  | Uma bela porção de madioca sequinha | 7.50   | http://localhost:8888/mandioca.png   |  SIDE_DISH | 400        | APIErrorSchema.json              |
      | Fanta Uva        | Sempre refrescante e saudável       | 5.35   | http://localhost:8888/fanta-uva.png  |  BEVERAGE  | 201        | SingleProductResponseSchema.json |
      | Fanta Uva        |                                     | 5.35   | http://localhost:8888/fanta-uva.png  |  BEVERAGE  | 400        | APIErrorSchema.json              |
