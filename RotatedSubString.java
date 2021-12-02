package Extra;
import java.util.*;
public class RotatedSubString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The string : ");
		String s1 = sc.nextLine();
		StringBuffer sb1 = new StringBuffer(s1);
		System.out.println("Enter the sub string : ");
		String s2 = sc.nextLine();
		sb1 = sb1.append(sb1);
		s1 = sb1.toString();
		if(s1.contains(s2))
		{
			System.out.println("Rotated");
		}
		else
			System.out.println("NOT Rotated");
		sc.close();
	}

}
