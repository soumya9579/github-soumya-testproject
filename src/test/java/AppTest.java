import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;


public class  AppTest {

    static AppiumDriver driver;

    public static void main(String[] args) throws MalformedURLException {
        openMobileApp();

    }

    public static void openMobileApp() throws MalformedURLException {


        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("appium:deviceName", "SORA's S23 FE");
        dc.setCapability("appium:udid", "RF8N61W6JYY");
        dc.setCapability("platformName", "Android");
        dc.setCapability("appium:platformVersion", "12");
        dc.setCapability("appium:automationName", "UiAutomator2");
        dc.setCapability("appium:app", "/Users/dell/IdeaProjects/AppiumTestNew/src/Apk/org-simple-clinic-staging.apk");
        URL url = new URL("http://127.0.0.1:4723/");
        driver = new AppiumDriver(url,dc);
        System.out.println("Application started");



//        Thread.sleep(20000);
//        driver.findElement(new By.ByXPath("//android.widget.Button[@resource-id=\"org.simple.clinic.staging:id/nextButton\"]")).click();

    }
}
