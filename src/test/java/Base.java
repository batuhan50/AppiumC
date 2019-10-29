import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class Base {


    public static AndroidDriver capabilities() throws Exception{


        File f = new File("src");
        File fs = new File(f, "ApiDemos-debug.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_2_API_24");
        capabilities.setCapability(MobileCapabilityType.APP, "/Users/batuhankaraman/IdeaProjects/AppiumTrainning/ApiDemos-debug.apk");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");


       // try {
            AndroidDriver<AndroidElement> driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
       // } catch (MalformedURLException e) {
         //   e.printStackTrace();
    //    }

   return driver;
    }

}
