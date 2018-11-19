package bank_mangement_system;

import java.util.ArrayList;
import java.util.Scanner;

public class bank {
	Scanner n = new Scanner(System.in);

	ArrayList<costumer> allitems=new ArrayList<costumer>();
	public void create_account(ArrayList<costumer> allitems) {
		System.out.println("create account");
		String firstname;
		String lastname;
		int nic;
		String accounttype;
		System.out.println("enter first name");
		firstname = n.next();
		System.out.println("enter last name ");
		lastname = n.next();
		System.out.println("enter nic number");
		nic = n.nextInt();
		System.out.println("account type");
		accounttype = n.next();
		System.out.println("your account has been created successfully!");

	}

	public void search_account() {
		System.out.println("2.search account");
	}

	public void delete_account() {
		System.out.println("3.delete account");
	}

	public void view_account() {
		System.out.println("3.view account");
	}

	public void deposit_money() {
		System.out.println("4.depoist money");
	}

	public void withdraw_money() {
		System.out.println("5.withdraw money");
	}

	public void check_balance() {
		System.out.println("6.check balance");
	}

	public void view(ArrayList<costumer> allitems) {
		System.out.println("All custumers"+allitems);
	
	/*	for (costumer i : allitems) {
			System.out.println(  i);
			
		}*/
		

	}

	public void exit() {
		System.out.println("7.exit menu");
	}

}
