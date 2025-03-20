package emag.ro;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestAccessEmagSite {

    @Test
    public void testAccessEmag() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless"); // Run the test without opening Chrome window
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.emag.ro");

        // Check if the page loaded correctly
        assertTrue(driver.getTitle().contains("Emag"));

        driver.quit();
    }
}
