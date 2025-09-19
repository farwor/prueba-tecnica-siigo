package com.siigo.stepsdefinitions.driver;

import io.cucumber.java.Before;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.WebDriver;

public class DriverSetup {

    private WebDriver driver;

    @Before
    public void setUp() {
        driver = Serenity.getDriver();
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("usuario").can(BrowseTheWeb.with(driver));
        OnStage.withCurrentActor(Open.browserOn().thePageNamed("environments.qa"));
    }
}
