package SmkCls;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SmkClass {
	
	@Given("smk chosen")
	public void smk_chosen() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Line1 Given");
	}

	@When("enters this section")
	public void enters_this_section() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Line2 When");
	}

	@Then("produce smoke test report")
	public void produce_smoke_test_report() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Line3 Then");
	}


}
