package adactin.com;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	public static WebDriver driver;

	public static WebDriver browserLaunch(String browserName) {

		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "\\driver\\edgedriver.exe");
			driver = new EdgeDriver();
		} else if (browserName.equalsIgnoreCase("gecko")) {
			System.setProperty("webdriver.fireBox.driver",
					System.getProperty("user.dir") + "\\driver\\geckodriver.exe");
		} else if (browserName.equalsIgnoreCase("opera")) {
			System.setProperty("webdriver.opera.driver", System.getProperty("user.dir") + "\\driver\\operadriver.exe");

		}
		return driver;
	}

	public static void geturl(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}
	public static void implicitlyWait(int a) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(a));
	}

	public static void currentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}

	public static void getTitle() {
		String title = driver.getTitle();
		System.out.println(title);

	}

// close - the webPage the browser 
	public static void close() throws Exception {
		driver.close();
		Thread.sleep(3000);
	}

//quite - close the browser 
	public static void quite() throws Exception {
		driver.quit();
		Thread.sleep(3000);
	}

	public static void switchTo() {
		driver.switchTo();

	}

// navigate command
	public static void navigateTo() {
		driver.navigate().to("url");

	}

	public static void refresh() {
		driver.navigate().refresh();

	}

	public static void back() {
		driver.navigate().back();
	}

	public static void forward() {
		driver.navigate().forward();

	}

// sendKeys
	public static void sendKeysElement(String value, WebElement elementName) {
		elementName.sendKeys(value);
	}

// click
	public static void click(WebElement elementName) {
		elementName.click();
	}

// clear
	public static void clear(WebElement elementName) {
		elementName.clear();
	}

// dropDown
	public static void dropDown(WebElement webElement, String methodName, String value) {
		Select s = new Select(webElement);
// select
		if (methodName.equalsIgnoreCase("index")) {
			s.selectByIndex(Integer.parseInt(value));

		} else if (methodName.equalsIgnoreCase("value")) {
			s.selectByValue(value);

		} else if (methodName.equalsIgnoreCase("text")) {
			s.selectByVisibleText(value);
// deSelect 
		} else if (methodName.equalsIgnoreCase("index")) {
			s.deselectByIndex(Integer.parseInt(value));
		} else if (methodName.equalsIgnoreCase("Value")) {
			s.deselectByValue(value);
		} else if (methodName.equalsIgnoreCase("text")) {
			s.deselectByVisibleText(value);
		}
	}

	public static void screenshot(String a) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		File desFile = new File("C:\\Users\\santh\\eclipse-workspace\\Project_1\\Screenshot\\" + a + ".png");
		FileUtils.copyFile(srcFile, desFile);
	}

//Alert OK
	public static void alertOk() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

//Alert dismiss 
	public static void alertCancle() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}

//Alert Message
	public static void alertMessage(String a) {
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(a);
		alert.accept();
	}

}
