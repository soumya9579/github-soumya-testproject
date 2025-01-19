package Stepdefinitions;
import Screens.LoginScreen;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileBrowserType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class LoginStep  extends LoginScreen {

    Actions Action;
    public AppiumDriver driver;
    String appiumServerUrl = "http://127.0.0.1:4723";

    @Test

        @Given("user Launched the APP")
        public void UserLaunchedtheApp() throws MalformedURLException, InterruptedException {

        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("appium:deviceName", "SORA's S23 FE");
        dc.setCapability("appium:udid", "RF8N61W6JYY");
        dc.setCapability("platformName", "Android");
        dc.setCapability("appium:platformVersion", "12");
        dc.setCapability("appium:automationName", "UiAutomator2");
        dc.setCapability("appium:app", "/Users/dell/IdeaProjects/AppiumTestNew/src/Apk/org-simple-clinic-staging.apk");
        URL url = new URL("http://127.0.0.1:4723/");
        driver = new AppiumDriver(url,dc);

        Thread.sleep(20000);
        driver.findElement(new By.ByXPath("//android.widget.Button[@resource-id=\"org.simple.clinic.staging:id/nextButton\"]")).click();

    }

       @Then("User able to register the application")
        public void UserAbleToRegisterTheApplication() throws InterruptedException {
           driver.findElement(By.id("org.simple.clinic.staging:id/getStartedButton")).click();
           try {
               Thread.sleep(2000);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
           driver.findElement(By.xpath("//android.widget.TextView[@text=\"AGREE AND CONTINUE\"]")).click();
           Thread.sleep(2000);
           driver.findElement(By.xpath("//android.widget.RadioButton[@resource-id=\"org.simple.clinic.staging:id/countryButton\" and @text=\"India\"]\n")).click();
           Thread.sleep(2000);
           driver.findElement(By.xpath("//android.widget.RadioButton[@resource-id=\"org.simple.clinic.staging:id/stateRadioButton\" and @text=\"Basalt\"]")).click();
           Thread.sleep(2000);
           driver.findElement(By.id("org.simple.clinic.staging:id/phoneNumberEditText")).sendKeys("8144437398");
           Thread.sleep(2000);
           driver.findElement(By.id("org.simple.clinic.staging:id/nextButton")).click();
           Thread.sleep(2000);

       }

        @And("User launch in the home page")
        public void Userlaunchinthehomepage() throws InterruptedException {

//            driver.findElement(By.id("org.simple.clinic.staging:id/fullNameEditText")).sendKeys("QA Soumya");
//            Thread.sleep(2000);
//            driver.findElement(By.id("org.simple.clinic.staging:id/nextButton")).click();
//            Thread.sleep(2000);
            driver.findElement(By.id("org.simple.clinic.staging:id/pinEditText")).sendKeys("1234");
            Thread.sleep(2000);
//            driver.findElement(By.id("org.simple.clinic.staging:id/confirmPinEditText")).sendKeys("1234");
//            Thread.sleep(2000);
//            driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"org.simple.clinic.staging:id/skipButton\"]")).click();
//            Thread.sleep(2000);
//            driver.findElement(By.id("org.simple.clinic.staging:id/searchEditText")).sendKeys("CHC Lake Lemongrass");
//            driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"org.simple.clinic.staging:id/facilityNameTextView\" and @text=\"CHC Lake Lemongrass\"]")).click();
//            driver.findElement(By.id("org.simple.clinic.staging:id/yesButton")).click();
//            driver.findElement(By.id("org.simple.clinic.staging:id/skipButton")).click();
            String ID = driver.findElement(By.id("org.simple.clinic.staging:id/scanSimpleCardButton")).getText();
            Assert.assertEquals(ID,"SCAN ID");

    }
        @AfterTest
        public void close()
        {
            driver.quit();
        }
    }

