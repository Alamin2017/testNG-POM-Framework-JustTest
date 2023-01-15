package testCases;
import envPage.BaseClass;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LoginPage;
public class LoginTest extends BaseClass {

    @Test(priority = 1)
    public void LoginTest_1() throws InterruptedException {
        driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
        LoginPage.enterUsername("patebij@gmail.com");
        LoginPage.enterPassword("test@123");
        LoginPage.clickLogin();
        Thread.sleep(5000);

    }
    @Test(priority = 2)
    public void ProductTest_2() throws InterruptedException {
        driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
        LoginPage.enterUsername("patebij@gmail.com");
        LoginPage.enterPassword("test@123");
        LoginPage.clickLogin();
        HomePage.validateText("My Account");
        HomePage.clickAllLaptopAndNotebooks();
        Thread.sleep(5000);
    }
}