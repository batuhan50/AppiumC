import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.WebElement;

public class DragDropdemo extends Base{


    public static void main(String[] args) throws Exception {


        AndroidDriver<AndroidElement> driver = capabilities();

        driver.findElement(MobileBy.xpath("//android.widget.TextView[@content-desc=\"Views\"]")).click();
        driver.findElement(MobileBy.xpath("//*[@text='Drag and Drop']")).click();
        TouchAction t = new TouchAction(driver);
        WebElement source = driver.findElement(MobileBy.id("io.appium.android.apis:id/drag_dot_1"));
        WebElement destination = driver.findElement(MobileBy.id("io.appium.android.apis:id/drag_dot_3"));
t.longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(source))).moveTo(ElementOption.element(destination)).release().perform();


    }
}
