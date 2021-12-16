package Extra;
import java.util.*;

public class ReverseWordsCase {
	public static void main(String args[])
	{
		System.out.print("Enter your String : ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String ss[] = s.split(" ");
		String s4 = "";
		int i, j;
		for(String s2 : ss)
		{
			char c1[] = new char[s2.length()];
			char c2[] = new char[s2.length()];
			c1 = s2.toCharArray();
			for(i = 0, j = c1.length - 1; i < c1.length; i++, j--)
			{
				if(Character.isUpperCase(c1[j]))
				{
					c2[j] = Character.toUpperCase(c1[i]);
				}
				else
				{
					c2[j] = Character.toLowerCase(c1[i]);
				}
			}
			String s3 = new String(c2);
			s4 = s4 + s3 + " ";
		}
		System.out.println("Now changed String is " + s4);
		sc.close();
	}
}
