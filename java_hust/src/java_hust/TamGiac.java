package java_hust;

public class TamGiac {
	public static void main(String[] args) {
		final int MAX = 5; // chieu cao
		int point = 1;
		while (point <= MAX) {
            for (int h = 1; h <= MAX - point; h++) System.out.print("  ");
            for (int h = 1; h <= point*2-1 ; h++) System.out.print("* ");
            System.out.println();
            point++;
        }
	}
}
