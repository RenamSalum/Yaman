package br.com.srBarriga.runner;
 
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty", "html:target/cucumber"},
		features="src/test/resources/Cadastrar.feature",
		glue="br.com.srBarriga.stepDefinition",
		name ="Acesso a conta",
		monochrome=true,
		strict=true,
		dryRun=true)
public class AcessarRunner {
	
}
