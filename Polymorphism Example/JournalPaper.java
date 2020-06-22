package lab_6;

public class JournalPaper extends WrittenItem{
	private int year;
	
	public JournalPaper() {
		super();
		year = 0;
	}
	public JournalPaper(int i, String t, int c, String a, int y) {
		super(i, t, c, a);
		year = y;
	}
	public void setYear(int y) {
		year = y;
	}
	public int getYear() {
		return year;
	}
	public void print() {
		System.out.println("Display info about a journal.");
		super.print();
		System.out.println("PUBLICATION YEAR: " + year);
	}
	public String toString() {
		return super.toString() + "\nPUBLICATION YEAR: " + year;
	}
}
