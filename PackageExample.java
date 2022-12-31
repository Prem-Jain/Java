package DEC31;

import Math.*;

public class PackageExample {

	public static void main(String[] args) 
	{
		Arithmetic ar = new Arithmetic();
		System.out.println(ar.add(1,  2));
		System.out.println(ar.sub(100, 20));
		System.out.println(ar.mul(25,  500));
		System.out.println(ar.div(100, 200));
		System.out.println(ar.reverse(123));
		System.out.println(ar.pow(123, 3));
	}

}
