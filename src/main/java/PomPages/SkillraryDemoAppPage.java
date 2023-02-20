package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericLibraries.WebDriverUtility;


public class SkillraryDemoAppPage{
	//Declaration
	@FindBy(xpath="//a[@class='navbar-brand']")
	private WebElement pageHeader;
	
	@FindBy(id="course")
	private WebElement courseTab;
	
	@FindBy(xpath="//span[@class='wrappers']/descendant::a[text()=\"Selenium Training\"]")
	private WebElement seleniumTrainingLink;
	
	@FindBy(name="addresstype")
	private WebElement categoryDropdown;
	
	@FindBy(xpath="//a[text()=\"Contact Us\"]")
	private WebElement contactUsLink;
	
	public SkillraryDemoAppPage(WebDriver driver ) {
	PageFactory.initElements(driver,this);
}
//utilization
public WebElement getPageHeader() {	
return pageHeader;
}
public void mouseHoverToCourse(WebDriverUtility web) {
	web.mouseHover(courseTab);
}
public void clickSeleniumTraining() {
	seleniumTrainingLink.click();
}
public void selectCategory(WebDriverUtility web,int index) {
	web.dropdown(categoryDropdown,index);
}
//public WebElement getContactus() {
	//return contactUsLink();
//}
public void ClickContactus() {
	contactUsLink.click();
}
public WebElement getContactUs() {
	// TODO Auto-generated method stub
	return null;
}

}
