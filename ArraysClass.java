package DEC30;

import java.util.Arrays;

public class ArraysClass {
	public static void main(String args[])
	{
		int a[] = {1,23,4,5,6,8,4,5,100,58,6,44,4,4,5,5,55,6,24,5,45,6,64,6498,4651,65,61,65,7};
		System.out.println(Arrays.asList(a));
		System.out.println(Arrays.binarySearch(a, 100));
		Arrays.sort(a);
		for(int b: a)
			System.out.print(b + " ");
		System.out.println();
		System.out.println(Arrays.binarySearch(a, 100));
		System.out.println(Arrays.binarySearch(a, 10, 26, 100));
		int c[] = a.clone();
		System.out.println(Arrays.compare(c, a));
		c[10] = 1000;
		System.out.println(Arrays.compare(c, a));
		System.out.println(Arrays.compare(a, c));
		System.out.println(Arrays.toString(Arrays.copyOf(a, 10)));
		System.out.println(Arrays.toString(Arrays.copyOfRange(a, 20, 35)));
		Arrays.fill(a,  0);
		System.out.println(Arrays.toString(a));
	}
}