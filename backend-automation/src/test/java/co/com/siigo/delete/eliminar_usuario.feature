@delete
Feature: Eliminar un usuario en ReqRes API

  Background:
    * url urlBase
    * header x-api-key = 'reqres-free-v1'

  @eliminarUsuario
  Scenario: Eliminar un usuario con id = 1
    Given path 'users/1'
    When method DELETE
    Then status 204
    And print response