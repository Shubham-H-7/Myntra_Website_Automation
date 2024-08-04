package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.BaseClass;
import pages.HomePage;
import utils.ConfigReader;

import java.io.IOException;

public class HomeTest extends BaseClass {
    String item;

    @BeforeClass
    public void loadConfigFile() throws IOException {
        ConfigReader cr = new ConfigReader();
        cr.loadProperties();
        item = cr.getItem();
    }

    @Test
    public void searchTest(){
        HomePage hp = new HomePage(driver);
        hp.setSearchItem(item);
    }

    public void mensSelected(){
        HomePage hpp= new HomePage(driver);
        hpp.mensMenu();
    }
}
