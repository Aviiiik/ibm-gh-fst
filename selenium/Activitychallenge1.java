
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activitychallenge1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
        WebElement searchBox = driver.findElement(By.tagName("textarea"));
        System.out.println("id     : " + searchBox.getAttribute("id"));
        System.out.println("class  : " + searchBox.getAttribute("class"));
        System.out.println("name   : " + searchBox.getAttribute("name"));
        System.out.println("jsname : " + searchBox.getAttribute("jsname"));
   
        driver.quit();
        
	}

}
