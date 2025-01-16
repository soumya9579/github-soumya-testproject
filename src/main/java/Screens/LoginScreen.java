package Screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

import javax.swing.text.Element;

public class LoginScreen {


      @AndroidFindBy(id = "Test Login")
    protected WebElement TestLogin ;

    @AndroidFindBy(id = "Submit")
    protected WebElement Submit ;

}
