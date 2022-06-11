package winsenDemoQaTest;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import winsenDemoQa.TextBoxPage;

public class TextBoxTest extends CommonAPI {

    @Test
    public void typeOnTextBoxFieldAndSubmitTest(){
        TextBoxPage textBoxPage = new TextBoxPage(getDriver());
        textBoxPage.typeOnTextBoxField();
        Assert.assertFalse(textBoxPage.isPresent(textBoxPage.messageOutputElement));

    }
}
