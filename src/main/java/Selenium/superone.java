package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class superone {


    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://quickdev3.super.one/webapp/login");
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("mvb1_11@gmail.com");
        driver.findElement(By.cssSelector(".input-btn")).click();
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Test@123");
        driver.findElement(By.className("login-btn-gold")).click();
        driver.findElement(By.cssSelector(".ml-3.user-avatar.cursor-pointer"));

    }
}
