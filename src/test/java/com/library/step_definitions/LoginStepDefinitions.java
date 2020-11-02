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
    public void user_logs_in_as_a_student() throws InterruptedException {
        loginPage.login();
        Thread.sleep(3000);
    }
    @Then("user should see dashboard page")
    public void user_should_see_dashboard_page() {
        String expected = "Book Management";
        String actual = loginPage.getPageVerificationText().trim();

        Assert.assertEquals("Title is not correct!", expected, actual);
        System.out.println("I see the Dashboard page!");
        System.out.println(actual);
        Driver.closeDriver();
    }
}
