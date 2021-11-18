package unit2;

public class InheritanceLab {

	public static void main(String[] args) {
		NStaff ns = new NStaff(111, "AAA", "KNL", 300);
		RTStaff rts = new RTStaff(101, "BBB", "KLL","MTECH", 8, 4000);
		ATStaff ats = new ATStaff(201, "CCC", "XYZ", "BCOM", 10, 300);
		System.out.println("\nNon-Teaching Staff Details");
		System.out.println("-----------------------------------------------------------");
		ns.updateWages(300);
		System.out.println("\nRegular-Teaching Staff Details");
		System.out.println("-----------------------------------------------------------");
		rts.calcGross();
		System.out.println("\nAd-Hoc-Teaching Staff Details");
		System.out.println("-----------------------------------------------------------");
		ats.salaryDetails();
	}

}
