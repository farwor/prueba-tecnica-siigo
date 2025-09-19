package com.siigo.pageobjects;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {
    public static final Target EMAIL = Target.the("campo correo electrónico")
            .locatedBy("#siigoSignInName");

    public static final Target PASSWORD = Target.the("campo de contraseña")
            .locatedBy("#siigoPassword");

    public static final Target LOGIN_BUTTON = Target.the("botón continuar")
            .locatedBy("#siigoNext");

    public static final Target HOME_MESSAGE = Target.the("mensaje de inicio")
            .locatedBy("//div[contains(text(), ' Inicio ')]");

    public static final Target ERROR_MESSAGE = Target.the("mensaje de error")
            .locatedBy("(//p[contains(text(), 'Usuario o contraseña inválidos')])[2]");

    public static final Target LOADER = Target.the("loader")
            .locatedBy("#working");

    public LoginPage() {
    }
}
