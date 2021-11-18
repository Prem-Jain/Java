package unit1;

import java.util.*;

public class Student {
	int rno;
	String name;
	float cgpa;
	void getDetails()
	{
		Scanner sc = new Scanner(System.in);
		rno = sc.nextInt();
		name = sc.next();
		cgpa = sc.nextFloat();
	}
	void putDeatils()
	{
		System.out.println(rno +" "+ name + " " + cgpa);
	}
}
