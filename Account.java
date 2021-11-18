package unit1;

public class Account {
	int accno;
	String acctype;
	float accbal;
	public void setDetails(int no, String n, float bal)
	{
		accno = no;
		acctype = n;
		accbal = bal;
	}
	public void putDeatils()
	{
		System.out.println("Account number, acctype and balance is " + accno + " " + acctype + " " + accbal);
	}
	public void withDraw(float amt)
	{
		if(accbal < amt)
				System.out.println("Requested amount not avaliable");
		else
			accbal = accbal - amt;
	}
	public void deposit(float amt)
	{
		accbal = accbal + amt;
	}
	public float getBalance()
	{
		return accbal;
	}
}
