package winsenDemoQaTest;

import base.CommonAPI;
import org.testng.annotations.Test;
import winsenDemoQa.RadioButtonPage;

public class RadioButtonTest extends CommonAPI {

    @Test
    public void radioButtonCheck(){
        RadioButtonPage radioButtonPage=new RadioButtonPage(getDriver());
        radioButtonPage.radioButtonClick();

    }
}
