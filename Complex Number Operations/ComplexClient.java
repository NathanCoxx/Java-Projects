package assignment2;

import java.util.*;

public class Assignment2_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double real, imaginary;
		int userIn = 1; 
		int count = 0;
		
		ComplexNumber c1 = new ComplexNumber();
		ComplexNumber c2 = new ComplexNumber();

		while(userIn != 0) {	
			userIn = menu(input);

			switch(userIn) {
			case 1:
				
				System.out.print("Enter complex number (real imaginary) : ");
				real = getDouble(input);
				imaginary = getDouble(input);
				c1.read(real, imaginary);
				System.out.print("Enter complex number (real imaginary) : ");
				real = input.nextDouble();
				imaginary = input.nextDouble();
				c2.read(real, imaginary);
				System.out.println("First complex number is: " + c1);
				System.out.println("Second complex number is: " + c2);
				System.out.println("Result: " + c1 + " + " + c2 + " = " + c1.add(c2));
				count++;
				System.out.printf("%39s%d%s%n%n", "Command number ",count," completed."); 
				break;

			case 2:
				
				System.out.print("Enter complex number (real imaginary) : ");
				real = getDouble(input);
				imaginary = getDouble(input);
				c1.read(real, imaginary);
				System.out.print("Enter complex number (real imaginary) : ");
				real = input.nextDouble();
				imaginary = input.nextDouble();
				c2.read(real, imaginary);
				System.out.println("First complex number is: " + c1);
				System.out.println("Second complex number is: " + c2);
				System.out.println("Result: " + c1 + " - " + c2 + " = " + c1.subtract(c2));
				count++;
				System.out.printf("%39s%d%s%n%n", "Command number ",count," completed."); 
				break;

			case 3:
				
				System.out.print("Enter complex number (real imaginary) : ");
				real = getDouble(input);
				imaginary = getDouble(input);
				c1.read(real, imaginary);
				System.out.print("Enter complex number (real imaginary) : ");
				real = input.nextDouble();
				imaginary = input.nextDouble();
				c2.read(real, imaginary);
				System.out.println("First complex number is: " + c1);
				System.out.println("Second complex number is: " + c2);
				System.out.println("Result: " + c1 + " * " + c2 + " = " + c1.multiply(c2));
				count++;
				System.out.printf("%39s%d%s%n%n", "Command number ",count," completed."); 
				break;

			case 4:
				
				System.out.print("Enter complex number (real imaginary) : ");
				real = getDouble(input);
				imaginary = getDouble(input);
				c1.read(real, imaginary);
				System.out.print("Enter complex number (real imaginary) : ");
				real = input.nextDouble();
				imaginary = input.nextDouble();
				c2.read(real, imaginary);
				System.out.println("First complex number is: " + c1);
				System.out.println("Second complex number is: " + c2);
				System.out.printf("%s%s%s%s%s%s", "Result: ", c1,  " / ", c2, " = ", c1.divide(c2));
				count++;
				System.out.printf("%39s%d%s%n%n", "Command number ",count," completed."); 
				break;

			case 5:
				
				System.out.print("Enter complex number (real imaginary) : ");
				real = getDouble(input);
				imaginary = getDouble(input);
				c1.read(real, imaginary);
				System.out.println("The complex number is: " + c1);
				System.out.println("Result: |" + c1 + "| = " + c1.cAbs());
				count++;
				System.out.printf("%39s%d%s%n%n", "Command number ",count," completed."); 
				break;

			case 6:
				
				System.out.print("Enter complex number (real imaginary) : ");
				real = getDouble(input);
				imaginary = getDouble(input);
				c1.read(real, imaginary);
				System.out.print("Enter complex number (real imaginary) : ");
				real = input.nextDouble();
				imaginary = input.nextDouble();
				c2.read(real, imaginary);
				System.out.println("First complex number is: " + c1);
				System.out.println("Second complex number is: " + c2);
				if(c1.equals(c2)) 
					System.out.println("The complex numbers are equal.");
				else
					System.out.println("The complex numbers are NOT equal. ");
				count++;
				System.out.printf("%39s%d%s%n%n", "Command number ",count," completed."); 
				break;
			case 0: 
				System.out.println("Testing completed.");
				break;
				
			default:
				System.out.println("ERROR!!! Choose a number between 0 and 6.");
				break;
			} 	
		}//end while
	
	
}

public static int menu(Scanner input) {
	int i;

	System.out.printf("%s%n","Your options are:");
	System.out.printf("%s%n","-----------------");
	System.out.printf("%9s" + ")Add 2 complex numbers",1);
	System.out.printf("%n%9s" + ")Subtract 2 complex numbers",2);
	System.out.printf("%n%9s" + ")Multiply 2 complex numbers",3);
	System.out.printf("%n%9s" + ")Divide 2 complex numbers",4);
	System.out.printf("%n%9s" + ")Absolute value",5);
	System.out.printf("%n%9s" + ")Compare 2 complex numbers",6);
	System.out.printf("%n%9s" + ")EXIT",0);
	System.out.print("\nPlease enter your option: ");
	while(!input.hasNextInt()) {
		System.out.printf("%s","ERROR! Enter an integer. ");
		input.next();
	}
	i = input.nextInt();
	return i;
}
public static double getDouble(Scanner input) {
	while(!input.hasNextDouble()) {
		System.out.println("ERROR! Enter a double: ");
		input.next();
	}
	return input.nextDouble();
}
}

