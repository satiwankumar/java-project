package Project1;

import java.util.*;
public class Account {


	private double balance = 100;
	private double Accountno;
	private double amount ,num ,i;
	boolean firsttime;
Scanner input=new Scanner(System.in);
	
//constructor
public Account(double Accountno){
		this.Accountno=Accountno;
		
		
	}

public Account(double Accountno,double balance){
	this.Accountno=Accountno;
	
	if(balance>=100){
	this.balance=balance;
	}
	else{
		balance=100;
	}
}


public double getaccountNO(){
	return Accountno;
	
}





	public void withdraw(double amount){
		if(amount>0){
			
		}
		}
		else{
			System.out.println("Invalid Account #");
			}
		}
		}
	
	
	public void  deposit(double amount){
		System.out.println("Depsoit \n Enter the Amount  : ");
		amount =input.nextDouble();
		if(amount>0){
		balance=balance+amount;
		System.out.println("your balance is succesffully added to your account and you new balance is "+ balance);
		}
		else{
			do{
			System.err.println("Invalid Input");
			System.out.println("Enter amount again");
		
			}while(amount<=0);}
		
	}

	
	
	public double checkBalance(){
		return balance;
		
	}

	
	
}




