package garaix.cit360;

public class SimpleAsserts {
	
	// checks to see if a number is even or not
	public boolean isEven(int number) {
		if (number%2 ==0) {
			return true;
		} else {
			return false;
		}
	}
	
	
	// increments all elements in an array
	public static void arrayBoost(int array[], int increment) {
		for (int i=0; i<array.length; i++) {
			array[i]+=increment;
		}
	}
	
}
