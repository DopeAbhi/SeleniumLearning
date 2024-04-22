package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocator {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        WebElement webElement=driver.findElement(By.cssSelector("input[name='name']"));
    String text=    driver.findElement(with(By.tagName("label")).above(webElement)).getText();
    WebElement checkText= driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
    driver.findElement(with(By.tagName("input")).toLeftOf(checkText)).click();
Thread.sleep(3000);
        System.out.println(text);
        driver.quit();
    }

}
