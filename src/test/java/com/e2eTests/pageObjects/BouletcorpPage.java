package com.e2eTests.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTests.utils.Setup;

public class BouletcorpPage {
	
	WebDriver driver;
	
	 public BouletcorpPage(){
		 driver = Setup.driver;
	 }

	/*Locators*/
	final static String ALEATOIRE_XPATH = "//*[contains(text(),'Aléatoire')]";
	final static String FACEBOOK_XPATH = "//img[@title= 'Facebook']";
	final static String TWITTER_XPATH= "//img[@title= 'Twitter']";
	final static String TUMBLR_XPATH= "//a[@title= 'Share on Tumblr']";
	
	/* @Find By*/
	@FindBy(how=How.XPATH,using=ALEATOIRE_XPATH)
	public static WebElement aleatoire;
	@FindBy (how=How.XPATH,using=FACEBOOK_XPATH)
	public static WebElement facebook;
	@FindBy (how=How.XPATH,using=TWITTER_XPATH)
	public static WebElement twitter;
	@FindBy(how=How.XPATH,using=TUMBLR_XPATH)
	public static WebElement tumblr;
	
	/*Methods*/
	public void ClickAleatoire() {
		aleatoire.click();
	}
	
	public void CheckURLChanged() {
		String actualURL = driver.getCurrentUrl();
		if(actualURL != ("http://www.bouletcorp.com"))
			System.out.println("UEL changes is made");
		else System.out.println("URL changes is not made");
	}
	
	
	
}
