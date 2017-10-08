package edu.garaix.collections;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class JavaSets {

	public static void main(String[] args) {
		// Sets do not allow duplicate elements
		// Elements are not stored in order
		
		// Sets can remove duplicates from lists
		List<Integer> oneToTwenty = new LinkedList<>();
		Scanner in = new Scanner(System.in);
		Random rand = new Random();
		for (int i = 1; i<20; i++) {
			oneToTwenty.add(rand.nextInt(20)+1);
		}
		
		System.out.println("This list will most likely contain duplicates:");
		System.out.println(oneToTwenty);
		
		System.out.println("Passing the list to a Set will remove duplicates and sort it. Proceed? (Y)");
		
		String answer = in.nextLine();
		
		if (answer.equalsIgnoreCase("Y")) {
			Set<Integer> uniques = new HashSet<>(oneToTwenty);
			System.out.println("This Set filtered out the duplicates:");
			System.out.println(uniques);
		} else {
			System.out.println("You're no fun...");
		}
		
		System.out.println("\nI am now going to generate a Set with a capacity of 100 numbers.");
		System.out.println("I am also going to roll a 100-sided die 100 times.");
		System.out.println("Let's see how many non-duplicates I can get.");
		System.out.println("Proceed? (Y)");
		
		answer = in.nextLine();
		int uniques = 0;
		int dupes = 0;
		if (answer.equalsIgnoreCase("Y")) {
			Set<Integer> hundred = new HashSet<>(100);

			
			for (int i = 1; i<=100; i++) {
				if (hundred.add(rand.nextInt(100)+1)) {
					uniques++;
				} else {
					dupes++;
				}
			}
			
			System.out.println("Out of 100 rolls, " + uniques + " were uniques and " + dupes + " were duplicates.");
			System.out.println("The final Set contains:");
			System.out.println(hundred);
			
		} else {
			System.out.println("Oh, you're no fun...");
		}
	}

}
