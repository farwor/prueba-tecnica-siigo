@post
Feature: Crear un usuario en ReqRes API

  Background:
    * url urlBase
    * header x-api-key = 'reqres-free-v1'

  @crearUsuario
  Scenario: Crear un usuario exitosamente
    * def body = read('classpath:json/crearUsuario.json')
    Given path '/users'
    And request body
    When method post
    Then status 201
    And print response
    And match response.name == 'John Doe'
    And match response.job == 'Developer'
    And match response.id == '#notnull'
    And match response.createdAt == '#present'