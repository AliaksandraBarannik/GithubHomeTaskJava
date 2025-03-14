package actions;

import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class BaseActions {
    private BasePage basePage;

    public BaseActions(WebDriver driver) {
        this.basePage = new BasePage(driver);
    }

}
