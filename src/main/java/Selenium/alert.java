package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.cssSelector("[id='name']")).sendKeys("Abhay ");
        driver.findElement(By.xpath("//input[@value='Alert']")).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        driver.quit();
    }
}
