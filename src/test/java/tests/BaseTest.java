package tests;

import actions.HeaderActions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utils.DataUtils;


public class BaseTest {
    protected WebDriver driver;
    protected HeaderActions headerActions;
    protected DataUtils dataUtils;

    public BaseTest() {

    }


    @BeforeClass
    public void setup() {
        // Initialize the WebDriverManager and ChromeDriver
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");  // Optional: start browser maximized
        driver = new ChromeDriver(options);
        headerActions = new HeaderActions(driver);
        dataUtils = new DataUtils();
    }

    @AfterClass
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
