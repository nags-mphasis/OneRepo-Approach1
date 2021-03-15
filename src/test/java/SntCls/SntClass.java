package SntCls;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SntClass {
	
	@Given("snt chosen")
	public void snt_chosen() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Line1 Given");
	}

	@When("comes inside the block")
	public void comes_inside_the_block() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Line2 When");
	}

	@Then("produce sanity test report")
	public void produce_sanity_test_report() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Line3 Then");
	}

}
