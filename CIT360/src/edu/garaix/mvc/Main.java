package edu.garaix.mvc;

import javax.swing.*;

public class Main {

	
	public static void main(String[] args) {
		
		// Each object part of the MVC is instantiated here
		Model model = new Model();
		View view = new View(model);
		Controller controller = new Controller(model,view);
		
		view.setVisible(true);

	}

}
