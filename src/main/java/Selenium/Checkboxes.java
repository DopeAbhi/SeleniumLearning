package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;

public class Checkboxes {


    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new SafariDriver();

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        Thread.sleep(3000);

        Assert.assertFalse(driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
        driver.findElement(By.cssSelector("input[name='ctl00$mainContent$chk_friendsandfamily']")).click();
        Thread.sleep(3000);

        Assert.assertTrue(driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());

        System.out.println((driver.findElements(By.cssSelector("input[type='checkbox']")).size()));
        driver.quit();
    }
}
