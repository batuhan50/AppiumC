import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ScrollingDown extends Base{


    public static void main(String[] args) throws Exception{
        AndroidDriver<AndroidElement> driver = capabilities();

        driver.findElement(MobileBy.xpath("//android.widget.TextView[@content-desc=\"Views\"]")).click();
 // Appium is not support direct swipe method
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Webview\"));");



    }
}
