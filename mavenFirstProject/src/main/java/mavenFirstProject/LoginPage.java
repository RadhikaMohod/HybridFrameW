package mavenFirstProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.yaml.snakeyaml.events.Event.ID;

public class LoginPage {

    WebDriver driver=null;

	@FindBy(id="email")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(xpath="//button")
	WebElement loginBtn;
	
	public  LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
		
	public void loginToApplication(String uname,String pass) {
		username.sendKeys(uname);
		password.sendKeys(pass);
		 loginBtn.click();
	}
	public DashboardPage validLogin() {
		username.sendKeys("kiran@gmail.com");
		password.sendKeys("123456");
		loginBtn.click();
		return new DashboardPage(driver);
		
	}
}
