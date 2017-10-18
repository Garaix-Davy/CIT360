package edu.garaix.mvc;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class View extends JFrame {

	// Components
	private JTextField wage = new JTextField(6);
	private JTextField hours = new JTextField(4);
	private JTextField salary = new JTextField(10);
	private JButton convert = new JButton("Convert");
	
	private Model viewModel;
	
	
	// Constructor
	View(Model model){
		
		// Initializing components
		wage.setText("10.25");
		hours.setText("40");
		salary.setEditable(false);
		
		// Layout out the components
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		panel.add(new JLabel("Please enter your hourly wage and the number of hours worked per week."));
		panel.add(new JLabel("Wage:"));
		panel.add(wage);
		panel.add(new JLabel("Hours:"));
		panel.add(hours);
		panel.add(convert);
		panel.add(new JLabel("Salary:"));
		panel.add(salary);
		
		// Finalizing the layout
		this.setContentPane(panel);
		this.pack();
		
		this.setTitle("Wage to Salary Converter");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
    String getWage() {
        return wage.getText();
    }
    
    String getHours() {
        return hours.getText();
    }    
    
    void setSalary(String finalSalary) {
        salary.setText(finalSalary);
    }
	
    void showError(String errMessage) {
        JOptionPane.showMessageDialog(this, errMessage);
    }
    
    // This method is used to set a listener on the JButton
    void addConvertListener(ActionListener conv) {
        convert.addActionListener(conv);
    }
    	
}
