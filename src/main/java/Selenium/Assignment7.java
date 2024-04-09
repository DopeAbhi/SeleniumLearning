package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Assignment7
{

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        System.out.println(driver.findElements(By.cssSelector(".table-display tbody tr")).size());
        System.out.println(driver.findElements(By.cssSelector(".table-display tbody tr th")).size());
      List <WebElement> column= driver.findElements(By.cssSelector(".table-display tbody tr:nth-child(3)"));
      for (int i=1; i<=column.size(); i++)
      {

          System.out.println(driver.findElement(By.xpath("//table[@name='courses']/tbody/tr[3]/td["+i+"]")).getText());
      }


        driver.quit();
    }
}
