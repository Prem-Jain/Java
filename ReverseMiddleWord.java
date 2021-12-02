package Extra;
import java.util.*;
public class ReverseMiddleWord {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 3 words : ");
		String s = sc.nextLine();
		String ss[] = s.split(" ");
		StringBuffer sb = new StringBuffer(ss[1]);
		sb.reverse();
		ss[1] = sb.toString();
		for(String a : ss)
			System.out.print(a + " ");
		sc.close();
	}
}
