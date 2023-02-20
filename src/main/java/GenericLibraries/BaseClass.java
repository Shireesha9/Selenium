package GenericLibraries;


	
	import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;

import PomPages.ContactUsPage;
import PomPages.CoreJavaForSeleniumPage;
import PomPages.CoreJavaVedioPage;
import PomPages.HomePage;
import PomPages.SeleniumTrainingPage;
import PomPages.SkillraryDemoAppPage;
import PomPages.TestingPage;

	

	public class BaseClass {
		protected PropertiesFileUtility property;
		protected ExcelUtility excel;
		protected WebDriverUtility web;
		protected WebDriver driver;
		protected HomePage home;
		protected SkillraryDemoAppPage skillraryDemo;
		protected ContactUsPage contact;
		protected TestingPage testing;
		protected CoreJavaForSeleniumPage coreJava;
		protected SeleniumTrainingPage selenium;
		protected CoreJavaVedioPage javaVideo;
		public long time;
		
		//@BeforeSuite
		//@BeforeTest
		@BeforeClass
		       public void classConfiguration()
		       {
			     property= new PropertiesFileUtility();
			     excel= new ExcelUtility();
				 web= new WebDriverUtility();
			
			     
			     property.propertyFileInitialization(IConstantPath.PROPERTIES_FILE_PATH);
			     excel.excelInitialization(IConstantPath.EXCEL_FILE_PATH);
			     
		       }

		@BeforeMethod
		public void methodConfiguration() {
			time = Long.parseLong(property.fetchProperty("timeouts"));
			driver = web.openApplication(property.fetchProperty("browser"), property.fetchProperty("url"), time);
			home=new HomePage(driver);
			
			Assert.assertTrue(home.getLogo().isDisplayed());
			skillraryDemo = new SkillraryDemoAppPage(driver);
			selenium= new SeleniumTrainingPage(driver);
			coreJava=new CoreJavaForSeleniumPage(driver);
			javaVideo= new CoreJavaVedioPage(driver);
			testing=new TestingPage(driver);
			contact=new ContactUsPage(driver);
			
		}

		@AfterMethod
		    public void methodTearDown()
		    {
			   web.quitBrowser();
		    }
		@AfterClass
		     public void classTearDown()
		     {
			   excel.closeExcel();
		     }
	       	
		// @AfterTest
		// @AfterSuite
	}


		


