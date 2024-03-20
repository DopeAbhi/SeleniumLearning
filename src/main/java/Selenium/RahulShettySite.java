package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class RahulShettySite {
    public static void main(String[] args) throws InterruptedException {


        //System.setProperty("webdriver.chrome.chorme","/Users/abhayverma/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //Refer Notes for more details
        //Basic Automation
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys("Abhay");
        driver.findElement(By.name("inputPassword")).sendKeys("Abhay");
        driver.findElement(By.id("chkboxOne")).click();
        driver.findElement(By.id("chkboxTwo")).click();
        driver.findElement(By.className("submit")).click();

     //   String errorMessage=driver.findElement(By.className("error")).getText();
        //Using CSS selector
        String errorMessage=driver.findElement(new By.ByCssSelector("p.error")).getText();
        System.out.println(errorMessage);

        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Abhay");
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("Abhay@yopmail.com");
        driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).clear();
        driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("Test@yopmail.com");
        driver.findElement(By.xpath("//form/input[3]")).sendKeys("123456782");
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        System.out.println( driver.findElement(By.cssSelector("form p")).getText());

        driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("chkboxOne")).click();
        driver.findElement(By.id("chkboxTwo")).click();
        driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
        driver.close();
        driver.quit();
    }


}