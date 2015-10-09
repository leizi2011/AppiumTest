package foo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.HasTouchScreen;
import org.openqa.selenium.interactions.TouchScreen;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteTouchScreen;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.AppiumDriver;

import java.io.File;
import java.net.URL;
import java.util.List;

public class AndroidContactsTest {
	//private WebDriver driver;
	private AppiumDriver driver;

	@Before
	public void setUp() throws Exception {
		// set up appium
		File classpathRoot = new File(System.getProperty("user.dir"));
		File appDir = new File(classpathRoot, "apps/ContactManger");
		File app = new File(appDir, "Calculator.apk");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "emulator-5554");
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
		capabilities.setCapability("platformVersion", "4.4.2");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("app", app.getAbsolutePath());
		System.out.println(app.getAbsolutePath());
		capabilities.setCapability("app-package", "com.android.calculator2");
		capabilities.setCapability("app-activity", ".Calculator");
		driver=new AppiumDriver(new  URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
//		driver = new SwipeableWebDriver(
//				new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void addContact() {
		System.out.println(1111);
//		WebElement el = driver.findElement(By.name("Add Contact"));
//		el.click();
//		List<WebElement> textFieldsList = driver.findElements(By
//				.tagName("textfield"));
//		textFieldsList.get(0).sendKeys("Some Name");
//		textFieldsList.get(2).sendKeys("Some@example.com");
//		driver.findElement(By.name("Save")).click();
	}

	// public class SwipeableWebDriver extends RemoteWebDriver implements
	// HasTouchScreen {
	// private RemoteTouchScreen touch;
	//
	// public SwipeableWebDriver(URL remoteAddress,
	// Capabilities desiredCapabilities) {
	// super(remoteAddress, desiredCapabilities);
	// touch = new RemoteTouchScreen(getExecuteMethod());
	//
	// }
	//
	// public TouchScreen getTouch() {
	// return touch;
	// }
	// }
}
