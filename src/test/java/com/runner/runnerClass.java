package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="E:\\Tharini\\Eclips WorkSpace\\cheap.air\\src\\test\\resources\\Features",
glue={"Stepexecution"},
monochrome=true)

public class runnerClass {

}
