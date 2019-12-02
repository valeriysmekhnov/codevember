package horizontalslider;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
/***
 * @author Vsmekhnov
 */
public class HorisontalSliderTests extends BaseTests {

    @Test
    public void testHorizontalSlider(){
        var moveHorisSlider = homePage.clickHorizontalSlider();
        moveHorisSlider.selectHorizontalSlider();
        moveHorisSlider.changeSlider("" + Keys.ARROW_RIGHT + Keys.ARROW_RIGHT);
        assertTrue(moveHorisSlider.getResult().equals("1"));
        moveHorisSlider.changeSlider("" + Keys.ARROW_RIGHT + Keys.ARROW_RIGHT);
        assertTrue(moveHorisSlider.getResult().equals("2"));
        moveHorisSlider.changeSlider("" + Keys.ARROW_LEFT + Keys.ARROW_LEFT);
        assertTrue(moveHorisSlider.getResult().equals("1"));
        moveHorisSlider.changeSlider("" + Keys.ARROW_LEFT + Keys.ARROW_LEFT);
        assertTrue(moveHorisSlider.getResult().equals("0"));
    }
}
