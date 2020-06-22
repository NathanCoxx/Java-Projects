package lab_6;

public abstract class WrittenItem extends Item {
	private String author;
	
	public WrittenItem() {
		super();
		author = " ";
	}
	public WrittenItem(int i, String t, int c, String a) {
		super(i, t, c);
		author = a;
	}
	public void setAuthor(String a) {
		author = a;
	}
	public String getAuthor() {
		return author;
	}
	public boolean equals(WrittenItem i) {
		return super.equals(i) && author == i.author;
	}
	public String toString() {
		return super.toString() + "\nAUTHOR: " + author;
	}
	public void print() {
		System.out.println("ID: " + super.getId() + "\nTITLE: " + super.getTitle()  + "\nAUTHOR: " + author + "\nNUMBER OF COPIES: " + super.getCopies());
	}
	
}
