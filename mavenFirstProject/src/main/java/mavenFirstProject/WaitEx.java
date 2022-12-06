package mavenFirstProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WaitEx {

	RemoteWebDriver rd;
	@Test
	public void test01() {
		System.setProperty("Webdriver.chromedriver","javabykiran-Selenium-Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	  driver.get("file:///C:/Users/Shubham/AppData/Local/Temp/Rar$EXa0.718/javabykiran-Selenium-Softwares/Offline%20Website/index.html");

	  driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
	  
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  
	  WebElement logo=driver.findElement(By.xpath("/html/body/div/center/img"));
	  
	  WebDriverWait wait=new WebDriverWait(driver,30);
	  wait.until(ExpectedConditions.visibilityOf(logo));
	  
	  
			  
	}

	
	
	
	
	
	
}
