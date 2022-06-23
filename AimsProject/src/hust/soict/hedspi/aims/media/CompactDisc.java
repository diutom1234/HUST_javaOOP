package hust.soict.hedspi.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable, Comparable {
	private String artist;
    private ArrayList<Track> tracks = new ArrayList<Track>();
	
	public ArrayList<Track> getTracks() {
		return tracks;
	}
	public CompactDisc() {
        super();
    }
	public CompactDisc(String artist) {
        this.artist = artist;
    }

    public CompactDisc(String artist, String title) {
        super(title);
        this.artist = artist;
    }

    public CompactDisc(String artist, String title, String category) {
        super(title, category);
        this.artist = artist;
    }

    public CompactDisc(String artist, String title, String category, float cost) {
        super(title, category, cost);
        this.artist = artist;
    }
    public CompactDisc(String title, String category, String director, int length, float cost) {
        super(title, category, director, length, cost);
    }
    public CompactDisc(int id, String title, String category, String director, String artist, float cost) {
        super(id, title, category, director, cost);
        this.artist = artist;
    }
    public void addTrack(Track track) {
        for(int i = 0; i < tracks.size(); i++)
            if(tracks.get(i).equals(track)) {
                System.out.println("Duplicated track.");
                return;
            }
        
        tracks.add(track);
    }
    
    public void removeTrack(Track track) {
        for(int i = 0; i < tracks.size(); i++)
            if(tracks.get(i).equals(track)) {
                tracks.remove(track);
                System.out.println("Remove track successful.");
                return;
            }
        
        System.out.println("Track does not exist.");       
    }
    public int getLength() {
        int cdLen = 0;
        for(int i = 0; i < tracks.size(); i++)
            cdLen += tracks.get(i).getLength();
        
        return cdLen;
    }
    public String getArtist() {
		return artist;
	}
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Title: " + getTitle());
        System.out.println("Artist : " + getArtist());
        System.out.println("Length : " + getLength());
        if(tracks.isEmpty()) 
            System.out.println("No track.");
        else
            for(int i = 0; i< tracks.size(); i++)
                tracks.get(i).play();
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		if (o instanceof CompactDisc) {
            if (this.tracks.size() != ((CompactDisc) o).tracks.size()) {
                return this.tracks.size() - ((CompactDisc) o).tracks.size();
            } else if (this.getLength() != ((CompactDisc) o).getLength()) {
                return this.getLength() - ((CompactDisc) o).getLength();
            } else return this.getTitle().compareToIgnoreCase(((CompactDisc) o).getTitle());
        } else return -1000;
	}
	public String showInfo() {
        return "CD ID: " + getId() + " - " + getTitle() + " - " + getCategory() + " - " + getDirector() + " - " + getArtist() + " - " + this.getLength() + " - " + getCost();
    }
}
