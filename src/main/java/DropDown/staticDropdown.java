package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

public class staticDropdown {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new SafariDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        WebElement element=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        driver.manage().window().fullscreen();
        Thread.sleep(5000);
        Select dropdown=new Select(element);
        dropdown.selectByIndex(2);
        System.out.println(dropdown.getFirstSelectedOption().getText());
        dropdown.selectByValue("INR");
        System.out.println(dropdown.getFirstSelectedOption().getText());
        dropdown.selectByVisibleText("USD");
        System.out.println(dropdown.getFirstSelectedOption().getText());
        driver.quit();

    }
}
