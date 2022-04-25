package java_hust;

import javax.swing.JOptionPane;

public class HienThiSoNgay {
	public static void main(String[] args) {
		int year, month;
		do {
			month = Integer.parseInt(JOptionPane.showInputDialog(null, "Hay nhap thang: ", "Nhap thang", JOptionPane.INFORMATION_MESSAGE));
			year = Integer.parseInt(JOptionPane.showInputDialog(null, "Hay nhap nam: ", "Nhap nam", JOptionPane.INFORMATION_MESSAGE));
		}while(month<=0 || month>12 || year<=0);
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			JOptionPane.showMessageDialog(null, "Thang " + month+ " cua nam "+ year + " co 31 ngay");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			JOptionPane.showMessageDialog(null, "Thang " + month+ " cua nam "+ year + " co 30 ngay");
			break;
		case 2:
			if(year%4 == 0)
				JOptionPane.showMessageDialog(null, "Thang " + month+ " cua nam "+ year + " co 29 ngay");
			else
				JOptionPane.showMessageDialog(null, "Thang " + month+ " cua nam "+ year + " co 28 ngay");
			break;
		default:
			break;
		}
		System.exit(0);
	}
}
