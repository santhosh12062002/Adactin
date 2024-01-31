package adactin.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DropDownPOM {
	public WebDriver driver;

	@FindBy(xpath = "//select[@class='search_combobox']")
	private WebElement location;

	@FindBy(xpath = "//select[@id='hotels']")
	private WebElement hotelType;

	@FindBy(xpath = "//select[@id='room_type']")
	private WebElement roomType;

	@FindBy(xpath = "//select[@id='room_nos']")
	private WebElement roomNos;

	@FindBy(xpath = "//input[@class='date_pick']")
	private WebElement clear;

	@FindBy(xpath = "//input[@class='date_pick']")
	private WebElement checkInDate;

	@FindBy(xpath = "//input[@id='datepick_out']")
	private WebElement clear1;

	@FindBy(xpath = "//input[@id='datepick_out']")
	private WebElement checkOutDate;

	@FindBy(xpath = "//select[@id='adult_room']")
	private WebElement numAdult;

	@FindBy(xpath = "//select[@id='child_room']")
	private WebElement numChild;

	@FindBy(xpath = "//input[@id='Submit']")
	private WebElement search;

	public DropDownPOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotelType() {
		return hotelType;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getRoomNos() {
		return roomNos;
	}

	public WebElement getClear() {
		return clear;
	}

	public WebElement getCheckInDate() {
		return checkInDate;
	}

	public WebElement getClear1() {
		return clear1;
	}

	public WebElement getCheckOutDate() {
		return checkOutDate;
	}

	public WebElement getNumAdult() {
		return numAdult;
	}

	public WebElement getNumChild() {
		return numChild;
	}

	public WebElement getSearch() {
		return search;
	}

}
