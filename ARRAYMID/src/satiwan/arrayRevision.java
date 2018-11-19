package satiwan;

import java.util.Scanner;

public class arrayRevision {

	public static void main(String[] args) {

		int choice, size, i, temp;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Size of an array : ");
		size = input.nextInt();
		int[] number = new int[size];
		System.out.println("Enter the Elements of Array  : ");
		for (i = 0; i < number.length; i++) {
			number[i] = input.nextInt();
		}
		System.out.println("Array created Successfully");

		for (i = 0; i < number.length; i++) {
			for (int j = 0; j < number.length; j++) {
				if (number[i]!=0 || number[i]>number[j]  ){
					
						temp = number[i];
						number[i] = number[j];
						number[j] = temp;
					}

				}
			}
			

		for (i = 0; i < number.length; i++) {

			System.out.println(number[i]);
		}

	}

}