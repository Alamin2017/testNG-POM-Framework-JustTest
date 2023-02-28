package testCases;
import envPage.BaseClass;
import org.testng.annotations.Test;
import pageObjects.BS23_Page;

public class BS23_Test extends BaseClass {

    @Test
    public void test_sharebus() throws InterruptedException {

        driver.get("https://test.sharebus.co/");
        BS23_Page.clickSignInButton();
        BS23_Page.clickAcceptCookiesButton();
        BS23_Page.enterEmail("brainstation23@yopmail.com");
        BS23_Page.enterPassword("Pass@1234");
        BS23_Page.clickSubmitSignInButton();
        BS23_Page.clickDropDown();
        BS23_Page.clickShareLead();
        BS23_Page.clickContinueButton();
        //BS23_Page.scrollingShareBus();
        BS23_Page.clickShareBus();
        BS23_Page.departureValue();
        BS23_Page.destinationValue();
        BS23_Page.scrollingSwitchReturn();
        Thread.sleep(1000);
        BS23_Page.clickSwitchReturn();


    }


}