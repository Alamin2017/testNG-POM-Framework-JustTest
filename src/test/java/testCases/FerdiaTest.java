package testCases;

import com.fasterxml.jackson.databind.ser.Serializers;
import envPage.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FerdiaTest extends BaseClass {

    @Test
    public void test_ferdia() throws InterruptedException {

        driver.get("https://test.sharebus.co/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='btn sb-btn-lg sb-btn-secondary rounded-pill py-1 px-3 fw-normal']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("brainstation23@yopmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Pass@1234");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(10000);

        driver.findElement(By.xpath("//div[@class='text-start']//img[@alt='joiner']")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[2]/div/span")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[normalize-space()='Continue']")).click();
        Thread.sleep(5000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement shareBus = driver.findElement(By.xpath("//span[normalize-space()='Set up a Sharebus']"));
        js.executeScript("arguments[0].scrollIntoView();", shareBus);
        Thread.sleep(4000);
        shareBus.click();

        WebElement departure = driver.findElement(By.xpath("//input[@id='startPoint']"));
        Thread.sleep(2000);
        departure.sendKeys("Oslo");
        Thread.sleep(2000);
        departure.sendKeys(Keys.DOWN);
        Thread.sleep(2000);
        departure.sendKeys(Keys.ENTER);
        Thread.sleep(2000);

        WebElement destination = driver.findElement(By.xpath("//input[@id='destination']"));
        Thread.sleep(2000);
        destination.sendKeys("Kolbotn");
        Thread.sleep(2000);
        destination.sendKeys(Keys.DOWN);
        Thread.sleep(2000);
        destination.sendKeys(Keys.ENTER);
        Thread.sleep(2000);

        WebElement switch_return = driver.findElement(By.xpath("//label[@for='returnTripswitch']"));
        js.executeScript("arguments[0].scrollIntoView();", switch_return);
        Thread.sleep(2000);
        switch_return.click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@placeholder='Departure Date']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/table/tbody/tr[1]/td[7]/span")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div[1]/div/form/div[1]/div[3]/div[1]/div[1]/div/div[2]/span/input")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[normalize-space()='Continue']")).click();
        Thread.sleep(10000);

        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div[1]/div/div[1]/div[1]/button[2]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[normalize-space()='Continue']")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector(".btn.gray-white-bg.ship-gray.btn-discount-size.rounded-end")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/button[2]")).click();
        Thread.sleep(3000);

        WebElement CreateShareBus = driver.findElement(By.xpath("//span[normalize-space()='Create Sharebus']"));
        js.executeScript("arguments[0].scrollIntoView();", CreateShareBus);
        Thread.sleep(3000);
        CreateShareBus.click();


        Thread.sleep(8000);
        driver.findElement(By.xpath("//span[normalize-space()='Publish']")).click();
        Thread.sleep(5000);

        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/form/div[1]/div/input")).sendKeys("pleasure Trip");
        driver.findElement(By.xpath("//p[normalize-space()='Vacation']")).click();
        Thread.sleep(3000);

        WebElement preview_and_publish = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/form/div[5]/button/span[1]"));
        js.executeScript("arguments[0].scrollIntoView();", preview_and_publish);
        Thread.sleep(3000);
        preview_and_publish.click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[normalize-space()='Publish']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/nav/div/ul/li[1]/button")).click();
        Thread.sleep(3000);

    }

}
