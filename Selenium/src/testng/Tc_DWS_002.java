package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Tc_DWS_002 extends BaseClass {
	@Test
public void addProductToCart() {
	Reporter.log("Product added to cart successfully",true);
}
}
