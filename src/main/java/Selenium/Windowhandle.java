package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class Windowhandle  {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.findElement(By.cssSelector(".blinkingText")).click();
        //Window Switch

       Set<String> windows= driver.getWindowHandles();
        Iterator<String> it= windows.iterator(); //Grab windows id in parent child order
       String parentId= it.next(); //Grab the Parent Window ID
       String childId= it.next(); //Grab the Child Window ID
        driver.switchTo().window(childId);

       String text= driver.findElement(By.cssSelector(".im-para.red")).getText();
        String id=driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0].trim();

        driver.switchTo().window(parentId);
        driver.findElement(By.cssSelector("#username")).sendKeys(id);
        driver.findElement(By.cssSelector("#password")).sendKeys("learning");
        driver.findElement(By.xpath("//label[@class='customradio'][2]")).click();
        //Explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#okayBtn")));

        driver.findElement(By.cssSelector("#okayBtn")).click();
        driver.findElement(By.cssSelector("#terms")).click();
        driver.findElement(By.cssSelector("#signInBtn")).click();
        Thread.sleep(3000);
        driver.quit();



    }
}
