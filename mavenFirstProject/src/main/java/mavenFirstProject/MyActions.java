package mavenFirstProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MyActions {


	@Test
	public void test01() {
	   		System.setProperty("Webdriver.chromedriver","javabykiran-Selenium-Softwares\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
      driver.get("file:///C:/Users/Shubham/Desktop/Java/javabykiran-Selenium-Softwares/Offline%20Website/index.html");

       
		 WebElement logo=driver.findElement(By.xpath("/html/body/div/center/img"));
	
		 Actions act=new Actions(driver);
		 act.contextClick(logo).pause(2000).perform();
		 driver.close();
		 
		 driver=new ChromeDriver();
		 act=new Actions(driver);
		 driver.get("https://javabykiran.com/playground/drag-and-drop");
		 
		 WebElement source =driver.findElement(By.xpath("/html/body/div/div/h2"));
		 
	//	 act.moveToElement(link).pause(2000).contextClick(link).build().perform();
	}
}


