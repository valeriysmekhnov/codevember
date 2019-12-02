package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

/***
 * @author Vsmekhnov
 */
public class HorizontalSliderPage {

    private WebDriver driver;

    private By slider = By.tagName("input");
    private By result = By.id("range");

    public HorizontalSliderPage(WebDriver driver) {this.driver = driver;}

    public void selectHorizontalSlider(){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(slider)).perform();
    }

    public void changeSlider(String text){
        driver.findElement(slider).sendKeys(text);
    }

    public String getResult(){
        return driver.findElement(result).getText();
    }
}
