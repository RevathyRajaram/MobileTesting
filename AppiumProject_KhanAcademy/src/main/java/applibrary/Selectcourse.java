package applibrary;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class Selectcourse {

	AndroidDriver<AndroidElement> driver;
	public Selectcourse(AndroidDriver<AndroidElement> driver) {
		this.driver =  driver;
	}
	
	public void clickEditBtn() throws InterruptedException {
		driver.findElementByAndroidUIAutomator("text(\"Edit\")").click();
		Thread.sleep(10000);
	}

	public void selectCourse() throws InterruptedException {
		
		driver.findElement(By.className("android.widget.Button")).click();
		Thread.sleep(3000);
		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Graduate studies\"));");
		WebElement strgrade = driver.findElement(By.xpath("//*[@text='Graduate studies']"));
		TouchAction t = new TouchAction(driver);
		t.tap(tapOptions().withElement(element(strgrade))).perform();
		Thread.sleep(2000);
		
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(1000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(1000);
		
		String act = driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Computer programming\"));").getText();
		String exp = "Computer programming";
		
		Assert.assertEquals(act, exp);

	}
	
	public void launchCourseinChrome() throws InterruptedException {
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Computer programming\"));");
		driver.findElement(By.xpath("//*[@text='Computer programming']")).click();
		Thread.sleep(3000);
		
		int openWithOptionsSize1 = driver.findElements(By.id("android:id/text1")).size();
		
		for(int i=0;i<openWithOptionsSize1;i++)
		{
			WebElement openWithOptions = driver.findElements(By.id("android:id/text1")).get(i);
			String chromeTxt = openWithOptions.getText();
			if(chromeTxt.contains("Chrome")) {
				openWithOptions.click();
				Thread.sleep(1000);
			}
		}
			
		WebElement justOnceBtn = driver.findElement(By.id("android:id/button_once"));
		justOnceBtn.click();
		Thread.sleep(10000);
		
		int openWithOptionsSize2 = driver.findElements(By.id("android:id/text1")).size();
		
		for(int i=0;i<openWithOptionsSize2;i++)
		{
			WebElement openWithOptions = driver.findElements(By.id("android:id/text1")).get(i);
			String chromeTxt = openWithOptions.getText();
			if(chromeTxt.contains("Chrome")) {
				openWithOptions.click();
				Thread.sleep(1000);
			}
		}
		
		justOnceBtn.click();
		Thread.sleep(15000);
		
		Set<String> contextNames = driver.getContextHandles();
		for(String contextName: contextNames) {
			System.out.println(contextName); 
		}
		
		driver.context("WEBVIEW_chrome");
	}
}
