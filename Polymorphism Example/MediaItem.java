package lab_6;

public class MediaItem extends Item {
	private double runTime;
	
	public MediaItem() {
		super();
		runTime = 0;
	}
	public MediaItem(int i, String t, int c, double r) {
		super(i, t, c);
		runTime = r;
	}
	public void setRunTime(double r) {
		runTime = r;
	}
	public double getRunTime() {
		return runTime;
	}
	public void print() {
		super.print();
		System.out.println("RUNTIME: " + runTime + " minutes");
	}
	public String toString() {
		return super.toString() + "RUNTIME: " + runTime + " minutes";
	}

}
