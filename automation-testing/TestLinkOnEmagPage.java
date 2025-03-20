package emag.ro;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestLinkOnEmagPage {
    @Test
    public void testLinkFunctionality() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless"); // Run the test without opening Chrome window
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.emag.ro");

        // Check if the "About Us" link exists and works
        WebElement aboutUsLink = driver.findElement(By.linkText("Despre noi"));
        aboutUsLink.click();

        // Check if the "About Us" page loaded
        assertTrue(driver.getTitle().contains("Despre noi"));

        driver.quit();
    }
}

