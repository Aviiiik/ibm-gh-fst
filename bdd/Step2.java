package stepDefinations;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Step2 extends BaseClass{
	@When("the user clicks on the About Us link")
	public void clickButton() throws Throwable {
		driver.findElement(By.linkText("About Us")).click();
	}
}

