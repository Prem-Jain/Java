package DCCN;

import java.util.*;

public class LeakyBucket {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int queries = 4, storage = 0, oPckSize = 1, iPckSize = 4, bSize = 10, sLeft;
		for(int i = 0; i < queries; i++)
		{
			sLeft = bSize - storage;
			if(iPckSize <= sLeft)
				storage += iPckSize;
			else
				System.out.println("Packet loss : " + iPckSize);
			System.out.println("Buffer size= " + storage + " out of bucket size= " + bSize);
			storage -= oPckSize;
		}
		sc.close(); 
	}
}
