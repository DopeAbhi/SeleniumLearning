package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class WebdriverScope {

    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        System.out.println( driver.findElements(By.tagName("a")).size());


        WebElement footerdriver=driver.findElement(By.id("gf-BIG")); //Limiting Web Drive Scope
        System.out.println(footerdriver.findElements(By.tagName("a")).size());
        WebElement columndriver=footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul")); //Child Traverse best example
       List<WebElement> link= columndriver.findElements(By.tagName("a"));
       for(int i=1; i<link.size(); i++)
       {
           String keyboardaction= Keys.chord(Keys.COMMAND,Keys.ENTER); // Keyboard Keys Handler
           link.get(i).sendKeys(keyboardaction);
           WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(3));
           wait.until(ExpectedConditions.numberOfWindowsToBe(i+1));

       }

     Set<String> it= driver.getWindowHandles();
       Iterator <String> wind=it.iterator();

       while (wind.hasNext()){
            driver.switchTo().window(wind.next());
            System.out.println(driver.getTitle());

        }




        driver.quit();




    }
}