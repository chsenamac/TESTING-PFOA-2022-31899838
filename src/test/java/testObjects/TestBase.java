package testObjects;

import org.openqa.selenium.WebDriver;
import pageObjects.LoggedPage;
import pageObjects.NoLoggedPage;

public class TestBase {

    protected WebDriver driver = Hooks.getDriver();

    //Inicializar paginas debajo
    protected NoLoggedPage noLoggedPage = new NoLoggedPage(driver);
    protected LoggedPage loggedPage = new LoggedPage(driver);
}
