package DEC31;

import java.util.*;

public class ElectronicWatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long sec = sc.nextLong();
		long h = (sec / 3600) % 24;
		sec %= 3600;
		long min = (sec / 60) % 60;
		sec %= 60;
		System.out.printf("%d:%0,2d:%0,2d\n", h, min, sec);
		sc.close();
	}
}
