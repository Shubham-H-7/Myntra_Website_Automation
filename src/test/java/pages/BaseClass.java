package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import utils.ConfigReader;
import java.io.IOException;
import java.time.Duration;


public class BaseClass {

    String url;
    protected WebDriver driver;

    @BeforeClass
    public void loadConfig() throws IOException {
        ConfigReader cr = new ConfigReader();
        cr.loadProperties();
        url=cr.getUrl();
    }

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
