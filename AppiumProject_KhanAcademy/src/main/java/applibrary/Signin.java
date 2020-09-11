package applibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class Signin {

	AndroidDriver<AndroidElement> driver;
	public Signin(AndroidDriver<AndroidElement> driver) {
		this.driver =  driver;
	}
	
	public void dismissAlert1() throws InterruptedException {
		Thread.sleep(10000);
		WebElement dismiss1 = driver.findElement(By.className("android.widget.Button"));
		dismiss1.click();
	}
	
	public void dismissAlert2() {
		WebElement dismiss2 = driver.findElementByAndroidUIAutomator("text(\"Dismiss\")");
		dismiss2.click();
	}
	
	public void signInoperation() throws InterruptedException {
		
		driver.findElement(By.className("android.widget.Button")).click();	//Click Sign in
				
		driver.findElementByAndroidUIAutomator("text(\"Sign in\")").click(); //Click Sign in
		
		driver.findElementByAndroidUIAutomator("text(\"Continue with Google\")").click(); // Click on Continue with Google
		Thread.sleep(10000);
		
		WebElement expName = driver.findElement(By.id("com.google.android.gms:id/account_name"));
		String expNameText = expName.getText();
		expNameText=expNameText.replaceAll("@gmail.com", "");
		expName.click();
		
		Thread.sleep(10000);
		
		driver.findElement(MobileBy.AccessibilityId("Settings")).click();
	
		Thread.sleep(5000);
		
		WebElement actName = driver.findElements(By.className("android.widget.TextView")).get(1);
		String actNameText = actName.getText();
		
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Assert.assertEquals(expNameText, actNameText);
		
	}
}
