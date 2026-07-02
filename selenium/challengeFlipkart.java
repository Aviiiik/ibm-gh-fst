import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class challengeFlipkart {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        try {
            driver.get("https://www.flipkart.com/search?q=iphone+17+pro&sid=tyy%2C4io");

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//div[@data-id]")
            ));

            List<WebElement> products = driver.findElements(
                By.xpath("/html/body/div/div/div[3]/div[1]/div[2]/div")
            );

            System.out.println("Total products found: " + products.size());

            WebElement fourthProduct = products.get(3);

            // ✅ Class-independent: finds any div whose text starts with ₹
            String price = fourthProduct.findElement(
                By.xpath(".//div[starts-with(text(),'₹')]")
            ).getText();

            System.out.println("Price of 4th iPhone on Flipkart: " + price);

        } finally {
            driver.quit();
        }
    }
}