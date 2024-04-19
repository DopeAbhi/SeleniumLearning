package Selenium;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class Screenshot {

    public static void main(String[] args) throws IOException {

            WebDriver driver = new ChromeDriver();
            //Invoking First Tab
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            driver.get("https://courses.rahulshettyacademy.com/courses/");
            //Example of Xpath Contains
            String courseName=  driver.findElements(By.xpath("//div[@class='course-listing-title']")).get(0).getText();
//      Invoking New Tab
//      driver.switchTo().newWindow(WindowType.TAB);  //Open new Tab on Same Browser
            driver.switchTo().newWindow(WindowType.WINDOW); //Open new browser window

            Set<String> list=driver.getWindowHandles();
            Iterator<String> it=list.iterator();
            String parent_Window_ID=it.next();
            String child_Window_ID=it.next();

            driver.switchTo().window(child_Window_ID);
            driver.get("https://rahulshettyacademy.com/angularpractice/");
            driver.findElement(By.xpath("//input[@name='name']")).sendKeys(courseName);

            //Take Partial Screenshot or Screenshot of element
            WebElement name=driver.findElement(By.xpath("//input[@name='name']"));
          File file=  name.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file,new File("/Users/abhayverma/Desktop/Logo.png"));


        //Take Full Screenshot

        File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File("/Users/abhayverma/Desktop/ss.png"));


        //Find Dimesions of the Element (Height and Width)

        System.out.println(name.getRect().getDimension().getHeight());
        System.out.println(name.getRect().getDimension().getWidth());

            System.out.println(courseName);

            driver.quit();
        }


}
