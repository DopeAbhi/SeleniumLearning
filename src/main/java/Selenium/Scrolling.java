package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class Scrolling {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(2000);
        js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
       List<WebElement> element= driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
       int sum=0;
       for (int i = 0; i <element.size() ; i++)
        {
            sum= sum+Integer.parseInt(element.get(i).getText());
        }
       String verifyText=driver.findElement(By.cssSelector(".totalAmount")).getText();
       int num=Integer.parseInt(verifyText.split(":")[1].trim());
        Assert.assertEquals(sum,num);
       driver.quit();

    }
}
