package Extra;

public class StringPractice {
	public static void main(String args[])
	{
		/* CRERATING A STRING */
		String s1 = new String();
		System.out.println(s1);
		char char1[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
		
		String s2 = new String(char1);
		System.out.println(s2);

		char char2[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
		String s3 = new String(char2, 3, 2);
		System.out.println(s3);
		
		String s4 = new String(s2);
		System.out.println(s4);
		
		byte ascii[] = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74};
		String s5 = new String(ascii);
		System.out.println(s5);
		
		String s6 = new String(ascii, 3, 3);
		System.out.println(s6);
		
		int len = s1.length();
		System.out.println(len);
		
		System.out.println(s5.length());
		
		System.out.println("I LOVE YOU".length());
		
		String s7 = "I LOVE YOU";
		System.out.println(s7);
		
		String s8 = "19";
		String s9 = "He is " + s8 + " years old";
		System.out.println(s9);
		
		int x1 = 19;
		String s10 = "He is " + x1 + " years old";
		System.out.println(s10);
		
		String s11 = "Four : " + 2 + 2;
		System.out.println(s11);
		
		String s12 = "Four : " + (2 + 2);
		System.out.println(s12);
		
		String s13 = "I LOVE YOU";
		int x2 = s13.charAt(4);
		System.out.println(x2);
		
		String s14 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		char char3[] = new char[s14.length()];
		s14.getChars(5, 15, char3, 5);
		for(int i = 5; i < char3.length; i++)
			System.out.print(char3[i] + " ");
		System.out.println();
		
		s14.getChars(5, 15, char3, 0);
		for(char char4 : char3)
			System.out.print(char4 + " ");
		System.out.println();
		
		byte byte1[] = new byte[s14.length()];
		byte1 = s14.getBytes();
		for(byte byte2 : byte1)
			System.out.print(byte2 + " ");
		System.out.println();
		
		char char5[] = new char[s14.length()];
		char5 = s14.toCharArray();
		for(char char6 : char5)
			System.out.print(char6 + " ");
		System.out.println();
		
		System.out.println();
		String s15 = new String("HELLO");
		String s16 = new String("HELLO");
		String s17 = new String("hello");
		String s18 = "HELLO";
		String s19 = "hello";
		String s20 = "hello";
		System.out.println(s15.equals(s16));
		System.out.println(s15.equals(s17));
		System.out.println(s15.equals(s18));
		System.out.println(s17.equals(s19));
		System.out.println(s15 == s16);
		System.out.println(s15 == s17);
		System.out.println(s15 == s18);
		System.out.println(s19 == s20);
		System.out.println();
		
		System.out.println(s15.equalsIgnoreCase(s20));
		System.out.println();
		
		String s21 = "I LOVE YOU";
		String s22 = new String("LOVE");
		String s23 = new String("love");
		
		System.out.println(s21.regionMatches(2, s22, 0, 4));
		System.out.println(s21.regionMatches(2, s23, 0, 4));
		
		System.out.println();
		
		System.out.println(s21.regionMatches(true, 2, s23, 0, 4));
		
		System.out.println();
		
		System.out.println(s21.startsWith("I L"));
		System.out.println(s21.endsWith("OU"));
		System.out.println();
		
		System.out.println(s21.startsWith("LOVE", 2));
		System.out.println();
		
		String s24 = new String("ABCD");
		String s25 = new String("ABCd");
		
		System.out.println(s24.compareTo(s25));
		System.out.println(s24.compareToIgnoreCase(s25));
		
		System.out.println();
		
		String s26 = new String("I LOVE YOU I LOVE YOU I LOVE YOU I LOVE YOU");
		System.out.println(s26.indexOf('L'));
		System.out.println(s26.lastIndexOf('L'));
		System.out.println();
		
		System.out.println(s26.indexOf('L', 3));
		System.out.println(s26.lastIndexOf('L', 5));
		
		System.out.println(s26.indexOf('A'));
		
		System.out.println();
		
		String s27 = new String("I");
		String s28 = new String("LOVE");
		String s29 = new String("YOU");
		s27.concat(s28);
		System.out.println(s27);
		String s30 = s27.concat(s28).concat(s29);
		System.out.println(s30);
		
		String s31 = "I LOVE YOU";
		String s32 = s31.substring(2);
		System.out.println(s32);
		String s33 = s31.substring(2, 7);
		System.out.println(s33);
		System.out.println();
		
		String s34 = "i lOVE YOU";
		String s35 = s34.replace('i', 'I');
		System.out.println(s35);
		
		String s36 = s34.replace("i l", "I L");
		System.out.println(s36);
		System.out.println();
		
		String s37 = "	I LOVE YOU	";
		System.out.println(s37);
		String s38 = s37.trim();
		System.out.println(s38);
		System.out.println();
		
		String s39 = s38.toLowerCase();
		System.out.println(s39);
		String s40 = s39.toUpperCase();
		System.out.println(s40);
	}
}
