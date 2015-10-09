package foo;
//TestNG实现方式
import io.appium.java_client.AppiumDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AndroidCalculatorTest {
	private AppiumDriver driver;

	@BeforeClass
	public void setup() throws Exception {
		File classpathRoot = new File(System.getProperty("user.dir"));
		File appDir = new File(classpathRoot, "apps/ContactManger");
		File app = new File(appDir, "Calculator.apk");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "emulator-5554");// 设备名称
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
		capabilities.setCapability("platformVersion", "4.4.2");// 平台版本
		capabilities.setCapability("platformName", "Android");// 平台名称
		capabilities.setCapability("app", app.getAbsolutePath());// 应用的绝对路径
		capabilities.setCapability("app-package", "com.android.calculator2");// app的包名
		capabilities.setCapability("app-activity", ".Calculator");// app的activity，原生的需要在其activity前面加.;
		driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"),
				capabilities);
	}

	@AfterClass
	public void teardown() {
		driver.quit();
	}

	@Test
	public void Test() {
		WebElement e1=driver.findElementById("com.android.calculator2:id/digit9");
		e1.click();
		WebElement e3=driver.findElementById("com.android.calculator2:id/plus");
		e3.click();
		WebElement e2=driver.findElementById("com.android.calculator2:id/digit6");
		e2.click();
		WebElement e4=driver.findElementById("com.android.calculator2:id/equal");
		e4.click();
		WebElement e5=driver.findElementByClassName("android.widget.EditText");
		String s=e5.getText();
		Assert.assertEquals(s, "15");
	}
}
