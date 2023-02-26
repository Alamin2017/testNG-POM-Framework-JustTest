package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.ElementActions;

public class BS23_Page {

    public static By signInButton= By.xpath("//*[@id=\"app\"]/nav/div/ul/li/button");
    public static By acceptCookiesButton=By.xpath("//*[@id=\"app\"]/div[3]/div/button[1]");
    public static By email=By.xpath("//input[@id='email']");
    public static By password=By.xpath("//input[@id='password']");
    public static By submitSignInButton=By.xpath("//button[@type='submit']");
    public static By dropDown=By.xpath("//div[@class='text-start']//img[@alt='joiner']");
    public static By shareLead=By.xpath("/html/body/div[3]/div/ul/li[2]/div/span");
    public static By continueButton=By.xpath("//span[normalize-space()='Continue']");
    public static By shareBus=By.xpath("//span[normalize-space()='Set up a Sharebus']");
    public static By departureLocator=By.xpath("//input[@id='startPoint']");
    public static By destinationLocator=By.xpath("//input[@id='destination']");

    public static By switchReturn=By.xpath("//label[@for='returnTripswitch']");

    public static void clickSwitchReturn()
    {
        ElementActions.clickElement(switchReturn);
    }
    public static void scrollingSwitchReturn()
    {
        ElementActions.scrollingElement(switchReturn);
    }
    public static void destinationValue() throws InterruptedException {

       WebElement destination=ElementActions.findAndWaitForElement(destinationLocator);
        Thread.sleep(2000);
        destination.sendKeys("Kolbotn");
        Thread.sleep(2000);
        destination.sendKeys(Keys.DOWN);
        Thread.sleep(2000);
        destination.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
    }
    public static void departureValue() throws InterruptedException {

        WebElement departure=ElementActions.findAndWaitForElement(departureLocator);
        departure.sendKeys("Oslo");
        Thread.sleep(2000);
        departure.sendKeys(Keys.DOWN);
        Thread.sleep(2000);
        departure.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
    }
    public static void clickShareBus()
    {
        ElementActions.clickElement(shareBus);
    }
    public static void scrollingShareBus() throws InterruptedException {
        ElementActions.scrollingElement(shareBus);
    }
    public static void clickDropDown()
    {
        ElementActions.clickElement(dropDown);
    }
    public static void clickShareLead()
    {
        ElementActions.clickElement(shareLead);
    }
    public static void clickContinueButton()
    {
        ElementActions.clickElement(continueButton);
    }
    public static void clickSignInButton()
    {
        ElementActions.clickElement(signInButton);
    }
    public static void clickAcceptCookiesButton()
    {
        ElementActions.clickElement(acceptCookiesButton);
    }
    public static void enterEmail(String username)
    {
        ElementActions.enterText(email,username);
    }
    public static void enterPassword(String pass)
    {
        ElementActions.enterText(password,pass);
    }
    public static void clickSubmitSignInButton()
    {
        ElementActions.clickElement(submitSignInButton);
    }
}
