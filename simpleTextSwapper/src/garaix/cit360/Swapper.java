package garaix.cit360;

import java.util.ArrayList;

public class Swapper {
	
	public String Swap (String phrase, String placeholder, String alternate) {
		
		// Tried to reinvent the wheel here until I read about the String's replace method...
// gathers the beginning positions of all instances of the placeholder found in the phrase
//		ArrayList<Integer> placeholderPositions = new ArrayList<Integer>();		
//		int position = phrase.indexOf(placeholder);		
//		placeholderPositions.add(position);		
//		while(position >= 0) {		     
//			position = phrase.indexOf(placeholder, position+placeholder.length());
//			placeholderPositions.add(position);
//		}
//		
//		for (int i = 0; i < placeholderPositions.size(); i++) {
//			phrase = phrase.replace(placeholder,alternate);
//		}
		
		// replaces all occurences.
		phrase = phrase.replace(placeholder,alternate);
		
		// capitalizes the first letter and appends the rest of the phrase
		return phrase.substring(0, 1).toUpperCase() + phrase.substring(1);
	}
	
}
