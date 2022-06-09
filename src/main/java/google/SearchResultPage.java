package google;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage extends CommonAPI {

    public SearchResultPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")
    private WebElement searchField;

    @FindBy(xpath = "//*[@id=\"tvcap\"]/div/div/div/div/div[1]/h3/span[2]")
    private WebElement searchText;


    //reusable steps
    public void searchElement(String item){
        typeAndEnter(searchField, item);
    }

    public String getSearchItemText(){
        return getElementText(searchText);
    }


}
