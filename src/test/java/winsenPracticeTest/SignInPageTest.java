package winsenPracticeTest;

import base.CommonAPI;
import org.testng.annotations.Test;
import winsenPractice.SignInPage;

public class SignInPageTest extends CommonAPI {

    @Test
    public void testSignIn(){
        SignInPage obj = new SignInPage(getDriver());

        obj.setSignIn();
    }
}
