package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Test {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
        WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(4));
        driver.get("https://uat.simport.global/");
        driver.findElement(By.id("email")).sendKeys("ananddixit@somanigroup.com");
        driver.findElement(By.cssSelector("[name='password']")).sendKeys("Anand@1777");
        driver.findElement(By.cssSelector(".Login_signin__r2h8X.btn.btn-primary.btn-block")).click();
//        wait.until(ExpectedConditions.elementToBeClickable( driver.findElement(By.xpath("//img[@src='/static/Accordion - menu.svg']"))));
        Thread.sleep(4000);
        driver.findElement(By.cssSelector("img[alt='Logo1']")).click();

       driver.findElement(By.xpath("//img[@src='/static/leads-icon.svg']")).click();
        driver.findElement(By.xpath("//span[@aria-label='JINDAL STEEL & POWER LIMITED']")).click();
        driver.findElement(By.cssSelector(".MuiButtonBase-root.MuiButton-root']")).click();
        driver.findElement(By.xpath("//input[@name='quantity']")).sendKeys("5000");
        Thread.sleep(4000);
        driver.quit();




    }
}
