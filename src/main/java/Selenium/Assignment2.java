package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment2 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Test");
        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("Test@yopamil.com");
        driver.findElement(By.cssSelector("#exampleInputPassword1")).sendKeys("Test@123");
        driver.findElement(By.cssSelector("#exampleCheck1")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("#exampleCheck1")).isSelected());
        WebElement element= driver.findElement(By.id("exampleFormControlSelect1"));
        Select dropdown=new Select(element);
        dropdown.selectByIndex(1);
        driver.findElement(By.id("inlineRadio1")).click();
        driver.findElement(By.cssSelector("input[name='bday']")).click();
        driver.findElement(By.xpath("//input[@value='Submit']")).click();
        System.out.println(driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText());

        Thread.sleep(3000);
        driver.quit();
    }
}
