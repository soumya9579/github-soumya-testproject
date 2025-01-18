import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/LoginApp.feature",  //Path to your feature files
        glue ="Stepdefinitions" , // Package containg step definitions
        plugin = {"pretty","html:target/cucumber-reports.html"}, //Report Generation
        monochrome = true
)
public class TestRunner2 {
}