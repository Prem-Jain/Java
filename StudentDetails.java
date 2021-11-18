package unit1;

import java.util.*;

public class StudentDetails {

	public static void main(String[] args) {
		int n, i;
		System.out.print("Enter the number of the students : ");
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		Student s[] = new Student[n];
		for(i = 0; i < n; i++)
		{
			s[i] = new Student();
			System.out.println("Enter Stdent"+(i+1)+ " roll number, name and CGPA : ");
			s[i].getDetails();
		}
		System.out.println("The details of student are : ");
		for(i = 0; i < n; i++)
		{
			System.out.print("Student"+(i+1)+" roll number and CGPA : ");
			s[i].putDeatils();
		}
		scan.close();
	}
}