package edu.garaix.javabeans;

import java.io.Serializable;

// Another example of a class with the Java Beans standard
// Implements Serializable, has private properties, getters and setters, and a public no-argument constructor.

public class Trees implements Serializable{

	private int height;

	public Trees() {
		
	}
	
	public Trees(int height) {
		super();
		this.height = height;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
}
