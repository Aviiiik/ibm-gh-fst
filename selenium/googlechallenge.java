import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class googlechallenge {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com/search?q=cheese");

        System.out.println(driver.getPageSource());

        driver.quit();
    }
}