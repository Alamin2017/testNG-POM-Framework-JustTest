package utilities;

import envPage.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ElementActions extends BaseClass {
    public static WebElement findAndWaitForElement(By xpath)
    {
        WebElement element=null;
        try{
            // WebDriverWait wait=new WebDriverWait(driver,30);
            WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
            element=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(xpath)));
        }
        catch (Exception e)
        {
            System.out.println("Element not found & Try to find valid locator ");
        }
        return element;
    }
    public static void clickElement(By element)
    {
        findAndWaitForElement(element).click();
    }
    public static void enterText(By element,String text)
    {
        findAndWaitForElement(element).sendKeys(text);
    }
    public static String getText(By element)
    {
        return findAndWaitForElement(element).getText();
    }
}
