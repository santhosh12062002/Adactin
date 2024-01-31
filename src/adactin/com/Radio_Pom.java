package adactin.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Radio_Pom {
	public WebDriver driver;

	@FindBy(xpath = "//input[@id='radiobutton_0']")
	private WebElement radioButton;

	@FindBy(xpath = "//input[@id='continue']")
	private WebElement searchButton;

	public Radio_Pom(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public WebElement getRadioButton() {
		return radioButton;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

}
