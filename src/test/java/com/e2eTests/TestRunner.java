package com.e2eTests;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith (Cucumber.class)
@CucumberOptions(
		features= {"src/specs/features"},
		//glue= {""},
		plugin = {"pretty","html:target/cucumber-html-report"},
		tags = {("@bouletcore")},
		snippets = SnippetType.CAMELCASE,
		monochrome = true		
		)


public class TestRunner {

}
