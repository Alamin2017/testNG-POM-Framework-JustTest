package pageObjects;

import org.openqa.selenium.By;
import org.testng.Assert;
import utilities.ElementActions;

public class HomePage {
    public static By myAccountText= By.xpath("//h2[normalize-space()='My Account']");
    //public static String expectedText="My Account";
    public static By linkLaptopAndNotebooks=By.xpath("//a[normalize-space()='Laptops & Notebooks']");
    public static By linkShowAllLaptopsAndNotebooks=By.xpath("//a[normalize-space()='Show All Laptops & Notebooks']");


    public static void validateText(String expectedText)
    {
        String actualText= ElementActions.getText(myAccountText);
        Assert.assertEquals(expectedText,actualText);
    }
    public static void clickAllLaptopAndNotebooks()
    {
        //BrowserUtils.hoverAndClickOnElement(linkLaptopAndNotebooks,linkShowAllLaptopsAndNotebooks);
        ElementActions.clickElement(linkLaptopAndNotebooks);
        ElementActions.clickElement(linkShowAllLaptopsAndNotebooks);
    }
}
