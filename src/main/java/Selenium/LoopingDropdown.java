package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoopingDropdown {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.spicejet.com/");
        driver.manage().window().maximize();
        Thread.sleep(4000);

        System.out.println(driver.findElement(By.xpath("//div[contains(text(),'1 Adult')]")).getText());
        driver.findElement(By.xpath("//div[contains(text(),'1 Adult')]")).click();
        Thread.sleep(2000);
        int i = 0;
        while (i < 3) {
            driver.findElement(By.cssSelector("div[class='css-1dbjc4n r-k8qxaj r-d9fdf6'] div:nth-child(1) div:nth-child(2) div:nth-child(3)")).click();
            i++;

        }
        driver.quit();
    }
}
