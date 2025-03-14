package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RepositoryPage extends BasePage{
    private final String REPOSITORY_NAME = "//strong[@itemprop='name']";

    public RepositoryPage(WebDriver driver) {
        super(driver);
    }

    public WebElement repositoryName() {
        return driver.findElement(By.xpath(REPOSITORY_NAME));
    }
}
