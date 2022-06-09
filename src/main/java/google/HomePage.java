package google;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends CommonAPI {

    public HomePage(WebDriver driver){
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//body/div[1]/div[2]/div[1]/img[1]")
    private WebElement logoSign;

    @FindBy(xpath = "//a[contains(text(),'About')]")
    private WebElement aboutGoogle;

    @FindBy(xpath = "//a[contains(text(),'Store')]")
    private WebElement googleStore;

    @FindBy(xpath = "//div[contains(text(),'Shop by category.')]")
    private WebElement shopByCategory;



    public void clickOnGoogleLogoSign(){
        click(logoSign);
    }
    public void clickOnGoogleAboutButton(){
        click(aboutGoogle);
    }
    public void clickOnGoogleStore(){
        click(googleStore);
    }
    public String shopByCategorytext(){
        return getElementText(shopByCategory);
    }



}
