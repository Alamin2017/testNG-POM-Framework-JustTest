package testCases;
import envPage.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pageObjects.BS23_Page;
public class BS23_Test extends BaseClass {
    @Test
    public void test_sharebus() throws InterruptedException {

        driver.get("https://test.sharebus.co/");
        Thread.sleep(1000);
        BS23_Page.clickSignInButton();
        Thread.sleep(1000);
        BS23_Page.clickAcceptCookiesButton();
        Thread.sleep(1000);
        BS23_Page.enterEmail("brainstation23@yopmail.com");
        Thread.sleep(1000);
        BS23_Page.enterPassword("Pass@1234");
        Thread.sleep(1000);
        BS23_Page.clickSubmitSignInButton();
        Thread.sleep(1000);
        BS23_Page.clickDropDown();
        Thread.sleep(1000);
        BS23_Page.clickShareLead();
        Thread.sleep(1000);
        BS23_Page.clickContinueButton();
        Thread.sleep(3000);
        BS23_Page.scrollingShareBus();
        Thread.sleep(1000);
        BS23_Page.clickShareBus();
        Thread.sleep(1000);
        BS23_Page.departureValue();
        Thread.sleep(1000);
        BS23_Page.destinationValue();
        Thread.sleep(1000);
        BS23_Page.scrollingSwitchReturn();
        Thread.sleep(1000);
        BS23_Page.clickSwitchReturn();
        Thread.sleep(1000);




    }
}