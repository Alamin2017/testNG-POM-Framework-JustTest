package utilities;
import envPage.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class ElementActions extends BaseClass {

    public static WebElement findAndWaitForElement(By locator) {

        WebElement element = null;
        try{
            WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(50));

//            element=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(locator)));

//            element=wait.until(ExpectedConditions.presenceOfElementLocated(locator));

            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            element=driver.findElement(locator);

//          element=wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        }
        catch (Exception e)
        {
            System.out.println("Element not found & Try to find valid locator ");
            e.printStackTrace();
        }
        return element;
    }
    public static void clickElement(By locator) {
        findAndWaitForElement(locator).click();
    }
    public static void enterText(By locator,String text) {
        findAndWaitForElement(locator).sendKeys(text);
    }
    public static String getText(By locator) {
        return findAndWaitForElement(locator).getText();
    }
    public static void scrollElement(By locator) {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        WebElement element=findAndWaitForElement(locator);
        js.executeScript("arguments[0].scrollIntoView();",element);
    }
    public static boolean visibilityElement(By locator)
    {
        return findAndWaitForElement(locator).isDisplayed();
    }
}
