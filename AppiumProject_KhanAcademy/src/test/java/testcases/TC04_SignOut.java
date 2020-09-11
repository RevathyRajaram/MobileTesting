package testcases;

import org.testng.annotations.Test;

import applibrary.Capability;
import applibrary.Signout;

public class TC04_SignOut extends Capability{

	Signout signoutpage;
	
	@Test
	public void signOut() throws InterruptedException {
		signoutpage = new Signout(driver);
		signoutpage.clickSignOut();
	}
}
