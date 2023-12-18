package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_001 {
	@Test
	public void remove() {
		Reporter.log("remove class executed...",true);
		
	}
	@Test
	public void add() {
		Reporter.log("add method executed...",true);
	}
	@Test
	public void delete() {
		Reporter.log("delete method executed...",true);
	}
	
	
	

}
