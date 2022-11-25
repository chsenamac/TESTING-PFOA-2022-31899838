package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        glue = {"testObjects"},
        plugin={"json:src/test/resources/reportes/reportesDePruebas.json"}
)

public class TestRunner {
    @AfterClass
    public static void ejecutarReporte() throws Exception {
        try {
            System.out.println("Generando reporte");
            String[] npmCmd = {"cmd.exe", "/c", "npm run report"};
            Runtime.getRuntime().exec(npmCmd);
            System.out.println("Reporte generado. Deberia verlo en el navegador web.");
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
