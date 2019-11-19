package forgotpassword;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.EmailSentPage;
import pages.ForgotPasswordPage;
import static org.testng.Assert.assertTrue;

/***
 * @author Vsmekhnov
 */
public class ForgotPasswordTests extends BaseTests {

    @Test
    public void testRetrievePassword(){
        ForgotPasswordPage forgotPage = homePage.clickForgotPassword();
        forgotPage.enterEmail("tau@email.com");
        EmailSentPage result = forgotPage.clickSubmitButton();
        assertTrue(result.getMessage().contains("Your e-mail's been sent!"),"Restore password failed");
    }


}
