package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class Assignment3
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("password")).sendKeys("learning");
        driver.findElement(By.xpath("//span[contains(text(), 'User')]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
        driver.findElement(By.id("okayBtn")).click();
         WebElement element= driver.findElement(By.cssSelector("div[class='form-group'] select"));
         element.click();
        Select dropDown=new Select(element);
        dropDown.selectByVisibleText("Consultant");
        driver.findElement(By.cssSelector("#terms")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("#terms")).isSelected());
        driver.findElement(By.name("signin")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));

        List<WebElement> elem= driver.findElements(By.cssSelector(".btn.btn-info"));
        System.out.println(elem.size());
        for (int i=0; i<elem.size(); i++)
        {

            elem.get(i).click();
        }

        driver.findElement(By.cssSelector(".nav-link.btn.btn-primary")).click();
        Thread.sleep(2000);

        driver.quit();


    }
}
