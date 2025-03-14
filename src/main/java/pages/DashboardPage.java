package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardPage extends BasePage {
    private final String NEW_REPOSITORY_BUTTON = "//div[@aria-label='Repositories']//a[@href='/new']";
private final String REPOSITORY_SEARCH = "dashboard-repos-filter-left";
    public DashboardPage(WebDriver driver) {
        super(driver);
    }

    public WebElement newRepositoryButton() {
        return driver.findElement(By.xpath(NEW_REPOSITORY_BUTTON));
    }

    public WebElement repositorySearch() {
        return driver.findElement(By.id(REPOSITORY_SEARCH));
    }


}
