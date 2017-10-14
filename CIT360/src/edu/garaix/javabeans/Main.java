package edu.garaix.javabeans;

public class Main {

	public static void main(String[] args) {
		
		Book book = new Book();		
		
		book.setCategory("Fantasy");
		book.setTitle("Lord of the Rings");
		book.setAuthor("J.R.R. Tolkien");
		book.setPages(1200);
		book.setYear(1954);
		book.setPrice(30.00);
		
		System.out.println(book.toString());
		
		Book book2 = new Book("Le Petit Prince","Novella","Antoine de Saint-Exupery",85,1943,8);
		
		//System.out.println(book2.toString());
		
		book.setPrice(book2.getPrice());
		
		System.out.println(book.toString());

	}

}
