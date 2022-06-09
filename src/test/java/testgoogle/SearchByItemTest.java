package testgoogle;

import base.CommonAPI;
import google.SearchResultPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchByItemTest extends CommonAPI {

    @Test(enabled = true)
    public void searchIphone13ProMax(){
        SearchResultPage searchResultPage = new SearchResultPage(getDriver());
        searchResultPage.searchElement("iphone 13 pro max");
        waitFor(3);

        String expectedpageText = "Shop iphone 13 pro max";
        Assert.assertEquals(expectedpageText, searchResultPage.getSearchItemText());

    }

    @Test(enabled = true)
    public void searchMacBookPro(){
        SearchResultPage searchResultPage = new SearchResultPage(getDriver());
        searchResultPage.searchElement("macbook pro");
        waitFor(3);

        String expectedpageTitle = "Shop macbook pro";
        Assert.assertEquals(expectedpageTitle, searchResultPage.getSearchItemText());

    }

    @Test(enabled = true)
    public void searchWindowsLaptop(){
        SearchResultPage searchResultPage = new SearchResultPage(getDriver());
        searchResultPage.searchElement("windows laptop");
        waitFor(3);

        String expectedpageTitle = "Shop windows laptop";
        Assert.assertEquals(expectedpageTitle, searchResultPage.getSearchItemText());

    }

    @Test(enabled = true)
    public void searchWindowsLaptopSurface(){
        SearchResultPage searchResultPage = new SearchResultPage(getDriver());
        searchResultPage.searchElement("ipad air");
        waitFor(3);

        String expectedpageTitle = "Shop ipad air";
        Assert.assertEquals(expectedpageTitle, searchResultPage.getSearchItemText());

    }
}
