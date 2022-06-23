package hust.soict.hedspi.aims.media;

public class DigitalVideoDisc extends Disc implements Playable, Comparable {
	
	public DigitalVideoDisc() {
		super();
	}
	public DigitalVideoDisc(int id) {
		super(id);
	}
	public DigitalVideoDisc(String title) {
		super(title);
	}
	public DigitalVideoDisc(String title, String category) {
		super(title, category);
	}
	public DigitalVideoDisc(String title, String category, float cost) {
		super(title, category, cost);
	}
	public DigitalVideoDisc(String title, String category, String director) {
		super(title, category);
		this.director = director;
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(title, category, director, length, cost);
	}
	public DigitalVideoDisc(int id, String title, String category, String director, int length, float cost) {
		super(id, title, category, director, length, cost);
	}
	public boolean search(String title) {
		String cpytitle=new String(title);
		cpytitle=cpytitle.toLowerCase();
		String listTit[]=cpytitle.split(" ");
		int size=listTit.length;
		boolean flag=true;
		for(int i=0;i<size;i++) {
			if(title.toLowerCase().indexOf(listTit[i]) == -1) {
				flag=false;
			}
		}
		return flag;
	}
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		if(o instanceof DigitalVideoDisc) {
            if(this.getCost() > ((DigitalVideoDisc) o).getCost()) {
                return (int) (this.getCost() - ((DigitalVideoDisc) o).getCost());
            }
            else return this.getTitle().compareToIgnoreCase(((DigitalVideoDisc) o).getTitle());
        } else return -1000;
	}
	public String showInfo() {
	    return "DVD ID: " + getId() + " - " + getTitle() + " - " + getCategory() + " - " + getDirector() + " - " + getCost();
	}
}
