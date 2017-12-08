package garaix.cit360;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SwapTest {

	@Test
	void swapTest() {
		Swapper swap = new Swapper();
		String phrase1 = swap.Swap("Today, {name} went to the store.", "{name}", "Davy");
		String expectedResults1 = "Today, Davy went to the store.";
		
		assertEquals(expectedResults1, phrase1, "{name} mustbe replaced with \"Davy");
		
		// verifies that they aren't the same object
		// In other words, it verifies that the test is actually using the method and not simply a repeat of the string.
		// A test to verify the test
		assertNotSame(expectedResults1, phrase1);
		
		String phrase2 = swap.Swap("La v{accent}rit{accent} est ensoleill{accent}e.", "{accent}", "é");
		assertEquals("La vérité est ensoleillée.", phrase2, "All occurences must be replaced.");
		
		String phrase3 = swap.Swap("{number} plus {number} does not equal {number}.", "{number}", "two");
		assertEquals("Two plus two does not equal two.", phrase3, "The initial occurence should have its first letter capitalized.");
		
	}

}
