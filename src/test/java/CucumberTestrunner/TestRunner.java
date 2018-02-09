package CucumberTestrunner;




import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
		features = "feature/VerifyReservedTrainSchedulePage.feature"
		,glue={"stepdefination"}
		)

public class TestRunner extends AbstractTestNGCucumberTests  {

}
