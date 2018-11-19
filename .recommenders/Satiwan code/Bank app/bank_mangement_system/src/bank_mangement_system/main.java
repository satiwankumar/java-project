package bank_mangement_system;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
	static Scanner n=new Scanner(System.in);
	public static void main(String[] args) {
		
		bank mybank=new bank();
		int y;
		do{System.out.println("1.create account");
		System.out.println("2.search account");
		System.out.println("3.delete account");
		System.out.println("3.view account");
		System.out.println("4.depoist money");
		System.out.println("5.withdraw money");
		System.out.println("6.check balance");
		System.out.println("7.view");
		System.out.println("8.exit menu");
		
	    int x=n.nextInt();
	    switch(x)
	    {
	    case 1:
	    	mybank.create_account(mybank.allitems);
	    	break;
	    case 2:
	    	mybank.search_account();
	    	break;
	    case 3:
	    	mybank.delete_account();
            break;
	    case 4:
	    	mybank.view_account();
	    	break;
	    case 5:
	    	mybank.withdraw_money();
	    	break;
	    case 6:
	    	mybank.check_balance();
	    	break;
	    case 7:
	    	mybank.view(mybank.allitems);
	    	break;
	    }
	    
	    System.out.println("for menu press 1");
	    y=	n.nextInt();
	    
	    
		}while(y==1);
	    
	    
		
		
		
}
}
