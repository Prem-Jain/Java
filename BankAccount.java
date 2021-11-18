package unit1;

import java.util.*;

public class BankAccount {

	public static void main(String[] args) {
		Account ac = new Account();
		Scanner sc = new Scanner(System.in);
		int accno;
		String acctype;
		float bal, wdamt, dptamt;
		System.out.print("Enter acc number, acctype and balance : ");
		accno = sc.nextInt();
		acctype = sc.next();
		bal = sc.nextFloat();
		ac.setDetails(accno, acctype, bal);
		System.out.println("Details of the account are ");
		ac.putDeatils();
		System.out.print("Enter amount to be withdrawn : ");
		wdamt = sc.nextFloat();
		ac.withDraw(wdamt);
		System.out.println("Current balance of the account is : " + ac.getBalance());
		System.out.print("Enter amount to be deposited : ");
		dptamt = sc.nextFloat();
		ac.deposit(dptamt);
		System.out.println("Current balance of the account is : " + ac.getBalance());
		sc.close();
	}

}
