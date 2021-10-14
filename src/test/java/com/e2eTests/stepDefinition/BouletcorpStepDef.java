package com.e2eTests.stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.e2eTests.pageObjects.BouletcorpPage;
import com.e2eTests.utils.CommonMethods;
import com.e2eTests.utils.Setup;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class BouletcorpStepDef {
	
	public WebDriver driver;
	private BouletcorpPage bouletcorpPage = new BouletcorpPage();
	private CommonMethods commonMethods = new CommonMethods();
	
	public BouletcorpStepDef() {
		driver = Setup.driver;	
		PageFactory.initElements(driver,BouletcorpPage.class );
	}
	
	
	

	@Given("^I am on bouletcorp Website$")
	public void iAmOnBouletcorpWebsite() throws Throwable {
		commonMethods.openURLWithConfigFile("URL1");
	}

	@When("^I click on Aleatoire button$")
	public void iClickOnAleatoireButton() throws Throwable {
		bouletcorpPage.ClickAleatoire();
	}

	@Then("^page is changed$")
	public void pageIsChanged() throws Throwable {
		bouletcorpPage.CheckURLChanged();
		commonMethods.scrollerBottom();
	}

	@Then("^widgets facebook, twitter et tumblr are displayed$")
	public void widgetsFacebookTwitterEtTumblrAreDisplayed() throws Throwable {
		Boolean fb = CommonMethods.isElementDisplayed(BouletcorpPage.facebook);
		Assert.assertTrue(fb);
		Boolean twit = CommonMethods.isElementDisplayed(BouletcorpPage.twitter);
		Assert.assertTrue(twit);
		Boolean tumb = CommonMethods.isElementDisplayed(BouletcorpPage.tumblr);
		Assert.assertTrue(tumb);
		
	}


}
