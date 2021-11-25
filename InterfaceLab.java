package unit2;
import java.util.*;
public class InterfaceLab {

	public static void main(String[] args) {
		TA t = new TA();
		Scanner sc = new Scanner(System.in);
		System.out.print("Emter Name, age and gender of the candidate : ");
		t.getNAG(sc.nextLine(), sc.nextInt(), sc.next());
		System.out.print("Enter sid and course name : ");
		t.getSC(sc.next(), sc.next());
		System.out.print("Enter eid and basic salary : ");
		t.getEidSal(sc.next(), sc.nextInt());
		t.display();
		sc.close();
	}

}
