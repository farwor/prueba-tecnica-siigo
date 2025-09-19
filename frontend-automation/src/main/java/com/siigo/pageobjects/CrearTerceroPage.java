package com.siigo.pageobjects;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.webdriver.shadow.ByShadow;
import org.openqa.selenium.By;

import static com.siigo.utils.Constantes.AUTOCOMPLETE_WEB;

public class CrearTerceroPage {

    public static final Target IDENTIFICACION = Target.the("campo identificación")
            .located(ByShadow.cssSelector("input.input-identification","siigo-identification-input-web"));

    public static final Target NOMBRES = Target.the("campo nombres")
            .located(ByShadow.cssSelector("input.mdc-text-field__input","siigo-textfield-web[maxlength='50']:nth-of-type(1)"));

    public static final Target APELLIDOS = Target.the("campo apellidos")
            .located(ByShadow.cssSelector("input.mdc-text-field__input","div:nth-of-type(2) > siigo-textfield-web"));

    public static final Target NOMBRE_COMERCIAL = Target.the("campo nombre comercial")
            .located(ByShadow.cssSelector("input.mdc-text-field__input","div:nth-of-type(4) > siigo-textfield-web"));

    public static final Target CLIC_CAMPO_CIUDAD = Target.the("Clien en campo nombre ciudad")
            .located(ByShadow.cssSelector("#labelAutocompleteSelectItemcity",AUTOCOMPLETE_WEB));

    public static final Target CAMPO_CIUDAD = Target.the("campo nombre ciudad")
            .located(ByShadow.cssSelector("input#inputAutocompletecity",AUTOCOMPLETE_WEB));

    public static final Target CIUDAD = Target.the("elegir nombre ciudad")
            .located(ByShadow.cssSelector("#divTDAutocompletecity0",AUTOCOMPLETE_WEB));

    public static final Target DIRECCION = Target.the("campo dirección")
            .located(ByShadow.cssSelector("input.mdc-text-field__input","div:nth-of-type(6) > siigo-textfield-web"));

    public static final Target CARD_CONTACTOS  = Target.the("card contactos")
            .located(By.xpath("//h3[contains(.,'Contactos')]"));

    public static final Target CONTACTOS  = Target.the("contactos")
            .located(By.xpath("//div[@class='clickable collapsible']"));

    public static final Target NOMBRE_CONTACTO = Target.the("nombre contacto")
            .located(ByShadow.cssSelector("input.mdc-text-field__input","siigo-textfield-web[name='FirstName']"));

    public static final Target GUARDAR = Target.the("botón Guardar")
            .located(ByShadow.xpath("//button[contains(@class, 'green')]"));

    private CrearTerceroPage() {}
}