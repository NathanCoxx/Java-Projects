import java.util.Scanner;

import static java.lang.Character.isLowerCase;

public class MethodsLab {
    public static void main(String[] args) {

        //Problem 1
        System.out.println("Question 1");
        String sInput = "";
        int numVowels = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string of characters:");
        sInput = input.nextLine();

        char[] cInput = sInput.toCharArray();
        for(char c : cInput){
            if(isVowel(c)) numVowels++;
        }
        System.out.println("Vowels: " + numVowels);

        //Problem 2
        System.out.println("Question 2");
        char c;
        System.out.println("Enter an uppercase letter");
        c = input.next().charAt(0);
        testCase(c);

        //Problem 3
        System.out.println("Question 3");
        System.out.println("Enter number 1:");
        int no1=input.nextInt();
        System.out.println("Enter number 2:");
        int no2=input.nextInt();
        ismultiple(no1,no2);

        //Problem 4
        System.out.println("Question 4");
        int x;
        System.out.println("Enter an integer");
        x = input.nextInt();
        testInt(x);

        //Problem 5
        System.out.println("Question 5");
        int y;
        System.out.println("Enter an integer");
        y = input.nextInt();
        draw(y);

        //Problem 6
        System.out.println("Question 6");
        int radius;
        double area;
        System.out.println("Enter the radius of a circle: ");
        radius = input.nextInt();
        area = calcArea(radius);
        System.out.println("The area of the cirlce is: " + area);

        //Problem 7
        System.out.println("Question 7");
        int iMonth;
        String sMonth;
        System.out.println("Enter a number 1 - 12");
        iMonth = input.nextInt();
        while(iMonth < 1 || iMonth > 12){
            System.out.println("Please enter a valid number");
            iMonth = input.nextInt();
        }
        sMonth = findMonth(iMonth);
        System.out.println("The name of the month is: " + sMonth);



    }
    //Problem 1
    public static boolean isVowel(char testChar) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        for (char c : vowels) {
            if (testChar == c)
                return true;
        }
        return false;
    }
    //Problem 2
    public static void testCase(char testChar){
        if(isLowerCase(testChar))
            System.out.println("The character is already lowercase.");
        else{
            char up;
            up = Character.toLowerCase(testChar);
            System.out.println(up);
        }
    }
    //Problem 3
    public static void ismultiple(int no1,int no2)
    {
        if(no2%no1==0)
            System.out.println("Yes second number is multiple of 1st number");
        else
            System.out.println("No, second number is not multiple of 1st number");
    }
    //Problem 4
    public static void testInt(int x){
        if(x % 2 == 0)
            System.out.println("The number is Even");
        else
            System.out.println("The number is Odd");
    }
    //Problem 5
    public static void draw(int x){
        for(int i = 0; i < x; i++){
            for(int j = 0; j < x; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //Problem 6
    public static double calcArea(int radius){
        double area;
        area = Math.PI * (radius * radius);

        return area;
    }
    //Problem 7
    public static String findMonth(int month){
        String[] months = {"January", "February", "March", "April",  "May", "June", "July", "August", "September", "October", "November", "December"};
        return months[month - 1];
    }







}//End class