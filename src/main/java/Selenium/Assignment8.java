package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Assignment8 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.id("autocomplete")).sendKeys("ind");
        List<WebElement> options=driver.findElements(By.cssSelector(".ui-menu-item-wrapper"));
       for(WebElement option: options)
        {
            if (option.getText().equalsIgnoreCase("India"))
            {
                option.click();
            }
            
        }
        Thread.sleep(2000);
        driver.quit();

    }
}
