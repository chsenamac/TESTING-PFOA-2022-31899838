package testObjects;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class NoLoggedFeaturesSteps extends TestBase {
    @Given("Accedo a la pagina {string}")
    public void accedoALaPagina(String url) {
        try {
            driver.navigate().to(url);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Given("Selecciono la barra de busqueda")
    public void seleccionoLaBarraDeBusqueda() {
        try {
            loggedPage.clickSearchBox();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @When("escribo el nombre de {string}")
    public void escriboElNombreDeProducto(String producto) throws Exception {
        try {
            Thread.sleep(3000);
            loggedPage.sendKeysSearchBox(producto);
            Thread.sleep(1000);
            loggedPage.clickSearchButton();
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Then("Verifico que se devuelva un resultado mayor a un producto")
    public void verificoQueSeDevuelvaUnResultadoMayorAUnProducto() {
        String textoContadorProductos;
        try {
            textoContadorProductos = loggedPage.getTextContadorProductos();
            char[] arrTextoContadorProductos = textoContadorProductos.toCharArray();

            Assert.assertTrue("Debe ser mayor a 1", arrTextoContadorProductos[0] > 1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @And("Doy click en el boton SignIn")
    public void doyClickEnElBotonSignIn() {
        try {
            noLoggedPage.clickEnSignin();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Then("Me logueo con los siguientes datos")
    public void meLogueoConLosSiguientesDatos(DataTable loginData) {
        try {
            List<List<String>> datos = loginData.asLists(String.class);
            noLoggedPage.loginTextoMailSendKeys(datos.get(1).get(0));
            noLoggedPage.loginTextoPasswdSendKeys(datos.get(1).get(1));
            noLoggedPage.loginBotonSignInClick();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Given("Doy click en el boton ContactUs")
    public void doyClickEnElBotonContactUs() {
        try {
            Thread.sleep(1000);
            noLoggedPage.clickBotonContactUS();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @And("selecciono el subject heading con la opcion {string}")
    public void seleccionoElSubjectHeadingConLaOpcion(String textoOpcion) {
        try {
            Thread.sleep(2000);
            System.out.println(noLoggedPage.selectDDLSubjectHeader(textoOpcion));
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @And("escribo el texto {string} en el campo Email address")
    public void escriboElTextoEnElCampoEmailAddress(String textoEmail) {
        try {
            Thread.sleep(2000);
            noLoggedPage.clicEmailAddress();
            Thread.sleep(2000);
            noLoggedPage.sendKeysEmailAddress(textoEmail);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @And("escribo el texto {string} en el campo Message")
    public void escriboElTextoEnElCampoMessage(String textoMensaje) {
        try {
            Thread.sleep(2000);
            noLoggedPage.clicMessage();
            Thread.sleep(2000);
            noLoggedPage.sendKeysMessage(textoMensaje);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @When("hago clic en el boton Send")
    public void hagoClicEnElBotonSend() {
        try {
            Thread.sleep(1000);
            noLoggedPage.clicBotonSend();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Then("verifico que el mensaje haya sido enviado")
    public void verificoQueElMensajeHayaSidoEnviado() {
        String mensajeEsperado;
        String mensajeRecibido;

        try {
            Thread.sleep(2000);
            mensajeEsperado = "Your message has been successfully sent to our team.";
            mensajeRecibido = noLoggedPage.getTextMensajeEnviado();
            Assert.assertEquals("Mensaje enviado", mensajeEsperado, mensajeRecibido);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Given("realizo una busqueda del producto {string}")
    public void realizoUnaBusquedaDelProducto(String producto) {
        try {
            Thread.sleep(3000);
            loggedPage.sendKeysSearchBox(producto);
            Thread.sleep(1000);
            loggedPage.clickSearchButton();
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @And("verifico que el numero de productos sea mayor a {int}")
    public void verificoQueElNumeroDeProductosSeaMayorA(int numeroProductos) {
        String textoContadorProductos;
        try {
            Thread.sleep(1000);
            textoContadorProductos = loggedPage.getTextContadorProductos();
            char[] arrTextoContadorProductos = textoContadorProductos.toCharArray();

            Assert.assertTrue("Debe ser mayor a 1", arrTextoContadorProductos[0] > numeroProductos);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @When("doy clic en el boton add to compare del primer elemento de la lista")
    public void doyClicEnElBotonAddToCompareDelPrimerElementoDeLaLista() {
        try {
            Thread.sleep(2000);
            noLoggedPage.clicAddToComparePrimerProducto();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @And("doy clic en el boton add to compare del segundo elemento de la lista")
    public void doyClicEnElBotonAddToCompareDelSegundoElementoDeLaLista() {
        try {
            Thread.sleep(2000);
            noLoggedPage.clicAddToCompareSegundoProducto();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @And("doy clic en el boton compare")
    public void doyClicEnElBotonCompare() {
        try {
            Thread.sleep(2000);
            noLoggedPage.clicBotonCompare();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Then("verifico que existan los productos en la lista de comparacion")
    public void verificoQueExistanLosProductosEnLaListaDeComparacion() {
        try {
            Thread.sleep(3000);
            Assert.assertTrue(noLoggedPage.primerElementoComparacionIsDisplayed());
            Assert.assertTrue(noLoggedPage.segundoElementoComparacionIsDisplayed());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
