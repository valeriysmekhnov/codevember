package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/***
 * @author Vsmekhnov
 */
public class ForgotPasswordPage {

    private WebDriver driver;
    private By emailField = By.id("email");
    private By submitButton = By.id("form_submit");

    public ForgotPasswordPage(WebDriver driver) {this.driver = driver;}

    public void enterEmail(String email){
        driver.findElement(emailField).sendKeys(email);
    }

    public EmailSentPage clickSubmitButton(){
        driver.findElement(submitButton).click();
        return new EmailSentPage(driver);
    }

}
