package hust.soict.hedspi.aims.media;

public abstract class Media implements Comparable{
	protected int id;
	protected String title;
	protected String category;
	protected float cost;
	public Media() {
    }
	public Media(int id) {
		this.id=id;
	}
    public Media(String title) {
        this.title = title;
    }
    public Media(String title, String category) {
        this.title = title;
        this.category = category;
    }
    public Media(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
    }
    public Media(int id, String title, String category, float cost) {
    	this.id=id;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }
    public void print() {
        System.out.printf("Title: %s.\nCategory: %s.\nCost: %s.\n", title, category, cost);
    }
    public boolean equals(Object o) {
        if(o instanceof Media) {
            Media m = (Media) o;
            return id == m.getId() ? true : false;  
        }
        return false;
    }
    public int compareTo(Object o) {
        Media m = (Media) o;
        return title.compareTo(m.getTitle());
    }
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
    public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public float getCost() {
		return cost;
	}
}
