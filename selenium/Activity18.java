import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Activity18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net/webelements/alerts");
       
        System.out.println("Page title: " + driver.getTitle());

        /
        driver.findElement(By.id("simple")).click();

        // Switch focus to the alert
        Alert simpleAlert = driver.switchTo().alert();

        // Print the text in the alert
        String alertText = simpleAlert.getText();
        System.out.println("Text in alert: " + alertText);

        // Close the alert by clicking OK
       ;
        
        // Print the message
        System.out.println(driver.findElement(By.id("result")).getText());

        // Close the browser
        driver.quit();
	}

}
