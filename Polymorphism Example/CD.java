package lab_6;

public class CD extends MediaItem{
	private String artist;
	private String genre;
	public CD() {
		super();
		artist = " ";
		genre = " ";
	}
	public CD(int id, String title, int c, double r, String artist, String genre) {
		super(id, title, c, r);
		this.artist = artist;
		this.genre = genre;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public void print() {
		System.out.println("Display info about a CD");
		super.print();
		System.out.println("AUTHOR: " + artist + "\nGENRE: " + genre);
		
	}
	public String toString() {
		return "Display info about a CD\n" + super.toString() + "AUTHOR: " + artist + "\nGENRE: " + genre;
	}
	
	

}
