import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class challenge2 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        try {
            driver.get("https://www.amazon.in/s?k=iphone+17+pro");

            // Get all product result blocks
            List<WebElement> products = driver.findElements(
                By.xpath("//div[@data-component-type='s-search-result']")
            );

            // 4th product (index 3)
            WebElement fourthProduct = products.get(3);

            // Get price
            String wholePrice = fourthProduct.findElement(
                By.xpath(".//span[@class='a-price-whole']")
            ).getText();

            System.out.println("Price of 4th iPhone: ₹" + wholePrice);

        } finally {
            driver.quit();
        }
    }
}