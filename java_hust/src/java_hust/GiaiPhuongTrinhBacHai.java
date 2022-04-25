package java_hust;

import javax.swing.JOptionPane;
import java.lang.Math;
//ax2 + bx + c = 0
public class GiaiPhuongTrinhBacHai {
	public static void main(String[] args) {
		Float strSo1, strSo2, strSo3, delta;
		strSo1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Hay nhap so thu 1: ", "Nhap so thu nhat", JOptionPane.INFORMATION_MESSAGE));
		strSo2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Hay nhap so thu 2: ", "Nhap so thu hai", JOptionPane.INFORMATION_MESSAGE));
		strSo3 = Float.parseFloat(JOptionPane.showInputDialog(null, "Hay nhap so thu 3: ", "Nhap so thu ba", JOptionPane.INFORMATION_MESSAGE));
		
		delta =strSo2*strSo2 - 4*strSo1*strSo3;
		if(strSo1 == 0) 
			JOptionPane.showMessageDialog(null, "Co loi. Vui long nhap lai");
		else {
			if(delta > 0)
				JOptionPane.showMessageDialog(null, "Phuong trinh co 2 nghiem la: "+ (-strSo2 + Math.sqrt(delta))/(2*strSo1) + " va "+ (-strSo2 - Math.sqrt(delta))/(2*strSo1), "Hien thi 2 nghiem", JOptionPane.INFORMATION_MESSAGE);
			else if(delta == 0)
				JOptionPane.showMessageDialog(null, "Phuong trinh co nghiem kep la: "+ (-strSo2/(2*strSo1)), "Hien thi nghiem kep", JOptionPane.INFORMATION_MESSAGE);
			else
				JOptionPane.showMessageDialog(null, "Phuong trinh vo nghiem", "Hien thi vo nghiem", JOptionPane.INFORMATION_MESSAGE);
		}	
		System.exit(0);
	}
}
