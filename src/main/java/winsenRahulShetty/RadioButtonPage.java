package winsenRahulShetty;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RadioButtonPage extends CommonAPI {
    @FindBy(css = "input[value='radio2']")
    public WebElement radioButtonTwoElement;
     public RadioButtonPage(WebDriver driver){
         PageFactory.initElements(driver,this);
     }

    public void clickRadioButtonTwo() {
        click(radioButtonTwoElement);
    }

}
