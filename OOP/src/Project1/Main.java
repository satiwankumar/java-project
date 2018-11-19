package Project1;

public class Main {

	public static void main(String[]args){
		Account satiwan = new Account(161);
		
		
		
		System.out.println(	"Balance  is :  "+satiwan.checkBalance() );
		satiwan.deposit(2000);
		System.out.println(	"Balance  is :  "+satiwan.checkBalance() );
		
		satiwan.withdraw();
		System.out.println(	"Balance  is :  "+satiwan.checkBalance() );
		
	}
	
}
