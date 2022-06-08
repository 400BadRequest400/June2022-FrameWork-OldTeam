package winsenPractice;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends CommonAPI {

    @FindBy(xpath = "")
    private WebElement signIn;


    public SignInPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void setSignIn(){
        click(signIn);
    }
}
