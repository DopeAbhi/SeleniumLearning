package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Addtocart {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
        String[] searchName = {"Cucumber", "Tomato", "Beetroot"};

        Addcart(driver, searchName);
        driver.findElement(By.cssSelector("img[alt='Cart']")).click();
        driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
        driver.findElement(By.className("promoCode")).sendKeys("rahulshettyacademy");

        driver.findElement(By.className("promoBtn")).click();

        //Explicit Wait
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("promoInfo")));
        System.out.println(driver.findElement(By.className("promoInfo")).getText());

        driver.quit();
    }


    public static void Addcart(WebDriver driver, String[] searchName) throws InterruptedException {
        int j = 0;

        List<WebElement> names = driver.findElements(By.cssSelector("h4.product-name"));
        List itemNeededList = Arrays.asList(searchName);
        for (int i = 0; i < names.size(); i++) {
            String[] na = names.get(i).getText().split("-");
            String name = na[0].trim();
            if (itemNeededList.contains(name)) {
                System.out.println("test");
                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
                Thread.sleep(3000);
                if (j == searchName.length) {
                    break;
                }
                j++;


            }
        }
    }
}