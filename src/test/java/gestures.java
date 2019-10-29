import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;

public class gestures extends Base{

    public static void main(String[] args) throws Exception {


        AndroidDriver<AndroidElement> driver = capabilities();

        driver.findElement(MobileBy.xpath("//android.widget.TextView[@content-desc=\"Views\"]")).click();
        //Tap
        TouchAction t = new TouchAction(driver);
        WebElement expendableList = driver.findElement(MobileBy.xpath("//android.widget.TextView[@content-desc=\"Expandable Lists\"]"));
        t.tap(TapOptions.tapOptions().withElement(ElementOption.element(expendableList))).perform();

    }
}
