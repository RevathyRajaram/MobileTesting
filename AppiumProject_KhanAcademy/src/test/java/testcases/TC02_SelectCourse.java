package testcases;

import org.testng.annotations.Test;

import applibrary.Capability;
import applibrary.Selectcourse;

public class TC02_SelectCourse extends Capability{
	
	Selectcourse selCoursePage;
	
	@Test
	public void selectCourse() throws InterruptedException {
		selCoursePage = new Selectcourse(driver);
		selCoursePage.clickEditBtn();
		selCoursePage.selectCourse();
		selCoursePage.launchCourseinChrome();
	}
}
