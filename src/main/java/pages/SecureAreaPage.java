package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/***
 * @author Vsmekhnov
 */
public class SecureAreaPage {

    private WebDriver driver;
    private By statusAlert = By.id("flash");

    public SecureAreaPage(WebDriver driver){
        this.driver = driver;
    }

    public String getAlerttext(){
        return driver.findElement(statusAlert).getText();

    }
}
