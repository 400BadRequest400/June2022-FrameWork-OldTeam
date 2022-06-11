package winsenPractice;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ForgotPasswordPage extends CommonAPI {

    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[3]")
    public WebElement forgotPasswordElement;
    @FindBy(css = "._9nq2.marginBottom16px")
    public WebElement forgetPasswordMessageElement;
    public ForgotPasswordPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void setForgotPassword() {
        click(forgotPasswordElement);

    }
}
