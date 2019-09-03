package pageobject;

import org.openqa.selenium.support.PageFactory;

import static runner.Driver.getDriver;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(getDriver(), this);
    }
}
