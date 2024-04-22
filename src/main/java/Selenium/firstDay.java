package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstDay {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.chorme","/Users/abhayverma/Downloads/chromedriver");

     WebDriver driver = new ChromeDriver();
//        WebDriver driver = new SafariDriver();
        driver.get("https://www.flipkart.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());
        driver.wait(3000);
        driver.close();
        driver.quit();
    }
}
