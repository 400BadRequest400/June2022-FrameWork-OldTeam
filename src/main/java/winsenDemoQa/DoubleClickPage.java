package winsenDemoQa;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DoubleClickPage extends CommonAPI {
    @FindBy(xpath = "//span[contains(text(),'Buttons')]")
    public WebElement buttonsElement;

    public DoubleClickPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    public void doubleClickButtonTest(){
        click(buttonsElement);
    }
}
