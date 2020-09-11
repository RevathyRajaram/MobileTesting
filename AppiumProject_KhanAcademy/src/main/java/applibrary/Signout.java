package applibrary;

import org.openqa.selenium.By;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Signout {

	AndroidDriver<AndroidElement> driver;
	public Signout(AndroidDriver<AndroidElement> driver) {
		this.driver=driver;
	}
	
	public void clickSignOut() throws InterruptedException {
		driver.findElement(MobileBy.AccessibilityId("Settings")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@text='Sign out']")).click();
		Thread.sleep(2000);
	}
}
