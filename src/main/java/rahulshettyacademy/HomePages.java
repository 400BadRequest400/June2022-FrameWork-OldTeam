package rahulshettyacademy;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePages extends CommonAPI {

    @FindBy(xpath = "//button[contains(text(),'Home')]")
    private WebElement homeButton;


    public HomePages(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void setHomeButton(){
        click(homeButton);
    }
}
