package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsdemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //[id='nav-link-accountList']
        driver.get("https://www.amazon.in/");
        Actions actions=new Actions(driver);
        WebElement elment=driver.findElement(By.cssSelector("[id='nav-link-accountList']"));
    actions.moveToElement(elment).build().perform();
    Thread.sleep(2000);
    //Keyboard Keys Use wit action methods
        actions.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("abhay").doubleClick().build().perform();
        actions.moveToElement(elment).contextClick().build().perform();

        Thread.sleep(2000);
    driver.quit();
    }
}
