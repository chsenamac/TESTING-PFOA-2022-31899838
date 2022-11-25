Feature: Realizar una buqueda que devuelva mas de un resultado, seleccionarlos y verificar
  algunas funcionalidades
  Como usuario quiero buscar con los recursos del sistema un producto que retorne mas de un resultado
  para seleccionarlos y verificar las siguientes funcionalidades
  - Loguearme
  - Buscar 1 articulo que devuelva mas de 1 producto
  - Agregar 2 a la wishlist
  - comprar 1 con cheques
  - comprar 1 con transferencia bancaria

  Background:
    Given Accedo a la pagina "http://automationpractice.com/index.php"

  Scenario: Login
    Given Verifico el estado de login del usuario
    And Doy click en el boton SignIn
    Then Me logueo con los siguientes datos
      | user                             | passwd           |
      | probando.ando.csenamac@gmail.com | probandoando2022 |
    Then Verifico el estado de login del usuario