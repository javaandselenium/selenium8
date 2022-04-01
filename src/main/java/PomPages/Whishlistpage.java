package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Whishlistpage {
	
	@FindBy(xpath="//div[@class='play-icon']")
	private WebElement playicon;
	
	@FindBy(xpath="//div[@class='pause-icon']")
	private WebElement pauseicon;
	
	@FindBy(xpath="//span[contains(text(),'Add To')]")
	private WebElement wishlist;
	
	public Whishlistpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void playbutton() {
		playicon.click();
		
	}
	
	
	public void pausebutton() {
		pauseicon.click();
	}
	
	public void wishlistbtn() {
		wishlist.click();
		
		
		
		
		
	}

}
