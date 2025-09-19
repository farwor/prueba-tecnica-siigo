package com.siigo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static com.siigo.pageobjects.NavegarTopBarPage.CLIENT;
import static com.siigo.pageobjects.NavegarTopBarPage.CREATE;

public class NavegarTopBarTask implements Task {

    public static NavegarTopBarTask navegacion() {
        return new NavegarTopBarTask();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CREATE),
                Click.on(CLIENT)
        );
    }
}
