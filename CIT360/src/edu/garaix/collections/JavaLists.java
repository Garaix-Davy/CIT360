package edu.garaix.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class JavaLists {

	public static void main(String[] args) {	
		
		// Lists automatically expand without having to resize them
		// ArrayLists are best for retrieving, setting, iterating through and getting information about it.
		// LinkedLists are best for adding/removing elements at the end.
		
		// Using LinkedList for more efficient adding
		List<String> shoppingLinkedList = new LinkedList<String>();		
		Scanner in = new Scanner(System.in);
		System.out.println(menuMessage());
		
		String newItem = in.nextLine();
		while (newItem.equalsIgnoreCase("quit")==false) {
			
			if (newItem.equalsIgnoreCase("list")){
				
				if (shoppingLinkedList.isEmpty()) {
					System.out.println("Your shopping list is empty.");
					System.out.println(menuMessage());
					newItem = in.nextLine();
				} else {
					System.out.println("Items in your shopping list:");
					
					// Using ArrayList for more efficient iteration
					List<String> shoppingArrayList = new ArrayList<String>(shoppingLinkedList);
					Iterator<String> iterator = shoppingArrayList.iterator();
					while (iterator.hasNext()) {
					    System.out.println(iterator.next());
					}
					newItem = in.nextLine();
				}
			} else {
				shoppingLinkedList.add(newItem);
				System.out.println(menuMessage());
				newItem = in.nextLine();
			}		
		}		
		System.out.println("Have a nice trip to the store. Your shopping list:" + shoppingLinkedList);
		in.close();
	}
	
	public static String menuMessage() {
		return "\nPlease add an item to your shopping list.\nOptions: LIST, QUIT";
	}

}
