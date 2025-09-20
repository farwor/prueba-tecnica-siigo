package co.com.siigo;

import com.intuit.karate.junit5.Karate;

class EjecutarTestRunner {

    @Karate.Test
    Karate testAllMethods() {
        return Karate.run("get/lista_usuarios",
                                 "post/crear_usuario",
                                 "put/actualizar_usuario",
                                 "delete/eliminar_usuario").relativeTo(getClass());
    }

    @Karate.Test
    Karate testGet() {
        return Karate.run("get/lista_usuarios.feature").tags("@obtenerUsuarios").relativeTo(getClass());
    }
}