package winsenPracticeTest;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import winsenPractice.ForgotPasswordPage;

public class ForgotPasswordTest extends CommonAPI {

    @Test
    public void clickForgetPasswordButton(){
        ForgotPasswordPage forgotPasswordPage= new ForgotPasswordPage(getDriver());
        forgotPasswordPage.setForgotPassword();
        String forgetPasswordButtonMessage="Please enter your email or mobile number to search for your account.";
        Assert.assertEquals(forgetPasswordButtonMessage,getElementText(forgotPasswordPage.forgetPasswordMessageElement));
    }
}
