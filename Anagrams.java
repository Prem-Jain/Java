package Extra;
import java.util.*;
public class Anagrams {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter first String : ");	
		String s1 = sc.nextLine();
		System.out.print("Enter second String : ");
		String s2 = sc.nextLine();
		char c1[] = s1.toCharArray();
		char c2[] = s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		String s3 = new String(c1);
		String s4 = new String(c2);
		if(s3.equals(s4))
		{
			System.out.println("Anagrams");
		}
		else
			System.out.println("NOT ANAGRAMS");
		sc.close();
	}
}
