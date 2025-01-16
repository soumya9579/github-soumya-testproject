package Stepdefinitions;
import Screens.LoginScreen;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.commons.lang.Validate;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileBrowserType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class LoginStep  extends LoginScreen {

    private static final Logger log = LoggerFactory.getLogger(LoginStep.class);
    public AndroidDriver driver;
    Actions Action;

    @BeforeTest
    public void setup() throws MalformedURLException {
        String appiumServerUrl = "http://127.0.0.1:4723";
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("platformName", "Android");
        dc.setCapability("appium:automationName", "Uiautomator2");
        dc.setCapability("appium:appPackage", "com.android.settings");
        dc.setCapability("appium:appActivity", "com.android.settings.Settings");
        dc.setCapability("appium:app", "/Users/dell/IdeaProjects/AppiumTestNew/Apps/ApiDemos.apk");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), dc);
        dc.setCapability("browserName", "Chrome");
        dc.setCapability(MobileBrowserType.CHROME, MobilePlatform.ANDROID);
        driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);

    }
    @Test

        @Given("user Launched the URL")
        public void UserLanchedtheURL()
        {
            driver.findElement(By.id("com.android.chrome:id/url_bar")).click();
            Action.sendKeys("test login");
            Action.scrollToElement(TestLogin);
        }

       @Then("User enter the credentials")
        public void UserEnterTheCredential()
       {
           driver.findElement(By.id("Username")).click();
           Action.sendKeys("student");
           driver.findElement(By.id("Password")).click();
           Action.sendKeys("Password123");
           Action.click(Submit);
       }

        @And("User launch in the home page")
        public void Userlaunchinthehomepage()
        {
            Validate.isTrue(true,"Logged In Successfully");
        }

        @AfterTest
        public void close()
        {
            driver.quit();
        }
    }

