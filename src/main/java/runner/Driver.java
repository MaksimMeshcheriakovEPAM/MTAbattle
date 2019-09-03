package runner;

import io.appium.java_client.AppiumDriver;

public class Driver {

    private static ThreadLocal<AppiumDriver> driver;

    public static AppiumDriver getDriver() {
        assert driver!=null : "Appium driver not set";
        return driver.get();
    }

    public static void setDriver(String platform) throws Exception {
        switch (platform){
            case "Android":
                driver.set(AppiumDrivers.ANDROID.getDriver());
                break;
            case "iOS":
                driver.set(AppiumDrivers.IOS.getDriver());
                break;
            default: throw new Exception("Unknown platform "+platform);
        }

    }


}
