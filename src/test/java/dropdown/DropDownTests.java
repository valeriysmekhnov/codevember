package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;
import static  org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

/***
 * @author Vsmekhnov
 */
public class DropDownTests extends BaseTests {

    @Test
    public void testSelectOption(){
        var dropDownPage = homePage.clickDropdown();
        String option = "Option 1";
        dropDownPage.selectFromDropdown(option);
        var selectedOptions = dropDownPage.getSelectedOption();
        assertEquals(selectedOptions.size(),1,"Incorrect number of selection");
        assertTrue(selectedOptions.contains(option),"Option not selected");

    }
}
