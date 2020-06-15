package lab5;
import java.util.*;

public class ClientEmployee {
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
        String last, first, dept;
        double pay_rate;
        double hours;
        Employee prof = new Employee("John", "Doe", 25.50, 50, "COSC"); //subclass alternate constructor invoked
        Employee newEmp = new Employee(); //subclass default constructor invoke
	
        System.out.println("Enter employee last name: ");
        last = input.next();
        System.out.println("Enter employee first name: ");
        first = input.next();
        System.out.println("Enter department: ");
        dept = input.next();
        System.out.println("Enter employee pay rate: ");
        pay_rate = input.nextDouble();
        System.out.println("Enter employee hours worked: ");
        hours = input.nextInt();
        
        newEmp.setAll(last, first, pay_rate, hours, dept);
        
        System.out.println("--- Record for both employees with overridden .toString form subclass ---");
        System.out.println(prof);
        System.out.println(newEmp);
        System.out.println("--- Output with calls to overridden method print form subclass---");
        prof.print();
        newEmp.print();
	
        System.out.println("--- Output with calls to getters from the superclass---");
	
	}
	
}
