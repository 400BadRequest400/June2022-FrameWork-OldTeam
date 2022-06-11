package winsenDemoQaTest;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import winsenDemoQa.CheckBoxPage;

public class CheckBoxTest extends CommonAPI {

    @Test
    public void checkBoxTestField(){
        CheckBoxPage checkBoxPage= new CheckBoxPage(getDriver());
        checkBoxPage.checkHomeCheckBox();
        //Assert.assertTrue(checkBoxIsChecked(checkBoxPage.displayedMessageElement));


    }
}
