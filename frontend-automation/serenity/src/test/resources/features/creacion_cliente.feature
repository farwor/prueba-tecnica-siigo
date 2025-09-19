#language: es
Característica: Creacion de un tercero tipo cliente en Siigo

  @creacionCliente
  Esquema del escenario: Crear un cliente con todos los datos obligatorios.
    Dado que un usuario ingresa las credenciales "<usuario>", "<contrasena>" para loguearse
    Cuando el usuario hace clic en Crea un Tercero y selecciona Clientes
    Y completa el formulario de cliente con "<identificacion>", "<nombres>", "<apellidos>", "<nombreComercial>", "<ciudad>", "<direccion>", dando despues guardar
    Entonces el sistema debe redirigir al perfil del cliente creado "<validaciones>"

    Ejemplos:
      | usuario                         | contrasena               | identificacion | nombres        | apellidos | nombreComercial | ciudad  | direccion       | validaciones       |
      | retoautomationsiigo@yopmail.com | T4b4ck0ff1c3P455w0rd658* | 123445678      | Pepito Eduardo | Perez     | Comercial Pepe  | Popayan | Cra 9 # 24AN-21 | Perfil del tercero |