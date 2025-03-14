package tests;

import actions.NewRepositoryActions;
import actions.RepositoryActions;
import models.Repository;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RepositoryTest extends BaseTest{
    private RepositoryActions repositoryActions;
    private NewRepositoryActions newRepositoryActions;

    @BeforeClass
    public void setupRepositoryTest() {
        repositoryActions = new RepositoryActions(driver);
        newRepositoryActions = new NewRepositoryActions(driver);
    }

    @Test(groups = {"sanity"})
    public void checkRepositoryCreationTest() {
        Repository repository = Repository.builder().name(dataUtils.generateRandomString()).build();
        newRepositoryActions.createNewRepository(repository);
        String actualRepositoryName = repositoryActions.getRepositoryName();
        Assert.assertEquals(actualRepositoryName, repository.getName(), "Repository name is not as expected");
    }
}
