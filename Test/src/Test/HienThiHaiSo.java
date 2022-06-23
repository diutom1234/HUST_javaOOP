package Test;

import javax.swing.JOptionPane;

public class HienThiHaiSo {
	public static void main(String[] args) {
		String strSo1, strSo2;
		String strHienThi = "Tong cua hai so ";
		int sum = 0;
		strSo1 = JOptionPane.showInputDialog(null, "Hay nhap so thu 1: ", "Nhap so thu nhat", JOptionPane.INFORMATION_MESSAGE);
		strHienThi += strSo1 + " va ";
		strSo2 = JOptionPane.showInputDialog(null, "Hay nhap so thu 2: ", "Nhap so thu hai", JOptionPane.INFORMATION_MESSAGE);
		sum = Integer.parseInt(strSo1) + Integer.parseInt(strSo2);
		strHienThi += strSo2 + " la: " + sum;
		JOptionPane.showMessageDialog(null, strHienThi, "Hien thi hai so", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}
}
