package lab_6;

public class Book extends WrittenItem {
	public Book() {
		super();
	}
	public Book(int i, String t, int c, String a) {
		super(i, t, c, a);
	}
	public void print() {
		System.out.println("Display info about a book");
		System.out.println("ID: " + super.getId() + "\nTITLE: " + super.getTitle()  + "\nAUTHOR: " + super.getAuthor() + "\nNUMBER OF COPIES: " + super.getCopies());
	}
	public String toString() {
		return "Display info about a book\n" + super.toString();
	}
	
}
