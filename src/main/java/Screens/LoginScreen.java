package Screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import javax.swing.text.Element;

public class LoginScreen {



    @AndroidFindBy(id = "Test Login")
    protected WebElement TestLogin ;

    @AndroidFindBy(id = "Submit")
    protected WebElement Submit ;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"org.simple.clinic.staging:id/facilityNameTextView\" and @text=\"CHC Lake Lemongrass\"]")
    protected WebElement FacilityName ;

}
