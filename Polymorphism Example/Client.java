package lab_6;

public class Lab6_Client {
	public static void main(String[] args) {
		Book TKM = new Book(123456, "To kill a mocking bird", 5, "Harper Lee");
		Video Godfather = new Video(1111, "The Godfather", 3, 215, "Francis Ford Coppola", "drama", 1981);
		CD DSOM = new CD(1587, "Dark Side of the Moon", 2, 45, "Pink Floyd", "rock");
		JournalPaper FOE = new JournalPaper(2258, "The Future of Everything", 4, "David Orrell", 2007);
		
		
		TKM.print();
		//Check out a copy of TKM
		TKM.checkOut();
		System.out.println("After the book was checked-out, the number of copies changed. The new info is:");
		TKM.print();
		//Add a  new copy of the book
		TKM.addItem();
		System.out.println("After a new copy of this book was added, the number of copies changed. The new info is: ");
		TKM.print();
		
		//Display info about godfather
		Godfather.print();
		//Check in a copy of godfather
		Godfather.checkIn();
		System.out.println("After the video was checked-in, the nubmer of copes changed. The new info is: ");
		Godfather.print();
		
		//Display DC info
		DSOM.print();
		//Check out a copy of the album
		DSOM.checkOut();
		System.out.println("After the CD was checked-out, the number of copies changed. The new info is: ");
		DSOM.print();
		
		//Display a journal paper
		FOE.print();
		System.out.println("After the journal was checked-in, the number of copies changed. The new info is: ");
		FOE.checkIn();
		FOE.print();
		
	}
}
