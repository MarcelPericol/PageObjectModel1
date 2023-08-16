package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactPage {

	public WebDriver driver;
	
	public ContactPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public By nameField = By.name("your-name");
	
}
