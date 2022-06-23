package hust.soict.hedspi.aims.order;

import java.util.ArrayList;

import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.utils.MyDate;

public class Order {
	public static final int MAX_NUMBERS_ORDERED = 3; //so luong mat hang toi da
	
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();// luu tru danh sach media
	public float totalCost = 0;
	private int maxSize=0;
	private MyDate dateOrdered = new MyDate();
	public static final int MAX_LIMITED_ORDERED = 3; //so luong don hang toi da
	private static int nbOrders = 0;
	public boolean check = true;
	
	public ArrayList<Media> getItemsOrdered(){
		return itemsOrdered;
	}
	public Order(ArrayList<Media> itemsOrdered, MyDate dateOrdered) {
		super();
		if(nbOrders<MAX_LIMITED_ORDERED) {
			this.itemsOrdered = itemsOrdered;
			//this.qtyOrdered = qtyOrdered;
			this.dateOrdered = dateOrdered;
			nbOrders++;
		}else {
			return;
		}
	}
	public Order() {
		super();
		if(nbOrders < MAX_LIMITED_ORDERED) {
			nbOrders++;
		}else {
			System.out.println("Ban da dat so luong don hang toi da");
			check = false;
			return;
		}
	}
	public void addMedia(Media media) {
        if(itemsOrdered.size() < MAX_LIMITED_ORDERED) {
			maxSize++;
			media.setId(maxSize);
			itemsOrdered.add(media);
		}else {
			System.out.println("Don hang da day, khong the dat them.");
            return;
		}
    }
	public void removeMedia(int id) {
//		for (Media media : itemsOrdered) {
//			System.out.println(id);
//			if(media.getId() == id ) {
//				itemsOrdered.remove(media);
//			}
//		}
		boolean check = false;
		check = itemsOrdered.removeIf((media)->{
			return media.getId() == id;
		});
		if(check) {
			maxSize--;
		}
    }
	public float totalCost() {
		totalCost = 0;
        for(int i = 0; i < itemsOrdered.size(); i++){
        	totalCost += itemsOrdered.get(i).getCost();
        }
        return totalCost;
    }
	//update total cost
	public float totalCost(DigitalVideoDisc luckyItem) {
		float total=0;
		for(int i=0;i<itemsOrdered.size();i++) {
			if(luckyItem.equals(itemsOrdered.get(i))==false) {
				total+=itemsOrdered.get(i).getCost();
			}
		}
		return total;
	}
	
	public void print() {
		for(int i=0;i<itemsOrdered.size();i++) {
			System.out.println(itemsOrdered.get(i).getTitle());
		}
	}
	
	public void fullPrint() {
		System.out.println("**************************Order***********************");
		System.out.print("Date:");
		try {
			this.getDateOrdered().print();
		} catch (Exception e) {
		}
		for(int i=0;i<itemsOrdered.size();i++) {
			System.out.println("Id:"+itemsOrdered.get(i).getId()+".Media: "+itemsOrdered.get(i).getTitle()+"-"+
					itemsOrdered.get(i).getCategory()+"-"+itemsOrdered.get(i).getCost()+"$");
		}
		System.out.println("Total cost:"+this.totalCost());
		System.out.println("*****************************************************");
	}
	//update full print
	public void fullPrint(DigitalVideoDisc luckyItem) {
		System.out.println("**************************Order***********************");
		System.out.print("Date:");
		try {
			this.getDateOrdered().print();
		} catch (Exception e) {
		}
		System.out.println();
		for(int i=0;i<itemsOrdered.size();i++) {
			if(luckyItem.equals(itemsOrdered.get(i))==true){
				System.out.println("Id:"+itemsOrdered.get(i).getId()+".Media:"+itemsOrdered.get(i).getTitle()+"-"+
						itemsOrdered.get(i).getCategory()+"-"+itemsOrdered.get(i).getCost()+"$"+": lucky item");
			}else{
				System.out.println("Id:"+itemsOrdered.get(i).getId()+".Meida:"+itemsOrdered.get(i).getTitle()+"-"+
						itemsOrdered.get(i).getCategory()+"-"+itemsOrdered.get(i).getCost()+"$");
			}
			
		}
		System.out.println("Total cost:"+this.totalCost(luckyItem));
		System.out.println("*****************************************************");
	}
	
	public Media getALuckyItem() {
		int min=0;
		int max=-1;
		int range=max-min+1;
		int luckyIndex=(int)(Math.random()*range)+min;
	
		return itemsOrdered.get(luckyIndex);
	}
	
	public MyDate getDateOrdered() {
		return dateOrdered;
	}
	public void setDateOrdered(int i, int j, int k) {
		dateOrdered.setDay(i);
		dateOrdered.setMonth(j);
		dateOrdered.setYear(k);
	}
	public static int getNbOrders() {
		return nbOrders;
	}
	public static void setNbOrders(int nbOrders) {
		Order.nbOrders = nbOrders;
	}
	public void setItemsOrdered(ArrayList<Media> itemsOrdered) {
		this.itemsOrdered = itemsOrdered;
	}
}
