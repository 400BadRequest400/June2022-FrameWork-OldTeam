package winsenRahulShettyTest;

import base.CommonAPI;
import org.testng.annotations.Test;
import winsenRahulShetty.OpenNewWindowPage;

public class OpenNewWindowsTest extends CommonAPI {


    @Test
    public void setOpenNewWindowPageTest(){
        OpenNewWindowPage openNewWindowPage = new OpenNewWindowPage(getDriver());
        openNewWindowPage.openNewWindow();


    }


}
