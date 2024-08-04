package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestX {
   static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.get("https://www.myntra.com/");
        driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("Samsung 24");
        driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys(Keys.ENTER);
    }
}
