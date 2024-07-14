package hook;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook {

	@Before// this is a generic method for all the feature files and scenarios
	public void beforePreCondition() {
		
		System.out.println("*****=========*****");
	
		System.out.println("Before method execution");
	}
	
	@Before("@Search")//pre-condition from search feature file, this is a precondition specific to scenario
	public void beforeSearch() {
		
		System.out.println("*****=========*****");
	
		System.out.println("Login code execution");
	}
	
	
	
	@After
	public void afterPostCondition() {
	System.out.println("*****=========*****");

	System.out.println("After method execution");
}
	
	
}
