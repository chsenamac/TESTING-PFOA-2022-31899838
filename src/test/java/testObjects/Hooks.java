package testObjects;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {
    private static WebDriver driver;
    private static int cantidadScenarios = 0;

    @Before
    public void iniciarDriver() {
        cantidadScenarios++;
        System.setProperty("webdriver.chrome.driver", "src/test/resources/webdrivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
    }

    @After
    public void cerrarDriver() {
        System.out.println("Cerrando el Scenario numero: " + cantidadScenarios);
        driver.quit();
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
