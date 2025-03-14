package config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class EnvConfig {
    private static Properties properties;

    // Load properties from the file when the class is loaded
    static {
        try {
            properties = new Properties();
            FileInputStream inputStream = new FileInputStream("src/test/resources/env.properties");
            properties.load(inputStream);
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Unable to load env.properties file");
        }
    }

    public static String getBaseUrl() {
        return properties.getProperty("baseUrl");
    }

    public static String getUserName() {
        return properties.getProperty("userName");
    }

    public static String getPassword() {
        return properties.getProperty("password");
    }
}
