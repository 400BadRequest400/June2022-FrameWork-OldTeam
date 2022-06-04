package pages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends CommonAPI {

    @FindBy(css = ".a-form-label")
    private WebElement headerText;

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public String getHeaderText(){
        return getElementText(headerText);
    }
}
