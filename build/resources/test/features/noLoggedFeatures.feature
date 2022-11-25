Feature: Automatizacion de pruebas sobre la pagina http://automationpractice.com/index.php
  Como usuario quiero probar las siguientes caracteristicas de la pagina web
  - Buscar items para comparar
  - Comparar dos articulos
  - Probar la funcionalidad Contact Us

  Background:
    Given Accedo a la pagina "http://automationpractice.com/index.php"

  Scenario Outline: Realizo busqueda de productos
    Given Selecciono la barra de busqueda
    When escribo el nombre de <producto>
    Then Verifico que se devuelva un resultado mayor a un producto

    Examples:
      | producto  |
      | "blouses" |
      | "dresses" |

  Scenario: Contact Us
    Given Doy click en el boton ContactUs
    And selecciono el subject heading con la opcion "Customer service"
    And escribo el texto "probando.ando.csenamac@gmail.com" en el campo Email address
    And escribo el texto "Probando ando en automatico desde Uruguay" en el campo Message
    When hago clic en el boton Send
    Then verifico que el mensaje haya sido enviado

  Scenario: Compare
    Given realizo una busqueda del producto "dresses"
    And verifico que el numero de productos sea mayor a 1
    When doy clic en el boton add to compare del primer elemento de la lista
    And doy clic en el boton add to compare del segundo elemento de la lista
    And doy clic en el boton compare
    Then verifico que existan los productos en la lista de comparacion