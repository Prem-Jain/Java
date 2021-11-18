package unit2;

public class Staff {
	private int eid;
	private String ename;
	private String address;
	Staff(int no, String name, String addr)
	{
		eid = no;
		ename = name;
		address = addr;
	}
	void dispDetails()
	{
		System.out.println("Staff Id, name and address are " + eid + " " + ename + " " + address);
	}
}
