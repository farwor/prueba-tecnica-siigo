package com.siigo.pageobjects;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.webdriver.shadow.ByShadow;

public class NavegarTopBarPage {

    public static final Target CREATE = Target.the("clic en boton crear")
            .located(ByShadow.cssSelector("siigo-button-atom[text='Crear']","siigo-header-molecule[class='data-siigo-five9 hydrated']"));

    public static final Target CLIENT = Target.the("clic en clientes")
            .located(ByShadow.cssSelector("a[data-value='Clientes']","siigo-header-molecule[class='data-siigo-five9 hydrated']"));

    public NavegarTopBarPage() {
    }
}