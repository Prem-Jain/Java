package Extra;

import java.util.*;

public class ReverseCaseSensitivity {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your DAMN string : ");
		String s = sc.nextLine();
		char ch[] = new char[s.length()];
		ch = s.toCharArray();
		for(int i = 0; i < ch.length; i++)
		{
			if(Character.isUpperCase(ch[i]))
				ch[i] = Character.toLowerCase(ch[i]);
			else
				ch[i] = Character.toUpperCase(ch[i]);
		}
		String s2 = new String(ch);
		System.out.println("Your DAMN string now is : " + s2);
		sc.close();
	}
}
