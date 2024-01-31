package adactin.com;

import org.openqa.selenium.WebDriver;

public class Adactin_HotelBooking_Site extends BaseClass {
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		driver = browserLaunch("chrome");
		implicitlyWait(10);
		geturl("http://adactinhotelapp.com/");
		
		getTitle();

		login_POM po = new login_POM(driver);
		sendKeysElement("Garuda10", po.getUsername());
		sendKeysElement("garuda100", po.getPassword());

		click(po.getLogin());

		DropDownPOM pom = new DropDownPOM(driver);

		dropDown(pom.getLocation(), "value", "Los Angeles");

		dropDown(pom.getHotelType(), "value", "Hotel Cornice");

		dropDown(pom.getRoomType(), "value", "Super Deluxe");

		dropDown(pom.getRoomNos(), "value", "2");

		clear(pom.getClear());

		sendKeysElement("26/11/2022", pom.getCheckInDate());

		clear(pom.getClear1());

		sendKeysElement("27/11/2022", pom.getCheckOutDate());

		dropDown(pom.getNumAdult(), "value", "2");

		dropDown(pom.getNumChild(), "value", "2");

		click(pom.getSearch());

		Radio_Pom pom1 = new Radio_Pom(driver);

		click(pom1.getRadioButton());

		click(pom1.getSearchButton());

		Input_Pom pom2 = new Input_Pom(driver);

		sendKeysElement("Santhosh", pom2.getFirstName());

		sendKeysElement("S", pom2.getLastName());

		sendKeysElement("1/110,SouthStreet,Siruvallur,Tiruvannamalai.", pom2.getAddress());

		sendKeysElement("9876123450123412", pom2.getCcNum());

		dropDown(pom2.getCcType(), "value", "VISA");

		dropDown(pom2.getExpMonth(), "value", "4");

		dropDown(pom2.getExpYear(), "index", "6");

		sendKeysElement("342", pom2.getCvvNum());

		click(pom2.getBookNow());

		screenshot("Booking Details");

		Logout_Pom pom3 = new Logout_Pom(driver);

		click(pom3.getLogout());
		
		close();
	}

}
