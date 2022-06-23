package hust.soict.hedspi.garbage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GarbageCreator {
	public static void main(String[] args) {
		long start=System.currentTimeMillis();
		String mydata=new String();
		try {
			File myObj= new File("D:\\Documents\\memo_php30.txt");
			Scanner myReader=new Scanner(myObj);
			while(myReader.hasNextLine()) {
				String newline=myReader.nextLine();
				mydata+=newline;
			}
			myReader.close();
		}catch(FileNotFoundException e) {
			System.out.println("An errore occurred");
			e.printStackTrace();
		}
		System.out.println(mydata);
		System.out.println(System.currentTimeMillis()-start);
	}
}
