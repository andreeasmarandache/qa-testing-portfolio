package emag.ro;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestSearchProductEmag {
    @Test
    public void testSearchProduct() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless"); // Run the test without opening Chrome window
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.emag.ro");

        // Search for a product
        WebElement searchBox = driver.findElement(By.id("searchboxTrigger")); // Locator for the search box
        searchBox.sendKeys("laptop");
        searchBox.submit();

        // Wait a few seconds for results to load
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Check if there are results
        WebElement firstResult = driver.findElement(By.cssSelector(".card-title"));
        assertTrue(firstResult.isDisplayed());

        driver.quit();
    }
}

