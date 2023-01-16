package envPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
public class BaseClass {

    public static WebDriver driver;
    //public static String browser="chrome";
    @BeforeMethod
    public static void initializeDriver()
    {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }
    @AfterMethod
    public static void closeDriver() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}
