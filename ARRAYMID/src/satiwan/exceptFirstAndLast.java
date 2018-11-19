package satiwan;

import java.util.Scanner;

public class exceptFirstAndLast {

	public static void main(String[] args) {
		int count=0, avg=0, sum=0;
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
				if ( number[i] > number[j]) {

					temp = number[i];
					number[i] = number[j];
					number[j] = temp;

				}
			}
		}
		
		for(i=1;i<number.length-1;i++){
		
		sum=sum+number[i];
		count++;
			
		}
		
		avg=sum/count;
		System.out.println("Average is "+avg);
		

	}

}
