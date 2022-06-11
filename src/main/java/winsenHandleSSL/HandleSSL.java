package winsenHandleSSL;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleSSL extends CommonAPI {



    public HandleSSL(WebDriver driver) {

        //PageFactory.initElements(driver, this);

    }

    public void InvokeURLandHandleSSL() {

        ChromeOptions options = new ChromeOptions();
        options.setAcceptInsecureCerts(true);
        new ChromeDriver(options);





    }


    }

