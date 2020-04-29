package testleaf;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class SendWhatsappMessage {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		AndroidDriver<WebElement> driver;
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "OnePlus 5T");
		cap.setCapability("udid", "93380971");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "9");
		cap.setCapability("appPackage", "com.whatsapp");
		cap.setCapability("appActivity", "com.whatsapp.HomeActivity");
		cap.setCapability("noReset", true);
		cap.setCapability("fullReset", false);

		driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		driver.findElementByXPath("//android.widget.TextView[@text='APPIUM APRIL WD 2020']").click();
		Thread.sleep(3000);
		driver.findElementById("com.whatsapp:id/entry").sendKeys("sent via Appium");
		driver.findElementByAccessibilityId("Send").click();
		System.out.println("Whatsapp Message sent");

	}

}
