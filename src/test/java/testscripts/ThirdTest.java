package testscripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import GenericLibraries.BaseClass;
import PomPages.CoreJavaVedioPage;
import PomPages.HomePage;

public class ThirdTest extends BaseClass {
@Test
public void thirdTest() throws InterruptedException {
	SoftAssert soft=new SoftAssert();
	
	home.searchFor("core java for selenium");
	soft.assertEquals(coreJava.getPageHeader(),"CORE JAVA FOR SELENIUM");
	
	coreJava.clickCoreJavaForSeleniumLink();
	soft.assertEquals(javaVideo.pageHeader(),"Core Java For Selenuim Training");
	
	javaVideo.closepopUp();
	web.switchToFrame();
	javaVideo.clickPlayButton();
	Thread.sleep(20000);
	javaVideo.cliclPauseButton();
	web.switchBackFromFrame();
	
	
	
	
}
}
