package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class Multi_Window_Invoking
{

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        //Invoking First Tab
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://courses.rahulshettyacademy.com/courses/");
        //Example of Xpath Contains
      String courseName=  driver.findElements(By.xpath("//div[@class='course-listing-title']")).get(0).getText();
//      Invoking New Tab
//      driver.switchTo().newWindow(WindowType.TAB);  //Open new Tab on Same Browser
      driver.switchTo().newWindow(WindowType.WINDOW); //Open new browser window

      Set<String> list=driver.getWindowHandles();
        Iterator<String> it=list.iterator();
        String parent_Window_ID=it.next();
        String child_Window_ID=it.next();

        driver.switchTo().window(child_Window_ID);
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.findElement(By.xpath("//input[@name='name']")).sendKeys(courseName);


        System.out.println(courseName);
        Thread.sleep(3000);
      driver.quit();
    }

}
