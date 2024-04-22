package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;

import java.time.Duration;


public class locatorsPractice {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new SafariDriver();

        String name="Abhay";
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //Refer Notes for more details
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        String password=getPassword(driver);
        Thread.sleep(2000);
        driver.findElement(By.id("inputUsername")).sendKeys(name);
        driver.findElement(By.name("inputPassword")).sendKeys(password);
        driver.findElement(By.cssSelector("input[value='rmbrUsername']")).click();
        driver.findElement(By.cssSelector("input[value='agreeTerms']")).click();
        driver.findElement(By.className("submit")).click();
        Thread.sleep(2000);

       String message= driver.findElement(By.tagName("p")).getText();
        System.out.println(message);
        Assert.assertEquals(message, "You are successfully logged in.");

       Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText()
       ,"Hello "+name+",");
       driver.findElement(By.xpath("//button[text()='Log Out']")).click();
        driver.close();
        driver.quit();
    }

    public static String getPassword(WebDriver driver) throws InterruptedException
    {
        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
//Please use temporary password 'rahulshettyacademy' to Login.
        String text= driver.findElement(By.cssSelector("form p")).getText();
       String [] text1 = text.split("'");
        String password=text1[1].split("'")[0];
        driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();

        return password;


    }

}
