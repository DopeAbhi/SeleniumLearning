package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class Addtocart {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        String [] searchName={"Cucumber","Tomato"};
        List<WebElement> names = driver.findElements(By.cssSelector("h4.product-name"));
        List itemNeededList= Arrays.asList(searchName);
        for (int i = 0; i < names.size(); i++) {
            String na= names.get(i).getText();
            String name= Arrays.toString(na.split(" "));

            if (itemNeededList.contains(name)) {
                System.out.println("test");
                driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();



            }
        }
    driver.quit();
    }

}