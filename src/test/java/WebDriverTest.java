import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.lang.*;

public class WebDriverTest {
    @Test
    public void firstTest(){
        System.setProperty("webdriver.chromedriver", "resources/chromdriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
    }
    //Test for Ebay
    public void searchProduct() throws InterruptedException{
        Thread.sleep(2000);
        WebDriver driver2 = new ChromeDriver();

        driver2.get("https://www.ebay.com/");
        Thread.sleep(2000);
        driver2.findElement(By.id("gh-ac")).sendKeys("iphone");
        Thread.sleep(2000);
        driver2.findElement(By.id("gh-bt")).click();
    }
    public void searchAgain() throws InterruptedException{
        WebDriver driver3 = new ChromeDriver();
        Thread.sleep(2000);
        driver3.get("https://www.target.com/");
        Thread.sleep(2000);
        driver3.findElement(By.id("search")).sendKeys("iphone");
        Thread.sleep(2000);
        driver3.findElement(By.className("SearchInputButton-sc-1opoijs-0 eOzuAz")).click();
    }

    public static void main(String[] args){
        WebDriverTest test01 = new WebDriverTest();
        test01.firstTest();
        test01.searchAgain();
        test01.searchProduct();
    }
}
