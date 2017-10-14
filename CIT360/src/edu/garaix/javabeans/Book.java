package edu.garaix.javabeans;

import java.io.Serializable;

public class Book implements Serializable { // Implements Serializable - JavaBean standard
	
	// Private properties - JavaBean standard
	private String title;
	private String category;
	private String author;
	private int year;
	private int pages;
	private double price;	
	
	// Public no-argument constructor - JavaBean standard 
	public Book() {
		
	}

	public Book(String title, String category, String author, int year, int pages, double price) {
		super();
		this.title = title;
		this.category = category;
		this.author = author;
		this.year = year;
		this.pages = pages;
		this.price = price;
	}

	// Getters and Setters - JavaBean standard
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public String toString() {
		return "Title: " + title + "\nCategory: " + category + "\nAuthor: " + author
				+ "\nPages: " + pages + "\nYear: " + year
				+ "\nPrice: $" + String.format( "%.2f", price );
	}
	
	
}
