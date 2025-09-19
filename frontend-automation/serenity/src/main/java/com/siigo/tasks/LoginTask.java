package com.siigo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.Wait;

import static com.siigo.pageobjects.LoginPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class LoginTask implements Task {

    private final String correo;
    private final String contrasena;

    public LoginTask(String correo, String contrasena) {
        this.correo = correo;
        this.contrasena = contrasena;
    }

    public static LoginTask digitarCredenciales(String email, String password) {
        return new LoginTask(email, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Wait.until(the(EMAIL), isVisible()).forNoMoreThan(25).seconds(),
                Enter.theValue(correo).into(EMAIL),
                Enter.theValue(contrasena).into(PASSWORD),
                Click.on(LOGIN_BUTTON)
        );
    }
}
