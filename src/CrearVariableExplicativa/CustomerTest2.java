package CrearVariableExplicativa;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CustomerTest2{


	@Test
	public void testApplyDiscountTrue() {
		Customer2 customer = new Customer2("Eugene Krabs", 24, 600);
		float expected = 37.935f;
		float actual = customer.applyDiscount(42.15f);
				
		assertEquals("Discount should be applied", expected, actual, 0.01f);
	}
	
	@Test
	public void testApplyDiscountFalse() {
		Customer2 customer = new Customer2("Eugene Krabs", 24, 3042);
		float expected = 42.15f;
		float actual = customer.applyDiscount(42.15f);
				
		assertEquals("Discount should be applied", expected, actual, 0.01f);
	}

}