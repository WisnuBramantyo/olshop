package drivers;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class AndroidDriverInit {

  public static AndroidDriver<AndroidElement> driver;

  public static void initialize() {
//    DesiredCapabilities caps = new DesiredCapabilities();
//    String appiumUrl = "http://127.0.0.1:4723/wd/hub/";
//    caps.setCapability("platformName", "Android");
//    caps.setCapability("platformVersion", "10");
//    caps.setCapability("deviceName", "Pixel 5 API 30");
//    caps.setCapability("udid", "emulator-5554");
//    caps.setCapability("app",
//            System.getProperty("user.dir") + File.separator + "APP" + File.separator + "tokopedia-3-184.apk");
//    caps.setCapability("automationName", "UiAutomator2");
//    caps.setCapability("chromedriverExecutable",
//            System.getProperty("user.dir") + File.separator + "chromedriver");
//    caps.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, true);
//    try {
//      driver = new AndroidDriver<>(new URL(appiumUrl), caps);
//      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//    } catch (MalformedURLException e) {
//      e.printStackTrace();
//    }

      DesiredCapabilities caps = new DesiredCapabilities();
      caps.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
      caps.setCapability(MobileCapabilityType.DEVICE_NAME, "device");
      caps.setCapability(MobileCapabilityType.UDID, "emulator-5554");
      caps.setCapability(MobileCapabilityType.APP, "/Users/webe/Downloads/tokopedia-3-184.apk");
      caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
      //additional
      caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 120);
      caps.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, true);
      //inisialisasi Appium
      String url = "http://0.0.0.0:4723/wd/hub";
      try {
        driver = new AndroidDriver<>(new URL(url), caps);
        //implicit wait
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
      } catch (MalformedURLException e) {
        e.printStackTrace();
      }
  }

  public static void quit() {
    driver.quit();
  }

}
