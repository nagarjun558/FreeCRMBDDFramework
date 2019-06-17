package Runner;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
		        features="C:\\Users\\Nagarjun\\workspace\\FreeCRMBDDFramework\\src\\main\\java\\Features\\dealsmap.feature"
		        ,glue={"stepDefinition"},
		        format={"pretty","html:test-output","json:json_output/cucumber.json"},
		        monochrome = true,
		        strict = true,
		        dryRun = false
		        )



public class TestRunner 
{

}
