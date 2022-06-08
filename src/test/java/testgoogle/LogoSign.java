package testgoogle;

import base.CommonAPI;
import google.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogoSign extends CommonAPI {


    @Test
    public void testGoogleLogosignButton(){
        HomePage homePage = new HomePage(getDriver());
        homePage.clickOnGoogleLogoSign();
        waitFor(3);
        String expectedResult = "Google";
        Assert.assertEquals(expectedResult, getPageTitle());
    }

}
