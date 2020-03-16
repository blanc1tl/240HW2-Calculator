package calculator;

public class CalculatorModel {

	private double a;
	private double b;
	
	// get the 'a' variable
	public double getA() {
		return a;
	}
	
	// set the 'a' variable
	public void setA(double a) {
		this.a = a;
	}
	
	// get the 'b' variable
	public double getB() {
		return b;
	}
	
	// set the 'b' variable
	public void setB(double b) {
		this.b = b;
	}
	
	// Adds the two variable and return the added number
	public double sum(double a, double b) {
		double totalSum;
		
		totalSum = a + b;
		
		return totalSum;
	}
	
	// subtracts the two variable and return the subtracted number
	public double sub(double a, double b) {
		double subtraction;
		
		subtraction = a - b;
		
		return subtraction;
	}
	
	// multiplies the two variable and return the multiplied number
	public double mul(double a, double b) {
		double totalMultiple;
		
		totalMultiple = a * b;
		
		return totalMultiple;
	}
	
	// divides the two variable and return the divided number
	public double div(double a, double b) {
		double totalDivid;
		
		totalDivid = a / b;
		
		return totalDivid;
	}
}
