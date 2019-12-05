/*
 * Name: Nathan Cox
 * Class: COSC 237:001
 */


package lab11;

import java.util.*;

public class lab11Client {
	public static void main(String[] args) {
		char c;
		int n, b;
		Scanner input = new Scanner(System.in);
		do {
		n = getInt(input, "Enter a positive integer: ");
		while(n < 0){
			System.out.print("INVALID! Should be positive! REENTER: ");
			n = getInt(input, "");
		}
		b = getInt(input, "Enter a positive integer for base: ");
		while(b < 0){
			System.out.print("INVALID! Should be positive! REENTER: ");
			n = getInt(input, "");
		}
		System.out.println("Sum of digits for " + n + " is " + sumOfDigits(n) + " (iterative solution)");
		System.out.println("Sum of digits for " + n + " is " + recursiveSum(n) + " (recursive solution)");
		System.out.println(n + " in binary code is " + toBinary(n) + " (iterative solution)");
		System.out.println(n + " in binary code is " + recursiveToBinary(n) + " (recursive solution)");
		System.out.println(n + " in base " + b + " is " + toBase(b, n) + " (iterative solution)");
		System.out.println(n + " in base " + b + " is " + recursiveToBase(b, n) + " (recursive solution)");
		System.out.print("Do you want to continue (y/Y):");
		c = input.next().charAt(0);
		}while(c == 'y' || c == 'Y');

	}
	
	public static int getInt(Scanner input, String prompt){
		System.out.print(prompt);
		while(!input.hasNextInt()){
			System.out.print("WRONG TYPE! Not a positive integer! REENTER: ");
			input.next();
		}
		return input.nextInt();
	}
	//Part 2 Problem 1
	public static int sumOfDigits(int n) {
		int sum = 0;
		while(n != 0) {
			sum += n % 10;
			n = n / 10;
		}
		return sum;
	}
	//Part 2 Problem 2
	public static int recursiveSum(int n) {
		if(n == 0)
			return 0;
		else
			return n % 10 + recursiveSum(n / 10);
	}
	//Part 2 Problem 3
	public static String toBinary(int n) {
		String bStr = "";
		while(n != 0) {
			bStr = (n % 2) + bStr;
			n = n / 2;
		}
		return bStr;

	}
	//Part 2 Problem 4
	public static String recursiveToBinary(int n) {
		if(n == 0)
			return "";
		else
			return recursiveToBinary(n / 2) + (n % 2);	
	}
	//Part 2 Problem 5
	public static String toBase(int b, int n) {
		String bStr = "";
		while(n != 0) {
			bStr = (n % b) + bStr;
			n = n / b;
		}
		return bStr;

	}
	//Part 2 Problem 6
	public static String recursiveToBase(int b, int n) {
		if(n == 0)
			return "";
		else
			return recursiveToBase(b, n / b) + (n % b);	
	}
}
