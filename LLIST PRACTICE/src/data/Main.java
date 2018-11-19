package data;

import java.util.Scanner;

public class Main {
	public static void main(String [] args){
		
	
		
		llist c= new llist();
		int n,i;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the element you want to insert : ");
		for(i=0;i<5;i++){
		
		 c.insert_Front(input.nextInt());
		}
		c.display();
		
		
	}

}
