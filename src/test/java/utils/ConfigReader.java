package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

     String url;
     String item;

    public void loadProperties() throws IOException {
        Properties p = new Properties();
        String SystemDir = System.getProperty("user.dir");
        String configPath = SystemDir + "/src/test/java/resources/config.properties";
        FileInputStream input = new FileInputStream(configPath);
        p.load(input);

        url = p.getProperty("url");
        item = p.getProperty("item");
    }

    public String getUrl(){
        return url;
    }

    public String getItem(){
        return item;
    }
}
