package emag.ro;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestProductOnHomepage {
    @Test
    public void testProductOnHomepage() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless"); // Run the test without opening Chrome window
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.emag.ro");

        // Check if a product is displayed on the homepage
        WebElement product = driver.findElement(By.cssSelector(".product-title"));
        assertTrue(product.isDisplayed());

        driver.quit();
    }
}
