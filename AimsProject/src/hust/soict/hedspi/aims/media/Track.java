package hust.soict.hedspi.aims.media;

public class Track implements Playable, Comparable{
	private String title;
	private int length;
	public String getTitle() {
		return title;
	}
	public int getLength() {
		return length;
	}
	public Track() {}
	public Track(String title, int length) {
		this.title = title;
		this.length = length;
	}
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}
	public boolean equals(Object o) {
        if(o instanceof Track) {
            Track t = (Track) o;
            return title.equals(t.getTitle()) && length == t.getLength() ? true : false; 
        }
        return false;
    }
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		//return 0;
		if(o instanceof Track){
            return this.getTitle().compareToIgnoreCase(((Track) o).getTitle());
        } else return -1000;
	}
	
}
