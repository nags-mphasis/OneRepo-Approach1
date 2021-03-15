package SmkCls;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="Smoke/SmkFtr", glue={"SmkCls"},
	monochrome = true,
	plugin = {"pretty", "json:target/SmkReports/Smk.json"})

public class SmkRunner {

}
