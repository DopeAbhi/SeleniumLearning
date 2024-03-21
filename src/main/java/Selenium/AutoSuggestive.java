package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

import java.util.List;

public class AutoSuggestive {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new SafariDriver();

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("autosuggest")).sendKeys("i");
        Thread.sleep(2000);
        List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

        for (WebElement option : options) {
            if (option.getText().equalsIgnoreCase("india")) {
                option.click();
            }
        }
    }
}
