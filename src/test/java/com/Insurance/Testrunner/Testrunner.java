package com.Insurance.Testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\MJ\\eclipse-workspace\\list\\InsuranceProject\\src\\test\\resources\\Insurance.feature",
                              glue = "com.Insurance",
                              dryRun = false,
                              monochrome = true,
                              plugin = {"html:target/html", "json:target/report.json"},
                              tags= "@Create")

public class Testrunner {

}
