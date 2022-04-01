package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillararyDemoLoginPage {
	
	@FindBy(id="course")
	private WebElement coursetab;
	
	@FindBy(xpath="//a[text()='Selenium Training']")
    private WebElement seleniumtraining;
	
	
	@FindBy(name="addresstype")
	private WebElement dropdown;
	
	
	
	public WebElement getDropdown() {
		return dropdown;
	}

	public SkillararyDemoLoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getCoursetab() {
		return coursetab;
	}
	
	public void seleniumtrainingbtn() {
		seleniumtraining.click();
	}
	
	
	
	
}
