package winsenPractice;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends CommonAPI {

@FindBy(id = "email")
private WebElement emailFieldElement;
@FindBy(id = "pass")
private WebElement passwordFieldElement;
@FindBy(css = "button[type='submit']")
private WebElement logInButtonElement;
@FindBy(css = "div[class='_9ay7']")
public WebElement wrongCredentialMessageElement;

    public SignInPage(WebDriver driver){
        PageFactory.initElements(driver,this);

    }

    public void setSignIn(){
        type(emailFieldElement, "SDET");
        type(passwordFieldElement,"test");
        click(logInButtonElement);

    }
}
