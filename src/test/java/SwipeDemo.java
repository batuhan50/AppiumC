import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;

import java.time.Duration;

public class SwipeDemo extends Base{


    public static void main(String[] args) throws Exception{


        AndroidDriver<AndroidElement> driver = capabilities();

        driver.findElement(MobileBy.xpath("//android.widget.TextView[@content-desc=\"Views\"]")).click();
        driver.findElement(MobileBy.xpath("//android.widget.TextView[@content-desc=\"Date Widgets\"]")).click();
        driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
        driver.findElement(MobileBy.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"9\"]")).click();
        TouchAction t = new TouchAction(driver);
        //long press //on element //2 sec// move to another element and you release
        WebElement first = driver.findElement(MobileBy.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"15\"]"));
        WebElement second = driver.findElement(MobileBy.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"45\"]"));
        t.longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(first)).withDuration(Duration.ofSeconds(2))).moveTo(ElementOption.element(second)).release().perform();

    }


}
