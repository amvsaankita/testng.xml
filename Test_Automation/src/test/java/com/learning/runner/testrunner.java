package com.learning.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "src\\test\\java\\com\\learning\\feature\\login.feature"
,glue= {"com.learning.stepdefinition"}
)

public class testrunner {

}
