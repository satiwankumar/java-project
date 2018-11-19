import java.util.Scanner;

public class Account {
	
	
	private String AccountNO;
	private double  balance;
	Scanner input = new Scanner(System.in);
	
	
	Account(String AccountNO){
		this.AccountNO=AccountNO;
		this.balance =100;
		
	}
	Account(double bal,String AccountNO){
		if(bal>=100){
			this.balance =bal;
		}
		else{
			balance=100;
		}
		
	}
	
	
	public void withdraw(double amount ){
	System.out.println("Enter your amount");	
		amount= input.nextInt();
		if(balance>100 && balance>amount){
			balance=balance-amount;
			System.out.println("you withdraw: " + amount);
		}
		else if (balance <100) {
			balance = 100;			
		}
		}
	
	
	public void deposit(double amount){
		if(amount>0)
		{
		balance = balance + amount;
		}
		else {
		System.err.println("The amount you Entered Is not valid");	
			
		}
	}
		
	
	public double checkBalance(){
		
	return balance;	
	}
	

}
