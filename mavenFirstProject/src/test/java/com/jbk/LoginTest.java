package com.jbk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import mavenFirstProject.DashboardPage;
import mavenFirstProject.LoginPage;
import mavenFirstProject.Userpage;

public class LoginTest {
    WebDriver driver=null;
    LoginPage lp=null;
    DashboardPage dp=null;
    Userpage up=null;
	@BeforeSuite
	public void setup() {
	   
     	   		System.setProperty("Webdriver.chromedriver","javabykiran-Selenium-Softwares\\chromedriver.exe");
     	   	  WebDriver	driver=new ChromeDriver();
     	   	  driver.get("file:///C:/Users/Shubham/Desktop/Java/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
	   lp=new LoginPage(driver);
	   dp=new DashboardPage(driver);	   
	}  
	@Test
	public void test01() {
		dp=lp.validLogin();
		Assert.assertEquals(driver.getTitle(),"JavaByKiran|Dashboard");
	}	
	@Test
	public void test02() {
	String actualHeader=dp.getHeader();
	Assert.assertEquals(actualHeader,"Java By Kiran");
	}
	@Test
	public void test03() {
		up=dp.clickuser();
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | User");
	}
	
}
