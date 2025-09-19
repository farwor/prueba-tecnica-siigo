package com.siigo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.siigo.pageobjects.CrearTerceroPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class CrearTerceroTask implements Task {

    private final String identificacion;
    private final String nombres;
    private final String apellidos;
    private final String nombreComercial;
    private final String ciudad;
    private final String direccion;

    public CrearTerceroTask(String identificacion, String nombres, String apellidos, String nombreComercial, String ciudad, String direccion) {
        this.identificacion = identificacion;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.nombreComercial = nombreComercial;
        this.ciudad = ciudad;
        this.direccion = direccion;
    }

    public static CrearTerceroTask crear(String identificacion, String nombres, String apellidos, String nombreComercial, String ciudad, String direccion) {
        return new CrearTerceroTask(identificacion, nombres, apellidos, nombreComercial, ciudad, direccion);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Wait.until(the(IDENTIFICACION), isVisible()).forNoMoreThan(25).seconds(),
                Enter.theValue(identificacion).into(IDENTIFICACION),
                Enter.theValue(nombres).into(NOMBRES),
                Enter.theValue(apellidos).into(APELLIDOS),
                Enter.theValue(nombreComercial).into(NOMBRE_COMERCIAL),
                Click.on(CLIC_CAMPO_CIUDAD),
                Enter.theValue(ciudad).into(CAMPO_CIUDAD),
                Click.on(CIUDAD),
                Enter.theValue(direccion).into(DIRECCION),
                Scroll.to(CARD_CONTACTOS),
                Click.on(CARD_CONTACTOS),
                Wait.until(the(NOMBRE_CONTACTO), isVisible()).forNoMoreThan(5).seconds(),
                Enter.theValue(nombres).into(NOMBRE_CONTACTO),
                Scroll.to(GUARDAR).andAlignToBottom(),
                WaitUntil.the(GUARDAR, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(GUARDAR)
         );
    }
}