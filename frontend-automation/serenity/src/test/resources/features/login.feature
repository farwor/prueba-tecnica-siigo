#language: es
Característica: Iniciar sesión en la pagina web Siigo

  @login
  Esquema del escenario: Ingresar a la pagina web de Siigo
    Dado que un usuario ingresa las credenciales "<usuario>", "<contrasena>" para loguearse
    Cuando el sistema valide las credenciales
    Entonces le muestra el mensaje "<validacion>", "<mensaje>"

    Ejemplos:
      | usuario                         | contrasena               | validacion | mensaje                        |
      | retoautomationsiigo@yopmail.com | T4b4ck0ff1c3P455w0rd658* | exitosa    | Inicio                         |
      | mike@yopmail.com                | T4b4ck0ff1c3P455w0rd658* | fallida    | Usuario o contraseña inválidos |