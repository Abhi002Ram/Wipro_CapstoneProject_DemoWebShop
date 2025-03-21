package stepDef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    public static WebDriver driver; 

    @Before
    public void setup() {
        System.out.println("Launching browser...");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
    }

    @After
    public void teardown() {
        System.out.println("Closing browser...");
        if (driver != null) {
            driver.quit();
        }
    }
}

