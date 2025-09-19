package com.siigo.pageobjects;

import net.serenitybdd.screenplay.targets.Target;

public class PerfilTerceroPage {
    public static final Target PROFILE = Target.the("mensaje de perfil creado")
            .locatedBy("//h2[contains(text(), 'Perfil del tercero')]");

    public PerfilTerceroPage() {
    }
}
