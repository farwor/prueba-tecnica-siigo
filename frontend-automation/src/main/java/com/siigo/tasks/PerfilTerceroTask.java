package com.siigo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.waits.Wait;
import static com.siigo.pageobjects.PerfilTerceroPage.PROFILE;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class PerfilTerceroTask implements Task {

    public static PerfilTerceroTask perfilCreado() {
        return new PerfilTerceroTask();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Wait.until(the(PROFILE), isVisible()).forNoMoreThan(25).seconds()
        );
    }
}
