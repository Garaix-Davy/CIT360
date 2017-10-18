package edu.garaix.mvc;

public class Model {
	
	private double wage;
	private double hours;
	private double salary;
	
	public Model () {
		
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	// Method where the calculation happens.
	public void convertWageToSalary(double wage, double hours) {
		this.salary = wage*hours*52;
	}

	
}
