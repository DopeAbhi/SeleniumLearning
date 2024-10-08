package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.time.Duration;

public class Assignment6 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.id("checkBoxOption2")).click();
      String checkboxText=  driver.findElement(By.xpath("//div/fieldset/label/input[@id='checkBoxOption2']/parent::label")).getText();
        WebElement element= driver.findElement(By.id("dropdown-class-example"));
         driver.findElement(By.id("dropdown-class-example")).click();

        String dropdownvalue=checkboxText.toLowerCase();
      Select dropdown=new Select(element);
      dropdown.selectByValue(dropdownvalue);
      driver.findElement(By.id("name")).sendKeys(checkboxText);
      driver.findElement(By.id("alertbtn")).click();
     String alertText= driver.switchTo().alert().getText();
     driver.switchTo().alert().accept();
        Assert.assertTrue(alertText.contains(checkboxText));
        System.out.println(alertText);

      Thread.sleep(3000);
      driver.quit();


    }
}
