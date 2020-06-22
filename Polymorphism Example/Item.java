package lab_6;

public abstract class Item {
	
	private int id;
	private String title;
	private int copies;
	
	public Item() {
		id = 0;
		title = " ";
		copies = 0;
	}
	public Item(int i, String t, int c) {
		id = i;
		title = t;
		copies = c;
	}
	public void setId(int i) {
		id = i;
	}
	public void setTitel(String t) {
		title = t;
	}
	public void setCopies(int c) {
		copies = c;
	}
	public int getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public int getCopies() {
		return copies;
	}
	public boolean equals(Item t) {
		return id == t.id && title == t.title && copies == t.copies;
	}
	public String toString() {
		return "ID: " + id + "\nTITLE: " + title + "\nNUMBER OF COPIES: " + copies; 
	}
	public void print() {
		System.out.println("ID: " + id + "\nTITLE: " + title + "\nNUMBER OF COPIES: " + copies);
	}
	public void checkIn() {
		copies++;
	}
	public void checkOut() {
		copies--;
	}
	public void addItem() {
		copies++;
	}
}
