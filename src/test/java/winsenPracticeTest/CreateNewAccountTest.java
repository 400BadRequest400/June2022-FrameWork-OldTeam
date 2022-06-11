package winsenPracticeTest;

import base.CommonAPI;
import org.testng.annotations.Test;
import winsenPractice.CreateNewAccountPage;

public class CreateNewAccountTest extends CommonAPI {

    @Test
    public void createNewAccount(){
        CreateNewAccountPage createNewAccountPage = new CreateNewAccountPage(getDriver());
        createNewAccountPage.setCreateNewAccount();

    }
}
