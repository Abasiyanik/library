package com.library.pages;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.library.utils.ConfigurationReader;
public class LoginPage extends BasePage{

    @FindBy(xpath = "//*[@id=\"inputEmail\"]")
    private WebElement useremail;

    @FindBy(xpath = "//*[@id=\"inputPassword\"]")
    private WebElement password;

  //  @FindBy(css = "[class='alert alert-error']")
 //   private WebElement warningMessage;
/*
    public String getWarningMessageText() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return warningMessage.getText().trim();
    }


 */
    public void login(String usernameEmail, String passwordValue) {
        useremail.sendKeys(usernameEmail);
        password.sendKeys(passwordValue, Keys.ENTER);
    }

    public void login() {
        String userEmail = ConfigurationReader.getProperty("student.email");
        String userPassWord = ConfigurationReader.getProperty("student.password");

        useremail.sendKeys(userEmail);
        password.sendKeys(userPassWord, Keys.ENTER);


}
    public void login(String role) {
        String usernameValue = "";
        String passwordValue = ConfigurationReader.getProperty("password");

        if (role.equalsIgnoreCase("sales manager")) {
            usernameValue = ConfigurationReader.getProperty("salesmanager.username");
        } else if (role.equalsIgnoreCase("driver")) {
            usernameValue = ConfigurationReader.getProperty("driver.username");
        } else {
            usernameValue = ConfigurationReader.getProperty("storemanager.username");
        }

        useremail.sendKeys(usernameValue);
        password.sendKeys(passwordValue, Keys.ENTER);
    }
}
