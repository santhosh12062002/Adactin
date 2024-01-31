package adactin.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout_Pom {
	public WebDriver driver;

	@FindBy(xpath = "//input[@id='logout']")
	private WebElement logout;

	public Logout_Pom(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLogout() {
		return logout;
	}

}
