package testRahulPages;

import base.CommonAPI;
import rahulshettyacademy.HomePages;
import org.testng.annotations.Test;

public class HomeButtonTest extends CommonAPI {

    @Test
    public void testHomeClickButton(){

        HomePages logo = new HomePages(getDriver());
        logo.setHomeButton();

    }
}
