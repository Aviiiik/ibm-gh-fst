import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity21 {
    public static void main(String[] args) {
        // Start Firefox driver
        WebDriver driver = new FirefoxDriver();

        try {
            // Create wait
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // Open the page
            driver.get("https://training-support.net/webelements/tabs");

            // Print page title
            System.out.println("Page title is: " + driver.getTitle());

            // Print parent window handle
            System.out.println("Current tab: " + driver.getWindowHandle());

            // Click button to open a new tab
            wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//button[text()='Open A New Tab']"))).click();

            // Wait until 2 tabs are open
            wait.until(ExpectedConditions.numberOfWindowsToBe(2));

            // Get all window handles
            List<String> windows = driver.getWindowHandles().stream().toList();
            System.out.println("Currently open windows: " + windows);

            // Switch to second tab
            driver.switchTo().window(windows.get(1));

            // Wait for the new page to load
            wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//button[contains(text(), 'Another One')]")));

            // Print current tab handle
            System.out.println("Current tab: " + driver.getWindowHandle());

            // Print title and heading of new page
            System.out.println("New Page title: " + driver.getTitle());
            System.out.println("New Page message: " +
                    driver.findElement(By.cssSelector("h2.mt-5")).getText());

            // Click button to open another tab
            driver.findElement(By.xpath("//button[contains(text(), 'Another One')]")).click();

            // Wait until 3 tabs are open
            wait.until(ExpectedConditions.numberOfWindowsToBe(3));

            // Refresh handles list
            windows = driver.getWindowHandles().stream().toList();

            // Switch to third tab
            driver.switchTo().window(windows.get(2));

            // Print details of third tab
            System.out.println("Third tab handle: " + driver.getWindowHandle());
            System.out.println("Third tab title: " + driver.getTitle());

        } finally {
            // Close browser
            driver.quit();
        }
    }
}