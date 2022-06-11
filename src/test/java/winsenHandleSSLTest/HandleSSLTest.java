package winsenHandleSSLTest;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import winsenHandleSSL.HandleSSL;

public class HandleSSLTest extends CommonAPI {

    @Test
    public void HandleSSLTest() {

        HandleSSL handleSSL = new HandleSSL(getDriver());
        handleSSL.InvokeURLandHandleSSL();
        String expectedPageTitle ="expired.badssl.com";
        Assert.assertEquals(getPageTitle(),expectedPageTitle);


    }
}
