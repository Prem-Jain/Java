package unit3;

import java.io.*;

public class StringHandling {

	public static void main(String[] args) throws IOException {
		System.out.print("Enter the given statement : ");
		String s, s1, s2, s3, fn, ln, Fn;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		s = br.readLine();
		s1 = s.toLowerCase();
		System.out.println("After converting to lowerCase Letters : " + s1);
		s2 = s.toUpperCase();
		System.out.println("After converting to upperCase Letters : " + s2);
		System.out.println("Length of String is : " + s.length());
		int si = s.indexOf("Java");
		System.out.println("Index of word 'Java' is " + si);
		s3  = s.replace("CS208", "CSE208");
		System.out.println("Statement after replacing CS208 with CSE208 is : " + s3);
		int sum = 0;
		for(int i = 0; i < s.length(); i += 2)
			sum += s.charAt(i);
		System.out.println("The sum of ASCII values at even position is : " + sum);
		System.out.print("Enter your name : ");
		String name = br.readLine();
		int spi = name.indexOf(" ");
		int len = name.length();
		fn = name.substring(0, spi);
		ln = name.substring(spi + 1, len);
		Fn = ln + ", " + fn.substring(0, 1);
		System.out.println("Your name is : " + Fn);
	}
}
 //THE GIVE STATEMENT IS : "Welcome! This is 'CS208' Java course for CSE Students"