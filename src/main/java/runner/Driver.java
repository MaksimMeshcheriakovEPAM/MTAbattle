package runner;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class Driver {

    private static ThreadLocal<AppiumDriver> driver;

    public static AppiumDriver getDriver() {
        assert driver!=null : "Appium driver not set";
        return driver.get();
    }

    public static void setDriver(URL drvUrl, DesiredCapabilities drvCaps) {
        driver.set(new AppiumDriver(drvUrl, drvCaps));
    }


}
