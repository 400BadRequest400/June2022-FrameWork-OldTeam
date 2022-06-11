package winsenDemoQa;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TextBoxPage extends CommonAPI {

    @FindBy(xpath = "//*[@id='item-0']/span")
    public WebElement textBoxButtonElement;
    @FindBy(id = "userName")
    public WebElement fullNameFiledElement;
    @FindBy(id = "userEmail")
    public WebElement userEmailFieldElement;
    @FindBy (id="currentAddress")
    public WebElement currentAddressFieldElement;
    @FindBy(id = "permanentAddress")
    public WebElement permanentAddressFieldElement;
    @FindBy(id = "submit")
    public WebElement submitButtonElement;
    @FindBy(id="output")
    public WebElement messageOutputElement;

    public TextBoxPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    public void typeOnTextBoxField(){
        click(textBoxButtonElement);
        type(fullNameFiledElement,"Winsen");
        type(userEmailFieldElement,"winsen@email.com");
        type(currentAddressFieldElement,"99 QATester Street");
        type(permanentAddressFieldElement,"99 QATester Street");
//        JavascriptExecutor js = (JavascriptExecutor)getDriver();
//        js.executeScript("arguments[0].click();",submitButtonElement);




    }

}
