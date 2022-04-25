package java_hust;

import javax.swing.JOptionPane;

public class TongSoThuc {
	public static void main(String[] args) {
		int iLuaChon;
		double number;
		double sum = 0;
		do {
			number = Double.parseDouble(JOptionPane.showInputDialog("Hay nhap so thuc: "));
			sum += number;
			iLuaChon = JOptionPane.showConfirmDialog(null, "Co muon nhap tiep hay khong?");// yes iLuaChon = 0; no iLuaChon = 1
		}while(iLuaChon == JOptionPane.YES_OPTION);
		JOptionPane.showMessageDialog(null, "Tong la: " + sum);
		System.exit(0);
	}
}
