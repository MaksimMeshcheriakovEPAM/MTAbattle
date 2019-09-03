package pageobject;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class Calc extends BasePage{

    @AndroidFindBy()
    private WebElement indicator;

    private Keyboard kbd;

}
