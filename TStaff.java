package unit2;

public class TStaff extends Staff {
	private String qualifications;
	private int yoexp;
	TStaff(int no, String name, String addr, String q, int exp)
	{
		super(no, name, addr);
		qualifications = q;
		yoexp = exp;
	}
	void display()
	{
		System.out.println("Staff Qualifications and years of experience are " + qualifications + " " + yoexp);
	}
}
