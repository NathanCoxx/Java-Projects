package lab_6;

public class Video extends MediaItem {
	private String director;
	private String genre;
	private int releaseYr;
	
	public Video() {
		super();
		director = " ";
		genre = " ";
		releaseYr = 0; 
	}
	public Video(int i, String t, int c, double r, String d, String g, int y) {
		super(i, t, c, r);
		director = d;
		genre = g;
		releaseYr = y;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getReleaseYr() {
		return releaseYr;
	}
	public void setReleaseYr(int releaseYr) {
		this.releaseYr = releaseYr;
	}
	public void print() {
		System.out.println("Display info about a video");
		System.out.println("ID: " + super.getId() + "\nTITLE: " + super.getTitle() + "\nDIRECTOR: "  + 
	                  director + "\nGENRE: " + genre + "\nYEAR RELEASED: " + releaseYr + "\nRUNTIME: " 
	                  + super.getRunTime() + " minutes" + "\nNUMBER OF COPIES: " + super.getCopies());
		
	}
	public String toString() {
		return "Display info about a video\n" + super.toString() + "\nDIRECTOR: "  + 
                director + "\nGENRE: " + genre + "\nYEAR RELEASED: " + releaseYr;
	}

}
