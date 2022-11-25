package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class NoLoggedPage extends PageBase {

    private By localizadorBotonSignIn = By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a");
    private By localizadorLoginTextoMail = By.xpath("//*[@id=\"email\"]");
    private By localizadorLoginTextoPasswd = By.xpath("//*[@id=\"passwd\"]");
    private By localizadorLoginBotonSignIn = By.xpath("//*[@id=\"SubmitLogin\"]/span");
    private By localizadorLoginBotonSignUp = By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a");
    private By localizadorBotonContactUS = By.id("contact-link");
    private By localizadorDDLSubjectHeading = By.id("id_contact");
    private By localizadorDDLOpcionesSubjectHeading = By.tagName("option");
    private By localizadorEmailAddress = By.id("email");
    private By localizadorMessage = By.id("message");
    private By localizadorBotonSend = By.id("submitMessage");
    private By localizadorMensajeEnviado = By.xpath("//*[@id=\"center_column\"]/p");
    private By localizadorAddToComparePrimerProducto = By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[3]/div[2]/a");
    private By localizadorAddToCompareSegundoProducto = By.xpath("//*[@id=\"center_column\"]/ul/li[2]/div/div[3]/div[2]/a");
    private By localizadorBotonCompare = By.xpath("//*[@id=\"center_column\"]/div[2]/div/form/button/span");
    private By localizadorPrimerElementoComparacionIsDisplayed =By.xpath("//*[@id=\"product_comparison\"]/tbody/tr[1]/td[2]");
    private By localizadorSegundoElementoComparacionIsDisplayed =By.xpath("//*[@id=\"product_comparison\"]/tbody/tr[1]/td[3]");

    public NoLoggedPage(WebDriver driver) {
        super(driver);
    }

    //Metodos de la pagina
    public String urlActual() throws Exception {
        return getUrlActual();
    }
    public boolean signInIsDisplayed() throws Exception {
        return isDisplayed(localizadorBotonSignIn);
    }
    public boolean signUpIsDisplayed() throws Exception {
        return isDisplayed(localizadorLoginBotonSignUp);
    }
    public void clickEnSignin() throws Exception {
        click(localizadorBotonSignIn);
    }
    public boolean loginTextoEmailIsSelected() throws Exception {
        return isSelected(localizadorLoginTextoMail);
    }
    public boolean loginTextoPasswdIsSelected() throws Exception {
        return isSelected(localizadorLoginTextoPasswd);
    }
    public void loginTextoMailSendKeys(String texto) throws Exception {
        sendKeys(localizadorLoginTextoMail, texto);
    }
    public void loginTextoPasswdSendKeys(String texto) throws Exception {
        sendKeys(localizadorLoginTextoPasswd, texto);
    }
    public void loginBotonSignInClick() throws Exception {
        click(localizadorLoginBotonSignIn);
    }
    public void clickBotonContactUS() throws Exception {
        click(localizadorBotonContactUS);
    }
    public String selectDDLSubjectHeader(String textoOpcion) throws Exception {
        String resultado = "";
        WebElement ddlSubjectHeader = findElement(localizadorDDLSubjectHeading);
        List<WebElement> opciones = ddlSubjectHeader.findElements(localizadorDDLOpcionesSubjectHeading);
        for (int i = 0; i < opciones.size(); i++) {
            if (getText(opciones.get(i)).equals(textoOpcion)) {
                click(opciones.get(i));
            }
        }

        for (int j = 0; j < opciones.size(); j++) {
            if (opciones.get(j).isSelected()) {
                resultado = getText(opciones.get(j));
            }
        }
        return resultado;
    }
    public void clicEmailAddress() throws Exception {
        click(localizadorEmailAddress);
    }
    public void sendKeysEmailAddress(String texto) throws Exception {
        sendKeys(localizadorEmailAddress, texto);
    }
    public void clicMessage() throws Exception {
        click(localizadorMessage);
    }
    public void sendKeysMessage(String texto) throws Exception {
        sendKeys(localizadorMessage, texto);
    }
    public void clicBotonSend() throws Exception {
        click(localizadorBotonSend);
    }
    public String getTextMensajeEnviado() throws Exception {
        return getText(localizadorMensajeEnviado);
    }

    public void clicAddToComparePrimerProducto() throws Exception {
        click(localizadorAddToComparePrimerProducto);
    }

    public void clicAddToCompareSegundoProducto() throws Exception {
        click(localizadorAddToCompareSegundoProducto);
    }

    public void clicBotonCompare() throws Exception {
        click(localizadorBotonCompare);
    }

    public boolean primerElementoComparacionIsDisplayed() throws Exception {
        return isDisplayed(localizadorPrimerElementoComparacionIsDisplayed);
    }

    public boolean segundoElementoComparacionIsDisplayed() throws Exception {
        return isDisplayed(localizadorSegundoElementoComparacionIsDisplayed);
    }
}
