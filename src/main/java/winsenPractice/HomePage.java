package winsenPractice;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends CommonAPI {

@FindBy(css = "body > header > div > a > button")
private WebElement homeButtonElement;

    public HomePage(WebDriver driver){
        PageFactory.initElements(driver,this);

    }

    public void clickHomeButton(){
        click(homeButtonElement);
    }
}
