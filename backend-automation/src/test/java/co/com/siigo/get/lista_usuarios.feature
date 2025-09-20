@get
Feature: Obtener lista de usuarios desde ReqRes API

  Background:
    * url urlBase
    * header x-api-key = 'reqres-free-v1'

  @obtenerUsuarios
  Scenario: Obtener usuarios con paginación
    Given path '/users'
    When method get
    Then status 200
    And print response
    And match response.data == '#[]'