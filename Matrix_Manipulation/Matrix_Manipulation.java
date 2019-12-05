package assignment1;

import java.util.*;
import java.io.*;
import java.text.*;

public class Assignment1_1 {
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  int size, c;
  int userIn = 1; 
  int count = 0;
  String prompt;

  while(userIn != 0) { 
   userIn = menu(input);

   switch(userIn) {
   case 1:
    System.out.println();
    prompt = "Enter the size of square matrices: ";
    size = getSize(input, prompt);
    int[][] addArr1 = generate(size);
    System.out.println("First matrix is: ");
    print(addArr1, size);
    int[][] addArr2 = generate(size);
    System.out.println("Second matrix is: ");
    print(addArr2, size);
    int[][] arrResult = addition(addArr1, addArr2, size);
    System.out.println("The resulting matrix is: ");
    print(arrResult, size);
    count++;
    System.out.printf("%39s%d%s%n%n", "Command number ",count," completed."); 
    break;

   case 2:
    System.out.println();
    prompt = "Enter the size of square matrices: ";
    size = getSize(input, prompt);
    int[][] subArr1 = generate(size);
    System.out.println("First matrix is: ");
    print(subArr1, size);
    int[][] subArr2 = generate(size);   
    System.out.println("Second matrix is: ");
    print(subArr2, size);
    int[][] subResult = subtraction(subArr1, subArr2, size);
    System.out.println("The resulting matrix is: ");
    print(subResult, size);
    count++;
    System.out.printf("%39s%d%s%n%n", "Command number ",count," completed."); 
    break;

   case 3:
    System.out.println();
    prompt = "Enter the size of square matrices: ";
    size = getSize(input, prompt);
    int[][] multArr1 = generate(size);
    System.out.println("First matrix is: ");
    print(multArr1, size);
    int[][] multArr2 = generate(size);
    System.out.println("Second matrix is: ");
    print(multArr2, size);
    int[][] multResult = multiplyMatrices(multArr1, multArr2, size);
    System.out.println("The resulting matrix is: ");
    print(multResult, size);
    count++;
    System.out.printf("%39s%d%s%n%n", "Command number ",count," completed."); 
    break;

   case 4:
    //Multiply matrix by constant
    System.out.println();
    prompt = "Enter the size of square matrices: ";
    size = getSize(input, prompt);
    prompt = "Enter the multiplication constant: ";
    c = getInt(input, prompt);
    int[][] r1 = generate(size);
    System.out.println("The matrix is: ");
    print(r1, size);
    int[][] constResult = multiplyByConstant(r1, size, c);
    System.out.println("The original matrix multiplied by " + c + " is: ");
    print(constResult, size);
    count++;
    System.out.printf("%39s%d%s%n%n", "Command number ",count," completed."); 
    break;

   case 5:
    //Transpose matrix
    System.out.println();
    prompt = "Enter the size of square matrices: ";
    size = getSize(input, prompt);
    int[][] tArr = generate(size);
    System.out.println("The matrix is: ");
    print(tArr, size);
    int[][] transposed = transposition(tArr, size);
    System.out.println("The transposed matrix is: ");
    print(transposed, size);
    count++;
    System.out.printf("%39s%d%s%n%n", "Command number ",count," completed."); 
    break;

   case 6:
    //Matrix trace
    System.out.println();
    prompt = "Enter the size of square matrices: ";
    size = getSize(input, prompt);
    int[][] matrix1 = generate(size);
    System.out.println("The matrix is: ");
    print(matrix1,size);
    System.out.print("The trace for this matrix is: ");
    System.out.println(matrixTrace(matrix1,size));
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
 public static int[][] generate(int size){
  int[][] matrix = new int[size][size];
  Random rand = new Random();

  for(int r = 0; r < size; r++) {
   for(int c = 0; c < size; c++) {
    matrix[r][c] = rand.nextInt((10 - 1) + 1) + 1;
   }
  }
  return matrix;
 }
 public static int[][] addition(int[][] matrix1, int[][] matrix2, int size){
  int[][] newMatrix = new int[size][size];

  for(int r = 0; r < size; r++) {
   for(int c = 0; c < size; c++) {
    newMatrix[r][c] = matrix1[r][c] + matrix2[r][c];
   }
  }
  return newMatrix;
 }
 public static int[][] subtraction(int[][] matrix1, int[][] matrix2, int size){
  int[][] newMatrix = new int[size][size];

  for(int r = 0; r < size; r++) {
   for(int c = 0; c < size; c++) {
    newMatrix[r][c] = matrix1[r][c] - matrix2[r][c];
   }
  }
  return newMatrix;
 }
 public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2, int size){
  int c,d,k;
  int[][] newMatrix = new int[size][size];
  int sum = 0;

  for(c = 0; c < size; c++) {
   for(d = 0; d < size; d++) {
    for(k=0; k< size; k++) {
     sum = sum + matrix1[c][k] * matrix2[k][d];
    }
    newMatrix[c][d]=sum;
    sum = 0;
   }
  }      
  return newMatrix;
 }
 public static int[][] multiplyByConstant(int[][] matrix1, int size, int n){
  int[][] newMatrix = new int[size][size];

  for(int r = 0; r < size; r++) {
   for(int c = 0; c < size; c++) {
    newMatrix[r][c] = matrix1[r][c] * n;

   }
  }
  return newMatrix;
 }
 public static int[][] transposition(int[][] matrix1, int size){
  int[][] newMatrix = new int[size][size];

  for(int r = 0; r < size; r++) {
   for(int c = 0; c < size; c++) {
    newMatrix[r][c] = matrix1[c][r];

   }
  }
  return newMatrix;
 }
 public static int matrixTrace(int[][] matrix1,int size){
  int sum = 0;
  for(int r = 0; r < size; r++){
   for(int c = 0; c < size; c++){
    if(r == c){
     sum += matrix1[r][c];
    }
   }
  }
  return sum; 
 }
 public static void print(int[][] arr, int size) {
  for(int r = 0; r < size; r++) {
   for(int c = 0; c < size; c++) {
    System.out.printf("%4d",arr[r][c]);
   }
   System.out.println();
  }
 }
 public static int getSize(Scanner input, String prompt) {
	 int s = getInt(input, prompt);
	 while(s < 0) {
		 prompt = "ERROR! Enter a positive number";
		 s = getInt(input, prompt);
	 }
	 return s;
 }
 public static int getInt(Scanner input, String prompt){
	  System.out.print(prompt);
	      while(!input.hasNextInt()){
	   System.out.print("ERROR! Enter an integer: ");
	   input.next();
	  }
	  return input.nextInt();
	 }
 public static int menu(Scanner input) {

  int i;

  System.out.printf("%s%n","Your options are:");
  System.out.printf("%s%n","-----------------");
  System.out.printf("%9s" + ")Add 2 matrices",1);
  System.out.printf("%n%9s" + ")Subtract 2 matrices",2);
  System.out.printf("%n%9s" + ")Multiply 2 matricies",3);
  System.out.printf("%n%9s" + ")Multiply matrix by a constant",4);
  System.out.printf("%n%9s" + ")Transpose matrix",5);
  System.out.printf("%n%9s" + ")Matrix trace",6);
  System.out.printf("%n%9s" + ")EXIT",0);
  String prompt = "\nPlease enter your option: ";
  
  i = getInt(input, prompt);

  /*while(i <= -1 || i > 6 ) {
   System.out.printf("%s","ERROR! Please enter a valid number. ");
   i = input.nextInt();
  }*/

  return i;
 }
}