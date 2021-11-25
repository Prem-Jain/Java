package unit2;
import std.*;
import std.grd.*;
import java.util.*;
public class StudentResult {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name of Student : ");
		String name = sc.nextLine();
		System.out.print("Enter roll no of student : ");
		int no = sc.nextInt();
		System.out.print("Enter marks in first subject : ");
		int s1 = sc.nextInt();
		System.out.print("Enter marks in second subject : ");
		int s2 = sc.nextInt();
		System.out.print("Enter marks in third subject : ");
		int s3 = sc.nextInt();
		Student s = new Student(name, no, s1, s2, s3);
		int t = s.getTotal();
		Grade gs = new Grade(t);
		char g = gs.getGrade();
		s.display();
		System.out.println("Grade is " + g);
		sc.close();
	}

}
