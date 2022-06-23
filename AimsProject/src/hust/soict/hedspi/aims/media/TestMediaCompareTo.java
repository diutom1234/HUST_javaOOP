package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;

public class TestMediaCompareTo {
	public static void main(String[] args) {
        DigitalVideoDisc dvd1 = new DigitalVideoDisc(1, "The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc(2, "Star Wars", "Science Fiction", "George Lucas", 97, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc(3, "Aladin", "Animation", "Disney", 110, 18.98f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc(4, "Blaxin", "Animal", " Walt Disney", 110, 18.99f);
//     
        ArrayList<DigitalVideoDisc> discs = new ArrayList<DigitalVideoDisc>();
        discs.add(dvd1);
        discs.add(dvd2);
        discs.add(dvd3);
        discs.add(dvd4);
        Iterator iterator = discs.iterator();
        float totalCost = 0;
        while(iterator.hasNext()){
        	DigitalVideoDisc dvd = (DigitalVideoDisc)iterator.next();
            System.out.println(dvd.showInfo());
            totalCost+=dvd.getCost();
        }
        System.out.println("Total cost: " + totalCost);
        //unsorted order
        iterator = discs.iterator();
        System.out.println("----------------------------------------------");
        System.out.println("The DVDs currently in the order are: ");

        while(iterator.hasNext()){
        	DigitalVideoDisc dvd = (DigitalVideoDisc)iterator.next();
        	System.out.println(dvd.getTitle() + " - length: "+ dvd.getCost());
        }
        
        //sorted order
        Collections.sort(discs);
        iterator = discs.iterator();
        System.out.println("----------------------------------------------");
        System.out.println("The DVDs in sorted order are: ");
        while(iterator.hasNext()){
        	DigitalVideoDisc dvd = (DigitalVideoDisc)iterator.next();
        	System.out.println(dvd.getTitle() + " - length: "+ dvd.getCost());
        }
        System.out.println("----------------------------------------------");
        
//        Track track1 = new Track("Happy new year", 3);
//        Track track2 = new Track("Xuan nay con khong ve", 4);
//        Track track3 = new Track("Doraemon BGM", 2);
//        Track track4 = new Track("Bad guy", 4);
//        Track track5 = new Track("Good guy", 6);
//
//        CompactDisc cd1 = new CompactDisc(7, "Nhac nam moi", "Nhac pop", "Hong Duc", "Duc", 100f);
//        cd1.addTrack(track1);
//        cd1.addTrack(track2);
//        cd1.addTrack(track5);
//        
//        CompactDisc cd2 = new CompactDisc(8, "VPop", "Nhac viet", "Cong Ly", "MTP", 180f);
//        cd2.addTrack(track4);
//        
//        CompactDisc cd3 = new CompactDisc(9, "CPop", "Nhac trung", "SNSD", "Taylor", 90f);
//        cd3.addTrack(track3);
//        cd3.addTrack(track1);
//        
//        CompactDisc cd4 = new CompactDisc(10, "KPop", "Nhac han", "Chau Nhuan Phat", "Bibi", 10f);
//        
//        collection.add(cd1);
//        collection.add(cd2);
//        collection.add(cd3);
//        collection.add(cd4);
//        
//        Iterator iterator = collection.iterator();
//        float totalCost = 0;
//        while(iterator.hasNext()){
//        	CompactDisc cd = (CompactDisc)iterator.next();
//            System.out.println(cd.showInfo());
//            totalCost+=cd.getCost();
//        }
//        System.out.println("Total cost: " + totalCost);
//         //unsorted order
//        iterator = collection.iterator();
//        System.out.println("----------------------------------------------");
//        System.out.println("The CDs currently in the order are: ");
//
//        while(iterator.hasNext()){
//            CompactDisc cd = (CompactDisc)iterator.next();
//            System.out.println(cd.getTitle() + " - length: "+ cd.getLength());
//        }
//        
//        //sorted order
//        Collections.sort((List)collection);
//        iterator = collection.iterator();
//        System.out.println("----------------------------------------------");
//        System.out.println("The CDs in sorted order are: ");
//        while(iterator.hasNext()){
//            CompactDisc cd = (CompactDisc)iterator.next();
//            System.out.println(cd.getTitle() + " - length: "+ cd.getLength());
//        }
//        System.out.println("----------------------------------------------");
    }
}
