package com.siigo.stepsdefinitions;


import com.siigo.questions.MensajeConfirmacion;
import com.siigo.tasks.CrearTerceroTask;
import com.siigo.tasks.NavegarTopBarTask;
import com.siigo.tasks.PerfilTerceroTask;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;

import static com.siigo.pageobjects.PerfilTerceroPage.PROFILE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CrearTerceroStepDefintions {
    @Cuando("el usuario hace clic en Crea un Tercero y selecciona Clientes")
    public void ingresaApatadoClientes() {
        theActorInTheSpotlight().attemptsTo(
                NavegarTopBarTask.navegacion()
        );
    }
    @Y("completa el formulario de cliente con {string}, {string}, {string}, {string}, {string}, {string}, dando despues guardar")
    public void selecciona(String identificacion, String nombres, String apellidos, String nombreComercial,String ciudad, String direccion) throws InterruptedException {
        Thread.sleep(3000);
        theActorInTheSpotlight().attemptsTo(
                CrearTerceroTask.crear(identificacion, nombres, apellidos, nombreComercial, ciudad,  direccion)
        );
    }
    @Entonces("el sistema debe redirigir al perfil del cliente creado {string}")
    public void validarRedireccionPerfilCliente(String validacion){
        theActorInTheSpotlight().attemptsTo(
                PerfilTerceroTask.perfilCreado()
        );
        theActorInTheSpotlight().should(
                seeThat(MensajeConfirmacion.conElTexto(PROFILE,validacion))
        );
    }
}