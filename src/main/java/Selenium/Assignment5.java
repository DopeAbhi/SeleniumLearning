package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Assignment5 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        //   String action= Keys.chord(Keys.CONTROL,Keys.ENTER);
        driver.findElement(By.xpath("//a[@href='/nested_frames']")).click();
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-middle");
        String text=driver.findElement(By.id("content")).getText();
        System.out.println(text);
        driver.quit();

    }
}
