package ramdanePackageTest;

import base.CommonAPI;
import org.testng.annotations.Test;
import ramdanePackage.AmazonPrimePage;

public class AmazonPrimeTest extends CommonAPI {


    @Test
    public void amazonPrimeButton(){
        AmazonPrimePage amazonPrimePage = new AmazonPrimePage(getDriver());

        amazonPrimePage.setAmazonPrime();

    }
}
