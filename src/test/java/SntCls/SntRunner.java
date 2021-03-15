package SntCls;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="Sanity/SntFtr", glue={"SntCls"},
	monochrome = true,
	plugin = {"pretty", "json:target/SntReports/Snt.json"})

public class SntRunner {

}
