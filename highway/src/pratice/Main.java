package pratice;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		llist ist=new llist();
		System.out.println("Enter the number you want to insert in linklist at front ");
		
		ist.insert_front(input.nextInt());
		ist.insert_front(input.nextInt());
		ist.insert_front(input.nextInt());
		ist.insert_front(input.nextInt());
		System.out.println("delte caleed");
		ist.delete_Front();
		ist.display();
		System.out.println("delte caleed");
		ist.delete_midddle(8);
		ist.display();
		llist copiedlist = new llist();
		copiedlist.copy_ll(ist);
		System.out.println("copied llist");
		ist.display();
	}

}
