package mavenFirstProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LocatorsEx {
	
	@Test
	public void test01() {
		
		System.setProperty("Webdriver.chromedriver","javabykiran-Selenium-Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	  driver.get("file:///C:/Users/Shubham/AppData/Local/Temp/Rar$EXa0.718/javabykiran-Selenium-Softwares/Offline%20Website/index.html");

	  driver.findElement(By.id("email"));
	  driver.findElement(By.className("form-control"));
	  driver.findElement(By.tagName("input"));
	  driver.findElement(By.name("viewport"));
	  
	  driver.findElement(By.linkText("Register a new membership"));
	  driver.findElement(By.partialLinkText("Reg"));

	  
	}

}
