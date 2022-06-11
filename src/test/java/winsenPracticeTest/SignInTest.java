package winsenPracticeTest;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import winsenPractice.SignInPage;

public class SignInTest extends CommonAPI {
    //log in with wrong credentials, error message must display
    @Test
    public void searchFieldTakesInputTest(){
        SignInPage signInPage = new SignInPage(getDriver());
        signInPage.setSignIn();
        String  wrongCredentialSignInMessage="The email or mobile number you entered isn’t connected to an account. Find your account and log in.";
        Assert.assertEquals(wrongCredentialSignInMessage,getElementText(signInPage.wrongCredentialMessageElement));


    }
}
