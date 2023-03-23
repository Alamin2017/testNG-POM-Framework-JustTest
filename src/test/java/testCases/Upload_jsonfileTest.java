package testCases;
import envPage.BaseClass;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.io.FileReader;
import java.io.IOException;

public class Upload_jsonfileTest extends BaseClass {

    @Test
    public void test_uploading() throws InterruptedException {
        driver.get("https://demoqa.com/upload-download");
        Thread.sleep(3000);
        WebElement button =driver.findElement(By.xpath("//input[@id='uploadFile']"));
        Actions act=new Actions(driver);
        act.moveToElement(button).click().perform();
        Thread.sleep(5000);
    }
    @Test(dataProvider = "dp")
    public void login_ddt(String data) throws InterruptedException {
        String users[]=data.split(",");
        driver.get("https://demo.nopcommerce.com/login");
        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(users[0]);
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(users[1]);
        driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
        Thread.sleep(2000);
    }
    @DataProvider(name = "dp")
    public String[] readJson() throws IOException, ParseException
    {
        JSONParser jsonParser=new JSONParser();
        FileReader reader=new FileReader(System.getProperty("user.dir")+"\\jsonfiles\\testdata.json");

        Object obj=jsonParser.parse(reader);

        JSONObject userloginsJsonobj=(JSONObject) obj;

        JSONArray userloginsArray=(JSONArray) userloginsJsonobj.get("userlogins");

        String arr[]=new String[userloginsArray.size()];

        for(int i=0;i<userloginsArray.size();i++)
        {
            JSONObject users=(JSONObject) userloginsArray.get(i);
            String user=(String) users.get("username");
            String pwd=(String) users.get("password");
            arr[i]=user+","+pwd;
        }
        return arr;
    }

}
