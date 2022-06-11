package winsenPractice;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Iterator;
import java.util.Set;

public class CreateNewAccountPage extends CommonAPI {

    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[5]/a[1]")
    public WebElement createAccountButtonElement;
    @FindBy(xpath = "//*[@id='u_8_b_4g']")
    public WebElement firstNameFieldElement;


    public CreateNewAccountPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void setCreateNewAccount(){
        click(createAccountButtonElement);
        Set<String> widows  =  getDriver().getWindowHandles();
        Iterator<String> it =widows.iterator();
        String parentID = it.next();
        String childID = it.next();
        getDriver().switchTo().window(childID);
        type(firstNameFieldElement,"winsen");

    }
}
