package lab5;

public class Employee extends Person {

    private double payRate;    
    private double hoursWorked;
    private String department;
    
    public final int HOURS = 40;
    public final double OVERTIME = 1.5;
    
     //default constructor
     public Employee() {
    	 super();
    	 payRate = 0;
    	 hoursWorked = 0;
    	 department = " ";
    			 
     }
     public Employee(String first, String last, double p, double h, String d) {
    	 super(first, last);
    	 payRate = p;
    	 hoursWorked = h;
    	 department = d;
     }

     public String toString() {
    	 return "The wages for " + super.toString() + " from the " + department + " department are: $" + calculatePay();
     }

 

     public void print() {

    	System.out.print("The employee " );
        super.print();
    	System.out.println(" from the " + department + " department  worked " + hoursWorked + " hours"); 
    	System.out.println("With a pay rate of $" + payRate + ". The wages for " + super.toString() + " are $" + calculatePay());
       //Should print output like this (same line):

       //The employee xxxx from the xxxx department worked xx hours

       //with a pay rate of $xxx.xx. The wages for this employee are $xxxxx.xx

     }
     public double calculatePay() {   
    	 
    	return (hoursWorked > 40)? (40*payRate) + ((hoursWorked - 40) * OVERTIME * payRate) : payRate * hoursWorked;  
    	
    		 
     }
     

     public void setAll(String first, String last, double rate, double hours, String dep){
         super.setName(first, last);
         payRate = rate;
         hoursWorked = hours;
         department = dep;
        		
     } 
     public double getPayRate() {
    	 return payRate;
     }

 

    

     public double getHoursWorked() {
    	 return hoursWorked;
     }

    

    

     public String getDepartment() {
    	 return department;
     }

    

     public boolean equals(Employee o) {
    	 return super.equals(o) && payRate == o.payRate && hoursWorked == o.hoursWorked && department == o.department;
     }

    

     public Employee getCopy() {
    	 return new Employee(super.getFirst(), super.getLast(), payRate, hoursWorked, department);
     }

    

     public void copy(Employee e) {
    	 super.copy(e);
    	 payRate = e.payRate;
    	 hoursWorked = e.hoursWorked;
    	 department = e.department;
     }

      

}