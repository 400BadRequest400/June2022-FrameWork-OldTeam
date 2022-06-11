package winsenDemoQa;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RadioButtonPage extends CommonAPI{

    @FindBy(xpath = "//span[contains(text(),'Radio Button')]")
    public WebElement radioButtonElement;

    @FindBy(id="impressiveRadio")
    public WebElement impressiveRadioButtonElement;

    public RadioButtonPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void radioButtonClick(){

        clickWithJS(radioButtonElement);

        //click(impressiveRadioButtonElement);
    }

}
