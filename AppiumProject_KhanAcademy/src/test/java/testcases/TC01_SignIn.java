package testcases;	

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import applibrary.Capability;
import applibrary.Signin;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

@Test
public class TC01_SignIn extends Capability{

	applibrary.Signin Signin;
	public void openApp() throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = DesiredCapability();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Signin = new Signin(driver);
		Signin.dismissAlert1();
		Signin.dismissAlert2();
	}
	@Test(dependsOnMethods = "openApp")
	public void signIn() throws InterruptedException {
		Signin.signInoperation();
		
	}

}
