package testObjects;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoggedFeaturesSteps extends TestBase {
    @Given("Verifico el estado de login del usuario")
    public void verificoElEstadoDeLoginDelUsuario()  throws Exception {
        try {
            Thread.sleep(3000);
            boolean signInIsDisplayed = noLoggedPage.signInIsDisplayed();
            boolean signUpIsDisplayed = noLoggedPage.signUpIsDisplayed();
            if (signInIsDisplayed) {
                Assert.assertTrue("Verificado", noLoggedPage.signInIsDisplayed());
            } else {
                if(signUpIsDisplayed) {
                    Assert.assertTrue("Verificado", noLoggedPage.signUpIsDisplayed());
                }
                else{
                    System.out.println("No se donde estamos: " + noLoggedPage.urlActual());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
