package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;

import java.util.List;

/***
 * @author Vsmekhnov
 */
public class BaseTests {

    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","recources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

/**
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());

        driver.manage().window().maximize();

        WebElement inputsLink = driver.findElement(By.linkText("Shifting Content"));
        inputsLink.click();

        WebElement menuElement = driver.findElement(By.linkText("Example 1: Menu Element"));
        menuElement.click();

        List<WebElement> titlesOfMenu = driver.findElements(By.tagName("li"));
        System.out.println(titlesOfMenu.size());

        System.out.println(driver.getTitle());
*/

        homePage = new HomePage(driver);

    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

 /**   public static void main(String[] args) {
        BaseTests test = new BaseTests();
        test.setUp();
*/

}


