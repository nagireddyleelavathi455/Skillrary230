package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This class contains all the elements and respective 
 * business libraries of home page
 * @author thiru
 *
 */
public class HomePage {
	
	//Declaration
	
	@FindBy(xpath="//img[@alt='SkillRary']")
	
	private WebElement logo;
	
	@FindBy(xpath="//a[text()=' GEARS ']")
	
	private WebElement gearsTab;
	
	@FindBy(xpath="//ul[@class='dropdown-menu gear_menu']/descendant::a[text()=' SkillRary Demo APP']")
	
	private WebElement skillraryDemoAppLink;
	
	//Initialization
	
	public HomePage(WebDriver driver) {
		
		
		PageFactory.initElements(driver,this);
	}
	
	//utilization
	
	/**
	 * This method returns the Skillrary logo
	 * @return
	 */
	public WebElement getLogo() {
		
		return logo;
		
		
	}
	
	/**
	 * Thsi method is used to click on gears tab
	 */

	public void clickGearsTab() {
		
		gearsTab.click();
	}
	
	/**
	 * This method is used to click on Skillrary demo app link
	 */
	public void clickSkillraryDemoApp() {
		
		skillraryDemoAppLink.click();
	}
}
