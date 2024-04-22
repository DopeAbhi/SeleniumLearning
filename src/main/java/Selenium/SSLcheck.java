package Selenium;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

import java.util.HashMap;
import java.util.Map;

public class SSLcheck {
// For More Capabilities-https://chromedriver.chromium.org/capabilities
    public static void main(String[] args) {
        SafariOptions options = new SafariOptions(); //Accepting SSL certificate
        Proxy proxy=new Proxy();// For Setting Proxy
        proxy.setHttpProxy("ipaddress:4444");
        options.setCapability("proxy",proxy);
        Map<String, Object> prefs = new HashMap<String, Object>(); //Set Download path
        prefs.put("download.default_directory", "/directory/path");
       // options.setExperimentaloption("prefs", prefs);
        options.setCapability("prefs", prefs);
        options.setAcceptInsecureCerts(true);

        WebDriver driver = new SafariDriver(options); //Passing SSL certificate info to BYpass
        driver.get("https://expired.badssl.com/");
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
