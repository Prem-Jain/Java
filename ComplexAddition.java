package unit1;

import java.util.*;

public class ComplexAddition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double rp, ip;
		System.out.print("Enter the real and imaginary part of first complex : ");
		rp = sc.nextDouble();
		ip = sc.nextDouble();
		Complex c1 = new Complex(rp, ip);
		System.out.print("Enter the real and imaginary part of second complex : ");
		rp = sc.nextDouble();
		ip = sc.nextDouble();
		Complex c2 = new Complex(rp, ip);
		System.out.print("Resultant Complex is : ");
		Complex c3 = new Complex(rp, ip);
		c3.sum(c1, c2);
		System.out.println(c3.real + " + " + c3.imag + "i");
		sc.close();
	}

}
