package assignment2;

public class ComplexNumber {
	
	private double a;
	private double b;
	
	public ComplexNumber() {
		a = 0.0;
		b = 0.0;
	}
	public ComplexNumber(double a, double b) {
		this.a = a;
		this.b = b;
	}
	public void read(double a, double b) {
		this.a = a;
		this.b = b;
		
	}
	public void print() {
		//print f two decimal places
	}
	public double getReal() {
		return a;
	}
	public double getImaginary() {
		return b;
	}
	public boolean equals(ComplexNumber n) {
		return n.a == a && n.b  == b;
	}
	public void copy(ComplexNumber n) {
		a = n.a;
		b = n.b;
	}
	public ComplexNumber getCopy() {
		return new ComplexNumber(a , b);
	}
	public String toString() {
		return "(" + a + ", " + b + ")";
	}
	public ComplexNumber add(ComplexNumber cNum) {
		return new ComplexNumber((a + cNum.a), (b + cNum.b));	
	}
	public ComplexNumber subtract(ComplexNumber cNum) {
		return new ComplexNumber((a - cNum.a), (b - cNum.b));
	}
	public ComplexNumber multiply(ComplexNumber cNum) {
		return new ComplexNumber((a * cNum.a - b * cNum.b), (a * cNum.b - b * cNum.a));
	}
	public ComplexNumber divide(ComplexNumber cNum) {
		return new ComplexNumber(((a * cNum.a + b * cNum.b) / (cNum.a * cNum.a + cNum.b * cNum.b)),
				(b * cNum.b - a * cNum.b) / (cNum.a * cNum.a + cNum.b * cNum.b));
	}
	public double cAbs() {
		return Math.sqrt(a * a + b * b);
	}
	
	
	
	
	
	
	
	
	
}
