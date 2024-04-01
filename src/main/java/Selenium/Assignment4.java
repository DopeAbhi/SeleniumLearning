package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Assignment4 {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

     //   String action= Keys.chord(Keys.CONTROL,Keys.ENTER);
        driver.findElement(By.xpath("//a[@href='/windows']")).click();
        driver.findElement(By.xpath("//a[@href='/windows/new']")).click();

      Set<String> window=  driver.getWindowHandles();
        Iterator<String> iterator=window.iterator();
        String childId=iterator.next();
        String parentId=iterator.next();
        driver.switchTo().window(parentId);
        System.out.println(driver.findElement(By.xpath("//div[@class='example'] //h3")).getText());
        driver.switchTo().window(childId);
        System.out.println(driver.findElement(By.xpath("//div[@class='example'] //h3")).getText());
        driver.quit();


    }
}
