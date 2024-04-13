package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;

public class Assignment8 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.id("autocomplete")).sendKeys("ind");
        List<WebElement> options=driver.findElements(By.cssSelector(".ui-menu-item-wrapper"));

       for (int i=0; i<options.size(); i++) {

           if (options.get(i).getText().equalsIgnoreCase("Indonesia"))
           {

               options.get(i).click();
           }
       }
        Thread.sleep(2000);
        driver.quit();

    }
}
