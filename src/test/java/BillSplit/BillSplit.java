package BillSplit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;





public class BillSplit {

    static WebDriver driver;

    @BeforeMethod

    public void setup(){

        driver = new ChromeDriver();
    }

    @Test
    public void bill_csv() throws InterruptedException {

        driver.get("https://csvdemomockappp.bundlewallet.com/splash");
        driver.manage().window().maximize();
       // driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div[2]/div/div[2]/div/div/div/div[1]/div/div[2]/div/div/div")).click();
        Thread.sleep(5000);


    }

    @AfterMethod
    public void teardown() throws InterruptedException  {
        Thread.sleep(5000);
        driver.close();

    }

}
