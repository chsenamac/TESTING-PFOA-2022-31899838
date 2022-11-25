package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoggedPage extends PageBase{
    private By localizadorSearchBox = By.id("search_query_top");
    private By localizadorSearchButton = By.name("submit_search");
    private By localizadorContadorProductos = By.className("heading-counter");
    public LoggedPage(WebDriver driver){
        super(driver);
    }

    //Metodos de la pagina
    public String urlActual() throws Exception {
        return getUrlActual();
    }
    public boolean searchBoxIsSelected()throws Exception{
        return isSelected(localizadorSearchBox);
    }

    public void clickSearchBox() throws Exception{
        click(localizadorSearchBox);
    }

    public void sendKeysSearchBox(String texto) throws Exception{
        sendKeys(localizadorSearchBox, texto);
    }

    public void clickSearchButton() throws Exception{
        click(localizadorSearchButton);
    }

    public String getTextContadorProductos()throws Exception{
        return getText(localizadorContadorProductos);
    }
}
