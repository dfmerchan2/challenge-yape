package co.com.yape.backend.runner;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/backend/UpdateBooking.feature",
        plugin = {"pretty", "summary"},
        glue = "co.com.yape.backend.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class UpdateBookingRunner {

}