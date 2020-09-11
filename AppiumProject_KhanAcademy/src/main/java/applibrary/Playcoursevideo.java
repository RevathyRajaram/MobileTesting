package applibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class Playcoursevideo{

	AndroidDriver<AndroidElement> driver;
	public Playcoursevideo(AndroidDriver<AndroidElement> driver) {
		this.driver =  driver;
	}
	
	public void startVideo() throws InterruptedException {
	driver.findElement(By.xpath("//h3[text()='Intro to JS: Drawing & Animation']")).click();
	Thread.sleep(10000);
	driver.findElement(By.xpath("//span[text()='What is Programming?']")).click();
	Thread.sleep(50000);
	driver.pressKey(new KeyEvent(AndroidKey.BACK));
	Thread.sleep(5000);
	driver.pressKey(new KeyEvent(AndroidKey.BACK));
	Thread.sleep(5000);
	driver.pressKey(new KeyEvent(AndroidKey.BACK));
	Thread.sleep(5000);
	driver.pressKey(new KeyEvent(AndroidKey.BACK));
	Thread.sleep(5000);
	driver.context("NATIVE_APP");
	}
}
