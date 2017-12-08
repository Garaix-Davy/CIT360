package garaix.cit360;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class assertTests {

	@Test
	void test() {
		SimpleAsserts num = new SimpleAsserts();
		
		// Checks the functionality of the isEven method.
		assertFalse(num.isEven(5),"This assertion is looking for non-even numbers"); // success
		assertTrue(num.isEven(4),"not an even number"); // success
		
//		assertFalse(num.isEven(2),"This assertion is looking for non-even numbers"); // Fail, message displayed
//		assertTrue(num.isEven(1),"not an even number"); // Fail, message displayed
		
		// Checks the functionality of the boostArray method.
		int[] initialArray = {1,2,3};
		num.arrayBoost(initialArray,5);
		int[] expectedArray = {6,7,8};
		
		assertArrayEquals(initialArray,expectedArray);
		
	}

}
