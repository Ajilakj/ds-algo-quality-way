package runner;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


	@RunWith(Cucumber.class) //Junit execution

		@CucumberOptions(
				plugin = {"pretty", "html:target/quality_way.html"}, //reporting purpose
				monochrome=false,  //console output color
				tags = "@home", //tags from feature file
				features = {"src/test/resources/features"}, //location of feature files - folder name
				glue= "step_definition") //location of step definition files - package name


		public class TestRunner extends AbstractTestNGCucumberTests{
			
			@Override
		    @DataProvider(parallel = false)
		    public Object[][] scenarios() {
						
				return super.scenarios();
		    }

	}
