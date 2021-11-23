package com.runnerFile;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="marsrover/Features",plugin= {"pretty","html:target/cucmber-html-report","json:target/cucumber.json","junit:target/cucumber.xml"},
		glue= {"src/test/java/StepDefinations/PositionOfRover.java"})

public class testRunnerFile {

}
