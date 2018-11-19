package satiwan;

import java.util.Scanner;

public class Main {
	public static void main(String [] args){
		StacksPractice a = new StacksPractice();
		Scanner input = new Scanner (System.in);
		System.out.println("Enter your elements");
		a.push(input.nextInt());
		a.push(input.nextInt());
		a.push(input.nextInt());
		a.display();
		a.pop();
		a.display();
		a.pop();
		a.display();
		a.pop();
		a.display();
		a.pop();
		a.display();
	}

}
