package day8;

import java.util.Properties;

public class PropertiesTest {
    public static void main(String[] args) {

        Properties properties = new Properties();
        properties = System.getProperties();

        for (String key : properties.stringPropertyNames()) {
            System.out.println(key);
        }
    }
}
