package com.med.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {
	WebDriver driver =null;
	private By org = By.cssSelector("input[name='code']");
	private By submit = By.cssSelector("button[type='submit']");
	private By username =By.cssSelector("input[name='username']");
	private By password =By.cssSelector("input[name='password']");
	private By username1 =By.cssSelector("input[name='email']");
	
	public void openApplication() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://site-qa.medable.com/org-select");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	public void setOrganisation(String organisation) {
		driver.findElement(org).sendKeys(organisation);
		driver.findElement(submit).click();
	}
	
	public void enterCredentials(String un ,String pwd, String name) throws InterruptedException {
		Thread.sleep(6000);
		if(name.equalsIgnoreCase("email")) {
			driver.findElement(username1).sendKeys(un);
		}else {
			driver.findElement(username).sendKeys(un);
		}
		
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(submit).click();
	}
	
	public String getTittleOfPage() throws InterruptedException {
		Thread.sleep(4000);
		return driver.getTitle();
	}

}
