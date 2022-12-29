package COE;

import java.util.*;
import java.io.*;

public class ScannerProgram {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		System.out.print("The Fibonacci Series is ");
		if(n >= 1)
			System.out.print("0 ");
		if(n >= 2)
			System.out.print("1 ");
		int fn = 0, sn = 1, nn;
		for(int i = 3; i <= n; i++)
		{
			nn = fn + sn;
			System.out.print(nn + " ");
			fn = sn;
			sn = nn;
		}
		System.out.println();
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter an Integr : ");
		int i = Integer.parseInt(br.readLine());
		System.out.print("Enter a Character : ");
		char c = (char)br.read();
		br.readLine();
		System.out.print("Enter a String : ");
		String s = br.readLine();
		System.out.println(i + " " + c + " " + s);
		br.close();
		sc.close();
	}
}