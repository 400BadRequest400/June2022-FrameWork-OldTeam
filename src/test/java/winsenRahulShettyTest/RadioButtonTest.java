package winsenRahulShettyTest;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import winsenRahulShetty.RadioButtonPage;

public class RadioButtonTest extends CommonAPI  {

    // This test validates if Radio Button 2 is clickable

    @Test(enabled = false)
    public void radioBtnTwoTest(){
        RadioButtonPage radioButtonPage = new RadioButtonPage(getDriver());
        radioButtonPage.clickRadioButtonTwo();
        waitFor(6);
        Assert.assertTrue(radioButtonPage.radioButtonTwoElement.isSelected());

    }
}
