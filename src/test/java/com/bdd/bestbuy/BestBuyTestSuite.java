package com.bdd.bestbuy;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features/bestbuy",
        glue = "com.bdd.bestbuy"
)
public class BestBuyTestSuite {
}
