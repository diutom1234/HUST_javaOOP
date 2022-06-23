package hust.soict.hedspi.aims;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.CompactDisc;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.media.Track;
import hust.soict.hedspi.aims.order.Order;

public class Aims {
	static Scanner keyScanner = new Scanner(System.in);
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			try (Scanner scan1 = new Scanner(System.in)) {
				Order anOrder = null;
				while(true) {
					showMenu();
					int choose = scan.nextInt();
					System.out.println(choose);
					switch(choose) {
						case 1:
							anOrder=CreateOrder();
							System.out.println("create order successfully");
							break;
						case 2:
							if(anOrder != null) {
								addItem(anOrder);
								System.out.println("add media successfully");
							}else {
								System.out.println("Chua co don hang nao");
							}
							break;
						case 3:
							if(anOrder != null) {
								System.out.println("id to remove:");
								int id=scan.nextInt();
								Delete(anOrder,id);
							}else {
								System.out.println("Chua co don hang nao");
							}
							break;
						case 4:
							if(anOrder != null) {
								Display(anOrder);
							}else {
								System.out.println("Chua co don hang nao");
							}
							break;
						case 0:
						default:	
							System.exit(0);
							break;
					}
				}
			}
		}
	}
	public static void showMenu() {
		System.out.println("Order Management Application: ");
		System.out.println("----------------------------");
		System.out.println("1. Create new order");
		System.out.println("2. Add item to the order");
		System.out.println("3. Delete item by id");
		System.out.println("4. Display the items list of order");
		System.out.println("0. Exit");
		System.out.println("----------------------------");
		System.out.println("Please choose a number 0-1-2-3-4");
	}
	public static  Order CreateOrder() {
		Order anOrder = new Order();
		return anOrder;
	}
	
	public static void Delete(Order order,int id) {
        order.removeMedia(id);
	}
	public static void Display(Order order) {
		order.fullPrint();
	}
	public static void addItem(Order anOrder){
        System.out.println("Type of item:");
        System.out.println("--------------------------------");
        System.out.println("1. Book");
        System.out.println("2. Compact Disc");
        System.out.println("3. Digital Video Disc");
        System.out.println("--------------------------------");
        System.out.print("Your menu: ");
        int menu = keyScanner.nextInt();
        keyScanner.nextLine();
        switch (menu){
            case 1:
                addBook(anOrder);
                break;
            case 2:
                addCompactDisc(anOrder);
                break;
            case 3:
                addDigitalVideoDisc(anOrder);
                break;
            default:
                break;
        }
    }
	private static void addDigitalVideoDisc(Order anOrder) {
		// TODO Auto-generated method stub
        System.out.print("Title: ");
        String title = keyScanner.nextLine();
        System.out.print("Category: ");
        String category = keyScanner.nextLine();
        System.out.print("Cost: ");
        float cost = keyScanner.nextFloat();
        keyScanner.nextLine();
        System.out.print("Director: ");
        String director = keyScanner.nextLine();
        System.out.print("Length: ");
        int length = keyScanner.nextInt();
		DigitalVideoDisc digitalVideoDisc = new DigitalVideoDisc(title, category, director, length, cost);
		anOrder.addMedia(digitalVideoDisc);
        System.out.println("Do you want to play it?");
        System.out.println("------------------------");
        System.out.println("1. Yes");
        System.out.println("2. No");
        System.out.println("------------------------");
        System.out.print("Your choose: ");
        keyScanner.nextLine();
        int choose = keyScanner.nextInt();
        if (choose == 1){
            digitalVideoDisc.play();
        }
	}
	private static void addCompactDisc(Order anOrder) {
		// TODO Auto-generated method stub
        System.out.print("Title: ");
        String title = keyScanner.nextLine();
        System.out.print("Category: ");
        String category = keyScanner.nextLine();
        System.out.print("Cost: ");
        float cost = keyScanner.nextFloat();
        System.out.print("Length: ");
        int length = keyScanner.nextInt();
        keyScanner.nextLine();
        System.out.print("Director: ");
        String director = keyScanner.nextLine();
		CompactDisc compactDisc = new CompactDisc(title, category, director, length, cost);
        while (true){
            System.out.println("-----------------------");
            System.out.println("1. Add tracks");
            System.out.println("0. Exit");
            System.out.println("-----------------------");
            System.out.print("Your choose: ");
            int menuTrack = keyScanner.nextInt();
            if(menuTrack == 1){
            	keyScanner.nextLine();
                System.out.print("Title: ");
                String titleTrack = keyScanner.nextLine(); 
                System.out.print("Length: ");
                int lengthTrack = keyScanner.nextInt(); 
                Track track = new Track(titleTrack, lengthTrack);
                compactDisc.addTrack(track);
            }
            else break;
        }
        anOrder.addMedia(compactDisc);
        System.out.println("Do you want to play it?");
        System.out.println("------------------------");
        System.out.println("1. Yes");
        System.out.println("2. No");
        System.out.println("------------------------");
        System.out.print("Your choose: ");
        keyScanner.nextLine();
        int choosePlay = keyScanner.nextInt();
        if (choosePlay == 1){
            compactDisc.play();
        }
	}
	private static void addBook(Order anOrder) {
		// TODO Auto-generated method stub
        System.out.print("Title: ");
        String title = keyScanner.nextLine();
        System.out.print("Category: ");
        String category = keyScanner.nextLine();
        System.out.print("Cost: ");
        float cost = keyScanner.nextFloat();
        System.out.print("Author: ");
        keyScanner.nextLine();
        Book book = new Book(title, category, cost);
        String author = keyScanner.nextLine();
        book.addAuthor(author);
        List<String> authors = new ArrayList<String>();
        authors.add(author);
        anOrder.addMedia(book);
	}
}