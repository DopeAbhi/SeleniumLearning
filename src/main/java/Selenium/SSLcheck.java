package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

public class SSLcheck {

    public static void main(String[] args) {
        SafariOptions options = new SafariOptions(); //Accepting SSL certificate
        options.setAcceptInsecureCerts(true);

        WebDriver driver = new SafariDriver(options); //Passing SSL certificate info to BYpass
        driver.get("https://expired.badssl.com/");
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
