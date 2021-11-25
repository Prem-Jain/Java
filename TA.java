package unit2;

public class TA implements StudentInterface, StaffInterface{
	String name, gender, sid, eid, coname;
	int age, basicsal;
	public void getNAG(String n, int a, String g)
	{
		name = n;
		age = a;
		gender = g;
	}
	public void getSC(String id, String cn)
	{
		sid = id;
		coname = cn;
	}
	public void getEidSal(String e, int bs)
	{
		eid = e;
		basicsal = bs;
	}
	double grossCalc()
	{
		return (basicsal + basicsal * hra + basicsal * da);
	}
	public void display() {
		System.out.println("NAme, age anda gener of the candidate are : " + name + " " + age + " " + gender);
		System.out.println("Sid and course name of the candidate are " + sid + " " + coname);
		System.out.println("Empolyee ID, basic salary and gross salary are " + eid + " " + basicsal + " " + grossCalc());
	}
}
