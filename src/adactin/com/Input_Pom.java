package adactin.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Input_Pom {
	public WebDriver driver;

	@FindBy(xpath = "//input[@id='first_name']")
	private WebElement firstName;

	@FindBy(xpath = "//input[@name='last_name']")
	private WebElement lastName;

	@FindBy(xpath = "//textarea[@id='address']")
	private WebElement address;

	@FindBy(xpath = "//input[@id='cc_num']")
	private WebElement ccNum;

	@FindBy(xpath = "//select[@id='cc_type']")
	private WebElement ccType;

	@FindBy(xpath = "//select[@id='cc_exp_month']")
	private WebElement expMonth;

	@FindBy(xpath = "//select[@id='cc_exp_year']")
	private WebElement expYear;

	@FindBy(xpath = "//input[@id='cc_cvv']")
	private WebElement cvvNum;

	@FindBy(xpath = "//input[@id='book_now']")
	private WebElement bookNow;

	public Input_Pom(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCcNum() {
		return ccNum;
	}

	public WebElement getCcType() {
		return ccType;
	}

	public WebElement getExpMonth() {
		return expMonth;
	}

	public WebElement getExpYear() {
		return expYear;
	}

	public WebElement getCvvNum() {
		return cvvNum;
	}

	public WebElement getBookNow() {
		return bookNow;
	}

}
