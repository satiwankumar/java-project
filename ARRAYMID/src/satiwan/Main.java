package satiwan;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice, size, i;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Size of an array : ");
		size = input.nextInt();
		int[] number = new int[size];
		System.out.println("Enter the Elements of Array  : ");
		for (i = 0; i < number.length; i++) {

			number[i] = input.nextInt();

		}
		System.out.println("Array created Successfully");

		choice = 1;
		while (choice != 6) {
			System.out.println(" 1.  Insert Array " + " 2.  Search Array " + " 3.  View  Array  " + " 4.  delete Array "
					+ " 5.  Sum of Array Elements" + " 6. 	Exit ");

			System.out.println("Enter your Choice ");
			choice = input.nextInt();

			switch (choice) {
			case 1:
				insert(number);
				break;
			case 2:
				search(number);
				break;
			case 3:
				view(number);
				break;
			case 4:
				delete(number);
				break;
			case 5:
				sum(number);
				break;
			case 6:
				Exit();

			}

		}
		System.out.println("Thank you for using our program");

	}

	public static void insert(int number[]) {
		int i, x;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Elemeent you want to Insert: ");
		x = input.nextInt();
		for (i = number.length-1; i > 0; i--) {

			number[i] = number[i-1];

		}
		number[i]=x;
		System.out.println("Item inserted Successfulyy");

	}

	public static void search(int number[]) {
		int i, x;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Elemeent you want to Search: ");
		x = input.nextInt();
		for (i = 0; i < number.length; i++) {
			if (number[i] == x) {
				System.out.println("Number found " + number[i]);
				break;
			} 
		}


	}

	public static void view(int number[]) {
		System.out.println("updated Array ");
		int i;
		for (i = 0; i < number.length; i++) {
			System.out.println(number[i]);
		}
	}

	static void delete(int number[]) {
		int i, x, index = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Elemeent you want to Search: ");
		x = input.nextInt();
		for (i = 0; i < number.length; i++) {
			if (number[i] == x) {
				index = i;
			}

			for (i = index; i < number.length - 1; i++) {
				number[i] = number[i + 1];
	
			}
			number[number.length-1]=0;
			System.out.println("Array deleted successfuly");

		}
	}

	static void sum(int number[]) {
		int i,sum=0;
		for (i = 0; i < number.length; i++) {
			sum=sum+number[i];
			
		}
		System.out.println("Sum  of above array is " + sum);
	}

	public static void Exit() {
		System.exit(0);
		System.out.println("Thank you for suing our program");

	}

}
