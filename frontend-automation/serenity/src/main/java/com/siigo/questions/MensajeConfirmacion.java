package com.siigo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;
import static org.junit.Assert.assertEquals;

public class MensajeConfirmacion implements Question<String> {

    private final Target target;
    private final String mensajeEsperado;

    public MensajeConfirmacion(Target target, String mensajeEsperado) {
        this.target = target;
        this.mensajeEsperado = mensajeEsperado;
    }

    public static MensajeConfirmacion conElTexto(Target target, String mensajeEsperado) {
        return new MensajeConfirmacion(target, mensajeEsperado);
    }

    @Override
    public String answeredBy(Actor actor) {
        String mensajeActual = Text.of(target).answeredBy(actor);
        assertEquals(mensajeEsperado, mensajeActual);
        return mensajeActual;
    }
}
