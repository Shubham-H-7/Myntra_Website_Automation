package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {


    @FindBy (xpath = "//input[@placeholder='Search for products, brands and more']")
    WebElement search;

    @FindBy (xpath = "//a[@class='desktop-main'][normalize-space()='Men']")
    WebElement mens;


    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void setSearchItem(String item){
        System.out.println(item);
        search.sendKeys(item);
        search.sendKeys(Keys.ENTER);
    }

    public void mensMenu(){
        mens.click();
    }

}
