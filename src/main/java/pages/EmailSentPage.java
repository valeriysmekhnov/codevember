package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/***
 * @author Vsmekhnov
 */
public class EmailSentPage {

    private WebDriver driver;
    private By sMessage = By.id("content");

    public EmailSentPage(WebDriver driver){
       this.driver = driver;
    }

    public String getMessage(){
        return driver.findElement(sMessage).getText();
    }
}
