package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

/***
 * @author Vsmekhnov
 */
public class KeyPressesPage {

    private WebDriver driver;

    public KeyPressesPage(WebDriver driver) {this.driver = driver;}

    private By inputField = By.id("target");
    private By resultText = By.id("result");

    public void enterText(String text){
        driver.findElement(inputField).sendKeys(text);
    }

    public String getResult(){
        return driver.findElement(resultText).getText();
    }

    public void enterPi(){
        enterText(Keys.chord(Keys.ALT,"2","2","7")+"=3.14");
    }
}
