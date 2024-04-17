package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

public class WebTableSorting {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        driver.findElement(By.cssSelector(".table thead tr th:nth-child(1)")).click();
      List<WebElement>list= driver.findElements(By.cssSelector(".table tbody tr td:nth-child(1)"));

      //Sorting List and Validatig the List
      List<String> actual=list.stream().map(s->s.getText()).collect(Collectors.toList());
  List<String> sorted=    actual.stream().sorted().collect(Collectors.toList());

        Assert.assertTrue(actual.equals(sorted));

        List<String> price;

        //Custom Selenium Methods and Pagination`
do {

    List<WebElement>list2= driver.findElements(By.cssSelector(".table tbody tr td:nth-child(1)"));

 price = list2.stream().filter(s -> s.getText().contains("Chocolate")).map(s -> getveggiePrice(s)).collect(Collectors.toList());
    price.forEach(a -> System.out.println(a));
if (price.size()<1)
{
    driver.findElement(By.cssSelector("[aria-label='Next']")).click();
}

}while (price.size()<1);

        //My Impelmentation

//        List<String> actuallist = new ArrayList<String>();
//      for (int i = 0; i < list.size() ; i++) {
//            actuallist.add(list.get(i).getText());
//
//        }
//      Thread.sleep(2000);
//
//      List<String> newlist= actuallist.stream().sorted().collect(Collectors.toList());
//      ssert.assertTrue(actuallist.equals(newlist));


      driver.quit();
    }

    private static String getveggiePrice(WebElement s) {
//      String price = s.findElement(By.xpath("//tr/td[1]/following-sibling::td[1]")).getText();
   String price= s.findElement(By.xpath("following-sibling::td[1]")).getText();

        return price;
    }
}
