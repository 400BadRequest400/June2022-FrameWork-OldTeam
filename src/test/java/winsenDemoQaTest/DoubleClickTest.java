package winsenDemoQaTest;

import base.CommonAPI;
import org.testng.annotations.Test;
import winsenDemoQa.DoubleClickPage;

public class DoubleClickTest extends CommonAPI {

    @Test
    public void doubleClickTest(){
        DoubleClickPage doubleClickPage = new DoubleClickPage(getDriver());
        doubleClickPage.doubleClickButtonTest();
    }
}
