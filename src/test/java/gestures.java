import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class gestures extends Base{

    public static void main(String[] args) throws Exception {


        AndroidDriver<AndroidElement> driver = capabilities();
        WebDriverWait wait = new WebDriverWait(driver,10);

        driver.findElement(MobileBy.xpath("//android.widget.TextView[@content-desc=\"Views\"]")).click();
        //Tap
        TouchAction t = new TouchAction(driver);
        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.widget.TextView[@content-desc=\"Expandable Lists\"]")));

        WebElement expendableList = driver.findElement(MobileBy.xpath("//android.widget.TextView[@content-desc=\"Expandable Lists\"]"));
        t.tap(TapOptions.tapOptions().withElement(ElementOption.element(expendableList))).perform();
        driver.findElement(MobileBy.xpath("//android.widget.TextView[@content-desc=\"1. Custom Adapter\"]")).click();
        WebElement peopleName = driver.findElement(MobileBy.xpath("//*[@text='People Names']"));
        t.longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(peopleName)).withDuration(Duration.ofSeconds(2))).release().perform();

    }
}
