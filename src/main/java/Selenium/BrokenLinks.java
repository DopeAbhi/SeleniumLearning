package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class BrokenLinks {
    public static void main(String[] args) throws IOException {

        WebDriver driver=new SafariDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        List<WebElement> list =driver.findElements(By.cssSelector("li[class='gf-li'] a"));
        SoftAssert asert= new SoftAssert();
        for (WebElement element : list) {
            //Get Status Code of request from network tab
            HttpURLConnection conn = (HttpURLConnection) new URL(element.getAttribute("href")).openConnection();
            conn.setRequestMethod("HEAD");
            conn.connect();
            System.out.println(conn.getResponseCode());



                asert.assertTrue(conn.getResponseCode()<400,"Broken Link Name="+element.getText());


        }
        asert.assertAll();

        driver.quit();


    }
}
