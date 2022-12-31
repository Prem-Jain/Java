package DEC30;

import java.util.*;

public class StringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(s.toUpperCase());
		String s1 = "SCAs", s2 = "jsbdfjbdsf";
		System.out.println((s1 + s2).toLowerCase());
		StringBuffer sb = new StringBuffer("absbs");
		if(sb.equals(sb.reverse()));
			System.out.println("PALIN");
		sc.close();
	}

}
