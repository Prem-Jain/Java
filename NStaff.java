package unit2;

public class NStaff extends Staff{
	private int dwages;
	NStaff(int no, String name, String addr, int dw)
	{
		super(no, name, addr);
		dwages = dw;
	}
	void updateWages(int amt)
	{
		dwages = dwages + amt;
		super.dispDetails();
		System.out.println("Updated daily wages amount is : " + dwages);
	}
}
