package hust.soict.hedspi.garbage;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class NoGarbage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start=System.currentTimeMillis();
		StringBuffer mydata=new StringBuffer();

		try {
			Scanner scan = new Scanner(new FileReader("D:\\Documents\\memo_php30.txt"));
			while(scan.hasNextLine()) {
				mydata.append(scan.nextLine());
			}
			scan.close();
			}catch(FileNotFoundException e) {
				System.out.println("Error");
				e.printStackTrace();
			}
		System.out.println(mydata.toString());
		System.out.println(System.currentTimeMillis()-start);
	}

}
