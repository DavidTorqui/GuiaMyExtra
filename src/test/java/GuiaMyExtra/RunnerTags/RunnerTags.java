package GuiaMyExtra.RunnerTags;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features="src/test/resources/features/Formulario.feature",
		tags= "@tag",
		glue="Reto1.StepDefinitions",
		snippets=SnippetType.CAMELCASE		)
public class RunnerTags {
}
