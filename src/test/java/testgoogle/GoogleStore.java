package testgoogle;

import base.CommonAPI;
import google.HomePage;
import org.testng.annotations.Test;

public class GoogleStore extends CommonAPI {

    @Test
    public void testGoogleStoreProducts(){
        HomePage homePage = new HomePage(getDriver());

        homePage.clickOnGoogleStore();
        waitFor(3);
        String expectedResult = "Shop by category.";
        homePage.getTextForShopByCategory();




    }
}
