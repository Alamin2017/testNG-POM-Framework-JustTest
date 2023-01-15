package pageObjects;

import org.testng.Assert;
import utilities.ElementActions;

public class HomePage {
    public static String myaccountText="//h2[normalize-space()='My Account']";
    //public static String expectedText="My Account";
    public static String linkLaptopAndNotebooks="//a[normalize-space()='Laptops & Notebooks']";
    public static String linkShowAllLaptopsAndNotebooks="//a[normalize-space()='Show All Laptops & Notebooks']";


    public static void validateText(String expectedText)
    {
        String actualText= ElementActions.getText(myaccountText);
        System.out.println("Text:"+actualText);
        Assert.assertEquals(expectedText,actualText);
    }
    public static void clickAllLaptopAndNotebooks()
    {
        //BrowserUtils.hoverAndClickOnElement(linkLaptopAndNotebooks,linkShowAllLaptopsAndNotebooks);
        ElementActions.clickElement(linkLaptopAndNotebooks);
        ElementActions.clickElement(linkShowAllLaptopsAndNotebooks);
    }
}
