package unit2;

public class ATStaff extends TStaff {
	private double cpay;
	ATStaff(int no, String name, String addr, String q, int exp, double cp)
	{
		super(no, name, addr, q, exp);
		cpay = cp;
	}
	void salaryDetails()
	{
		super.dispDetails();
		super.display();
		System.out.println("Consolidated salary is " + cpay);
	}
}
