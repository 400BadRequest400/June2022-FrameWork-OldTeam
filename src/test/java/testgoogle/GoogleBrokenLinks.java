package testgoogle;

import base.CommonAPI;
import google.BrokenLinks;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class GoogleBrokenLinks extends CommonAPI {


    BrokenLinks brokenLin = new BrokenLinks();

    //String url = "https://www.google.com";

    @BeforeMethod
    public void init(){
        brokenLin = PageFactory.initElements(getDriver() ,BrokenLinks.class);
        //getDriver().get(url);
    }

    @Test
    public void testGoogleActivlinks() throws IOException {
        brokenLin.linksbroken();
    }

}
