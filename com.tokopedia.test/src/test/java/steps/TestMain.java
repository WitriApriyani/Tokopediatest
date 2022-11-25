package steps;

import org.openqa.selenium.WebDriver;

import com.tokopedia.test.pages.Main;
import com.tokopedia.test.utils.Constants;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestMain {
	private static WebDriver driver;
	private Main main = new Main();
	
	public TestMain() {
		driver = Hook.driver;
	}
	
	@When("Navigate to url")
	public void navigate () {
		driver.get(Constants.url);
	}
	
	@And("Click Search box")
	public void searchbox () {
		main.clicksearchbox();
	}
	
	@And("Clik product")
	public void product () {
		main.clickproduct();
	}
	
	@And("Add to wishlist")
	public void wishlist() {
		main.wishlist();
	}
	
	
	@Then("Validate site")
	public void validate () {
		
	}
	
	static void delay(int seconds) {
		try {
			Thread.sleep(seconds*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}
