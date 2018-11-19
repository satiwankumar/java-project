package Loops;
import java.util.*;
public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String a ;
		do{		
		System.out.println("Enter your command : ");
		String command = input.nextLine();
	switch(command){
				
	case "start":
			System.out.println("your machine has started");
			break;
	case "stop":
			System.out.println("your machine has stoped");
			break;
	default:
			System.out.println("Machine is not working");
	 }
	System.out.println("do u want to give another command 'y' or 'n'");
	a =input.nextLine();	
	}while(a!="n");

	
	
	
	
	}

}
	
