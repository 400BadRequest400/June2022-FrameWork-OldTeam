package winsenDemoQa;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckBoxPage extends CommonAPI {
    @FindBy(xpath="//span[contains(text(),'Check Box')]")
    public WebElement checkBoxButtonElement;
    @FindBy(css = ".rct-checkbox")
    public WebElement checkBoxHomeElement;
    @FindBy(xpath = "//*[@id='result']/span[1]")
    public WebElement displayedMessageElement;

    public CheckBoxPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void checkHomeCheckBox(){
        click(checkBoxButtonElement);
       // click(checkBoxHomeElement);
    }
}
