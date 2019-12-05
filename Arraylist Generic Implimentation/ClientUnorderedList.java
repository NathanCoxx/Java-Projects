package Agnment3GENARICS;

/*
 * NAME: BENJAMIN KING AND NATHAN COX
 * 
 * CLASS: COSC 237.001
 * 
 * ASSIGNMENT 3
 * 
 */
import java.io.*;
import java.util.Scanner;

public class ClientUnorderedList {
	public static final int SIZE = 20;
	public static void main(String[] args){
		Scanner inputFile = null;
		Scanner inputFile2 = null;
		String filename1, filename2;
		Integer listKey;
		boolean fileOpened = true;
		Scanner input = new Scanner(System.in);
		UnorderedArrayList<Integer> list_1 = new UnorderedArrayList<Integer>(SIZE);
		UnorderedArrayList<Integer> list_2 = new UnorderedArrayList<Integer>(SIZE);
		UnorderedArrayList<Integer> mergedList = new UnorderedArrayList<Integer>(SIZE);

		System.out.print("Please input the name of the file to be opened for first list:");
		filename1 = input.next();
		System.out.print("Please input the name of the file to be opened for second list:");
		filename2 = input.next();
		try {
			inputFile = new Scanner(new File(filename1));

		}catch(FileNotFoundException sMsg) {
			System.err.println("File was not found");
			fileOpened = false;
		}
		if(fileOpened) {
			while(inputFile.hasNext()) {
				if(inputFile.hasNextInt()) {
					list_1.insertEnd(inputFile.nextInt());
				}
				else
					inputFile.next();
			}
			inputFile.close();
		}
		try {
			inputFile2 = new Scanner(new File(filename2));

		}catch(FileNotFoundException sMsg) {
			System.err.println("File was not found");
			fileOpened = false;
		}
		if(fileOpened) {
			while(inputFile2.hasNext()) {
				if(inputFile2.hasNextInt()) {
					list_2.insertEnd(inputFile2.nextInt());
				}
				else
					inputFile2.next();
			}
			inputFile2.close();
		}
		System.out.println("The first list is: ");
		list_1.print();
		System.out.println("The second list is: ");
		list_2.print();
		mergedList = list_1.merge(list_2);
		System.out.println("The merged list is: ");
		mergedList.print();
		listKey = getInt(input, "Enter key for split: ");
		list_1.clearList();
		list_2.clearList();
		list_1 = mergedList.split(list_2, listKey);
		System.out.println("The first list after split is:  ");
		list_1.print();
		System.out.println("The second list after split is: ");
		list_2.print();
	}
	public static int getInt(Scanner input, String prompt){
		System.out.print(prompt);
		while(!input.hasNextInt()){
			System.out.print("Not an integer. Try again: ");
			input.next();
		}
		return input.nextInt();
	}
}
