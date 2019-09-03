package runner;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public enum AppiumDrivers {
    ANDROID, IOS;

    private DesiredCapabilities dc;
    private AppiumDriver ad;

    AppiumDrivers() {
        switch (this.name()){
            case "ANDROID":
                dc.setPlatform(Platform.ANDROID);


            case "IOS":
                dc.setPlatform(Platform.IOS);


            default:
                dc.setCapability(MobileCapabilityType.APPLICATION_NAME,"Calc");
                try {
                    ad = new AndroidDriver(new URL("http://EPM-TSTF:deddde0a-3e18-4d0d-b504-d132a1089df5@mobilecloud.epam.com:8080/wd/hub"), dc);
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                    ad = null;
                }

        }
    }

    public AppiumDriver getDriver(){
        return ad;
    }

}
