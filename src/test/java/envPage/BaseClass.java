package envPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import java.util.concurrent.TimeUnit;

public class BaseClass {
    public static WebDriver driver;
    public static String browser="chrome";
    @BeforeMethod
    public void initializeDriver()
    {
        driver=getBrowser(browser);
        driver.manage().window().maximize();
       // driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    @AfterMethod
    public void closeDriver() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
    public static WebDriver getBrowser(String browser)
    {
        if(browser!=null)
        {
            if(browser.equalsIgnoreCase("chrome")){
                WebDriverManager.chromedriver().setup();
                driver=new ChromeDriver();
            }
            else if(browser.equalsIgnoreCase("firefox"))
            {
                WebDriverManager.firefoxdriver().setup();
                driver=new FirefoxDriver();
            }
            else {
                WebDriverManager.edgedriver().setup();
                driver=new EdgeDriver();
            }

        }
        return driver;
    }
}
