@put
Feature: Actualizar un usuario en ReqRes API

  Background:
    * url urlBase
    * header x-api-key = 'reqres-free-v1'

  @actualizarUsuario
  Scenario: Actualizar un usuario exitosamente
    * def body = read('classpath:json/actualizarUsuario.json')
    Given path '/users/1'
    And request body
    When method put
    Then status 200
    And print response
    And match response.name == 'Jane Doe'
    And match response.job == 'Designer'