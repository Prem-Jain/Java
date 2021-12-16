package Extra;
import java.util.*;
public class MakeSubStringUsingGivenStringFromString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String s = sc.nextLine();
		System.out.print("Enter the Substring : ");
		String ss = sc.nextLine();
		int i, index = 0;
		String ns = "";
		for(i = 0; i < s.length() - ss.length();)
		{
			index = s.indexOf(ss, i);
			ns = ns + s.charAt(index - 1) + s.charAt(ss.length() + index);
			i += index + 1;
		}
		System.out.println("New String : " + ns);
		sc.close();
	}
}
