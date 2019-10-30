import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.util.concurrent.TimeUnit;

public class miscelleanous extends Base  {

    public static void main(String[] args) throws Exception{
        AndroidDriver<AndroidElement> driver = capabilities();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(driver.currentActivity());
        System.out.println(driver.getContext());

        //view-Native Hybrid , Webview
        System.out.println(driver.getOrientation());
        System.out.println(driver.isDeviceLocked());


    }
}
