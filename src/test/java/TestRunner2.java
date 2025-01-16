import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\dell\\IdeaProjects\\AppiumTestNew\\src\\test\\resources\\LoginApp.feature",
        glue ="Stepdefinitions" ,
        plugin = {"pretty","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
        monochrome = true
)

public class TestRunner2 {
}
