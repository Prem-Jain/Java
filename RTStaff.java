package unit2;

public class RTStaff extends TStaff{
	private double bsal, gs;
	RTStaff(int no, String name, String addr, String q, int exp, double bp)
	{
		super(no, name, addr, q, exp);
		bsal = bp;
	}
	void calcGross()
	{
		double da = 0.5*bsal;
		double hra = 0.2*bsal;
		gs = bsal + da + hra;
		super.dispDetails();
		super.display();
		System.out.println("Gross Salary is " + gs);
	}
}
