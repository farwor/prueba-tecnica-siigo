package com.siigo.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import net.serenitybdd.screenplay.targets.Target;

public class ElementoVisible implements Question<Boolean> {

    private final Target elemento;
    private final int tiempo;

    public ElementoVisible(Target elemento, int tiempo) {
        this.elemento = elemento;
        this.tiempo = tiempo;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        WaitUntil.the(elemento, isVisible())
                .forNoMoreThan(tiempo).seconds();
        return true;
    }

    public static ElementoVisible of(Target elemento, int tiempo) {
        return new ElementoVisible(elemento, tiempo);
    }
}