package std;

public class Student {
	private String name;
	private int rno, m1, m2, m3;
	private int total;
	public Student(String s, int no, int a, int b, int c)
	{
		name = s;
		rno = no;
		m1 = a;
		m2 = b;
		m3 = c;
	}
	public int getTotal()
	{
		total = m1 + m2 + m3;
		return total;
	}
	public void display()
	{
		System.out.println("Name of Student is " + name);
		System.out.println("Roll no of student is " + rno);
		System.out.println("Marks of three subjects are\nSub1 = " + m1 + "Sub2 =  " + m2 + "Sub3 = " + m3);
		System.out.println("Total marks are " + total);
	}
}
