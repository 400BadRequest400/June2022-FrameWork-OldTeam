package winsenPracticeTest;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import winsenPractice.HomePage;

public class HomePageTest extends CommonAPI {

    @Test
    public void searchFieldTakesInputTest(){
        HomePage homePage = new HomePage(getDriver());

        homePage.clickHomeButton();

    }
}
