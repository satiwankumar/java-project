package satiwan;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		int size,i;
		Scanner input = new Scanner(System.in);
		int[] array = new int[5];
		System.out.println("Enter the elements you want to Enter :");
		for ( i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}

		System.out.println("Enter the element you want to Search : ");
		int y = input.nextInt();
		 size=array.length;
		for (i = 0; i < array.length; i++) {
			if (array[i] == y) {
					
				System.out.println("number found  : " + array[i]);
				
				break;
			}
			

		}
		if (i == size){  /* Searching element is absent */
	        System.out.println(y + " is not present in array.");
		}
	}

}
