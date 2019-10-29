import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.CapabilityType;

public class UIAutomatorTest extends Base{


    public static void main(String[] args) throws Exception{

        AndroidDriver <AndroidElement>driver= capabilities();
        driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
        driver.findElementByAndroidUIAutomator("text(\"Animation\")").click();

        //Validate clickable feature for all options
        System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size());
    }
}
