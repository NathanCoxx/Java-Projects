package lab5;

public class Person {

	private String first;
	private String last;
	
	public Person() {
		first = " ";
		last = " ";
	}
	public Person(String f, String l) {
		first = f;
		last = l;
	}
	public String getFirst() {
		return first;
	}
	public String getLast() {
		return last;
	}
	public void setName(String f, String l) {
		first = f;
		last = l;
	}
	public String toString() {
		return first + " " + last;
	}
	public void printLastFirst() {
		System.out.print(last + " " + first);
	}
	public void print() {
		System.out.print(first + " " + last);
	}
	public boolean equals(Person p) {
		return first == p.first && last == p.last;
	}
	public void copy(Person p) {
		first = p.first;
		last = p.last;
	}
	public Person getCopy() {
		return new Person(first, last);
	}
	
	
	
}
