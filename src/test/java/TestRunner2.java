import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/LoginApp.feature",
        glue ="Stepdefinitions" ,
        plugin = {"pretty","html:target/Cucumber-Report"},
        tags = "@test1",

        monochrome = true

)
public class TestRunner2 {
}