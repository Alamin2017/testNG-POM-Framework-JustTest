package envPage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.*;

public class BaseClass {
    public static WebDriver driver;
    public static String browser = "chrome";
    public static Logger logger = LogManager.getLogger("JustTest");

    @BeforeMethod
    public void initializeDriver() {
        driver = getBrowser(browser);
        driver.manage().window().maximize();
//      logger= LogManager.getLogger("JustTest");
    }

    @AfterMethod
    public void closeDriver() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

    public static WebDriver getBrowser(String browser) {
        if (browser != null) {
            if (browser.equalsIgnoreCase("chrome")) {
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--remote-allow-origins=*");
                options.setCapability("ignore-certificate-errors", true);

                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver(options);
            } else if (browser.equalsIgnoreCase("firefox")) {
                FirefoxOptions options = new FirefoxOptions();
                options.addArguments("--remote-allow-origins=*");
                options.setCapability("ignore-certificate-errors", true);

                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver(options);
            } else {
                EdgeOptions options = new EdgeOptions();
                options.addArguments("--remote-allow-origins=*");
                options.setCapability("ignore-certificate-errors", true);

                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver(options);
            }
        }
        return driver;
    }
}
