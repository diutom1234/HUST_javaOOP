package java_hust;

import javax.swing.JOptionPane;
//ax + b = c
public class GiaiPhuongTrinhBacNhat {
	public static void main(String[] args) {
		Float strSo1, strSo2;
		strSo1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Hay nhap so thu 1: ", "Nhap so thu nhat", JOptionPane.INFORMATION_MESSAGE));
		strSo2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Hay nhap so thu 2: ", "Nhap so thu hai", JOptionPane.INFORMATION_MESSAGE));
		if(strSo1 == 0) 
			JOptionPane.showMessageDialog(null, "Co loi. Vui long nhap lai");
		else
			JOptionPane.showMessageDialog(null, "Nghiem cua phuong trinh bac nhat la: "+ (-strSo2/strSo1), "Hien thi nghiem", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}
}
