package edu.garaix.collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

public class JavaQueue {

	public static void main(String[] args) {
		// Queue has a head and a tail
		// Queues operate on a FILO (first in last out).
		// Elements are maintained in their insertion order.
		// Deque or a double ended queue has 2 heads. Elements can be added or removed from both ends.
		// Duplicate elements are allowed.
		// A blocking queue waits for the queue to become non-empty when retrieving an element.
		// BlockingDeque is the same but with two ends.
		// Using contains and remove on a Queue (for other than the head) is slow.
		
		Queue<Integer> DMVQueue = new LinkedList<>();
		Scanner in = new Scanner(System.in);
		Random rand = new Random();
		int position, q, processed, arrived;
		
		for (q = 1; q <= 10 ; q++) {
			DMVQueue.add(q);
	    }
		
		position = DMVQueue.size();
		
		System.out.println(DMVQueue);
		System.out.println("You have arrived at the DMV. Your number is " + position + ".");
		System.out.println("Please have a seat. Type WAIT or LEAVE.");

		String waiting = in.nextLine();
		
		while (waiting.equalsIgnoreCase("leave")==false) {
			
			if (waiting.equalsIgnoreCase("wait")) {
				
				// A random number of people were served while you waited.
				processed = rand.nextInt(3);				
				for (int i = processed; i > 0; i--) {
					DMVQueue.remove();
				}
				
				// A random number of people arrived while you waited.
				arrived = rand.nextInt(7)+ 1;				
				for (int i = arrived; i > 0; i--) {
					DMVQueue.add(q);
					q++;
				}

				System.out.println(DMVQueue);
				System.out.println(processed + " were served and " + arrived + " arrived while you waited!");
				
					if (DMVQueue.peek() == position) {
						System.out.println("You're next in line!");
					} else if (DMVQueue.peek() < position){
						System.out.println("Your position is still " + position + ". Hang in there! Type WAIT or LEAVE.");
						
					} else {
						System.out.println("It looks like you were served. Enjoy your day!");
						break;
					}
					
			} else {
				System.out.println("Type WAIT or LEAVE.");
			}
			
			waiting = in.nextLine();
			
		}
		
		System.out.println("You left the DMV.");
	}

}
