package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;
import java.util.stream.Collectors;

public class FilterWebTable {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

String text="Rice";
        driver.findElement(By.id("search-field")).sendKeys(text);
        List<WebElement> list= driver.findElements(By.xpath("//tr/td[1]"));
        List<WebElement> actuallist=list.stream().filter(s->s.getText().contains("Rice")).collect(Collectors.toList());

       // actuallist.forEach(s -> s.equalsIgnoreCase(text));
        Assert.assertEquals(list.size(),actuallist.size());



        driver.quit();
    }
}
