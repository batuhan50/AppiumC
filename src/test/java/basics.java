import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;


public class basics extends Base{


    public static void main(String[] args)throws Exception {

       AndroidDriver <AndroidElement>driver= capabilities();

       driver.findElement(MobileBy.xpath("//android.widget.TextView[@content-desc=\"Preference\"]")).click();
       driver.findElement(MobileBy.xpath("//android.widget.TextView[@content-desc=\"3. Preference dependencies\"]")).click();
       driver.findElement(MobileBy.id("android:id/checkbox")).click();
       driver.findElement(MobileBy.xpath("(//*[@class='android.widget.RelativeLayout'])[2]")).click();
       driver.findElement(MobileBy.className("android.widget.EditText")).sendKeys("hello");
       driver.findElement(MobileBy.xpath("//*[@text='OK']")).click();

    }

}
