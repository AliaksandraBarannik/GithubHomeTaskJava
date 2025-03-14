package actions;

import org.openqa.selenium.WebDriver;
import pages.RepositoryPage;

public class RepositoryActions extends BaseActions{
    private RepositoryPage repositoryPage;

    public RepositoryActions(WebDriver driver) {
        super(driver);
        this.repositoryPage = new RepositoryPage(driver);
    }

    public String getRepositoryName() {
        return repositoryPage.repositoryName().getText();
    }
}
