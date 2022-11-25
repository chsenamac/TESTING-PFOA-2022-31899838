package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Map;

public class PageBase {
    private static WebDriver driver;

    //Sobre escritura de metodos de Selenium
    public PageBase(WebDriver driver) {
        this.driver = driver;
    }

    public void click(By elementoWeb) throws Exception {
        try {
            driver.findElement(elementoWeb).click();
        } catch (Exception e) {
            throw new Exception();
        }
    }

    public void click(WebElement elementoWeb) throws Exception {
        try {
            elementoWeb.click();
        } catch (Exception e) {
            throw new Exception();
        }
    }

    public void sendKeys(By elementoWeb, String texto) throws Exception {
        try {
            driver.findElement(elementoWeb).sendKeys(texto);
        } catch (Exception e) {
            throw new Exception();
        }
    }

    public boolean isSelected(By elementoWeb) throws Exception {
        try {
            return driver.findElement(elementoWeb).isSelected();
        } catch (Exception e) {
            throw new Exception();
        }
    }

    public boolean isDisplayed(By elementoWeb) throws Exception {
        try {
            return driver.findElement(elementoWeb).isDisplayed();
        } catch (Exception e) {
            throw new Exception();
        }
    }

    public boolean isEnabled(By elementoWeb) throws Exception {
        try {
            return driver.findElement(elementoWeb).isEnabled();
        } catch (Exception e) {
            throw new Exception();
        }
    }

    public String getText(By elementoWeb) throws Exception {
        try {
            return driver.findElement(elementoWeb).getText();
        } catch (Exception e) {
            throw new Exception();
        }
    }

    public String getText(WebElement elemento) throws Exception {
        try {
            return elemento.getText();
        } catch (Exception e) {
            throw new Exception();
        }
    }

    public String getTitle() throws Exception {
        try {
            return driver.getTitle();
        } catch (Exception e) {
            throw new Exception();
        }
    }

    public String getUrlActual() throws Exception {
        try {
            return driver.getCurrentUrl();
        } catch (Exception e) {
            throw new Exception();
        }
    }

    public WebElement findElement(By elementoWeb) throws Exception {
        try {
            return driver.findElement(elementoWeb);
        } catch (Exception e) {
            throw new Exception();
        }
    }

    public void ALGO() {
        //[12:29] Frank García
//        for (Map event : productAndPrice) {
//            if (event.containsKey("ean")) {
//                By inputField = inputSearch;
//                sendKeys(inputField, event.get("ean").toString());
//                By actionButton = waitElementLocated(By.xpath("//p[contains(.,'" + event.get("ean").toString() + "')]"));
//                sendClick(actionButton);
//            }
//          String type, List<Map<String, String>> productAndPrice
    }
}
