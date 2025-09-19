package com.siigo.stepsdefinitions;

import com.siigo.questions.MensajeConfirmacion;
import com.siigo.interactions.ElementoVisible;
import com.siigo.tasks.LoginTask;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Cuando;

import static com.siigo.pageobjects.LoginPage.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginStepDefintions {

    @Dado("que un usuario ingresa las credenciales {string}, {string} para loguearse")
    public void queUnUsuarioIngresaLasCredencialesParaLoguearse(String usuario, String contrasena) {
        theActorInTheSpotlight().attemptsTo(
                LoginTask.digitarCredenciales(usuario,contrasena)
        );
    }
    @Cuando("el sistema valide las credenciales")
    public void elSistemaValideLasCredenciales() {
        theActorInTheSpotlight().should(
                seeThat(ElementoVisible.of(LOADER,25))
        );
    }

    @Entonces("le muestra el mensaje {string}, {string}")
    public void leMuestraElMensaje(String validacion, String mensaje) {
        theActorInTheSpotlight().should(
                seeThat(MensajeConfirmacion.conElTexto(
                        validacion.equalsIgnoreCase("exitosa") ? HOME_MESSAGE : ERROR_MESSAGE,
                        mensaje
                ))
        );
    }
}