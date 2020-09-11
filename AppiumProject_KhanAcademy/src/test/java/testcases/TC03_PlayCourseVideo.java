package testcases;

import org.testng.annotations.Test;

import applibrary.Capability;
import applibrary.Playcoursevideo;

public class TC03_PlayCourseVideo extends Capability {

	Playcoursevideo playVid;
	
	@Test
	public void playVideo() throws InterruptedException {
		playVid=new Playcoursevideo(driver);
		playVid.startVideo();
	}
	
}
