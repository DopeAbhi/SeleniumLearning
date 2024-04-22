package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class e2e {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        Thread.sleep(3000);
        //Checkboxes
        Assert.assertFalse(driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
        driver.findElement(By.cssSelector("input[name='ctl00$mainContent$chk_friendsandfamily']")).click();
        Thread.sleep(3000);



        //City Drop down
        Assert.assertTrue(driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());

        System.out.println((driver.findElements(By.cssSelector("input[type='checkbox']")).size()));

        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

        driver.findElement(By.xpath("//a[@value='BLR']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();

        Thread.sleep(2000);
        //Calender Current Date Select
        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
        //Calender Status Check
        if  (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
        {
            System.out.println("Its disabled");
        }
        else
        {
            System.out.println("Its Enabled");
        }
        driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
        Thread.sleep(2000);
        driver.quit();
    }
}
