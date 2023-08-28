Feature: Automatizacion de Ecommer E2E
  @ScenariooutExample
  Scenario: Agregar articulos al carrito de compras
    Given un cliente accede a la web de compra
    When  seleciona un articulo
    Then  agrego el articulo al carrito
    And ver el carrito de compras


  Scenario Outline: Dinalizar la compra
    Given pagar las compras del carrito
    When veo formulario
      | <Name> | <Country> | <City> | <Creditcard> | <Month> | <Year> |
    Then Finalizo la compra
    And veo el reporte de la compra
    Examples:
      | Name | Country | City       | Creditcard | Month  | Year |
      | Jose | Ecuador | Esmeraldas | 1122211111 | Agosto | 2023 |