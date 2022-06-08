package testgoogle;

import base.CommonAPI;
import google.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AboutGoogle extends CommonAPI {

    @Test
    public void testAboutGoogle(){
        HomePage homePage = new HomePage(getDriver());

        homePage.clickOnGoogleAboutButton();
        waitFor(3);
        String expectedPageTitle = "Google - About Google, Our Culture & Company News";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
}
