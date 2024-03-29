package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Assignment1checkboxes
{
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.id("checkBoxOption1")).click();
        System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
       driver.findElement(By.id("checkBoxOption1")).click();
        System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
       List<WebElement> count= driver.findElements(By.cssSelector("input[type=checkbox]"));
        System.out.println(count.size());
        driver.quit();

    }
}
