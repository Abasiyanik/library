package com.library.step_definitions;
import com.library.utils.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import com.library.pages.LoginPage;
import com.library.utils.Driver;
public class LoginStepDefinitions {
    LoginPage loginPage = new LoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        String URL = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(URL);
    }
    @When("user logs in as a student")
    public void user_logs_in_as_a_student() {

    }

}
