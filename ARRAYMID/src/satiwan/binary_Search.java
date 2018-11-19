package satiwan;

import java.util.Scanner;

public class binary_Search {

	public static void main(String[] args) {
		int i, x;
		Scanner input = new Scanner(System.in);
		int numbers[] = new int[5];
		System.out.println("Enter the eleents of array");
		for (i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}

		int l,r,m,index;
		l=0;
		r=numbers.length-1;
		m=(r-l/2);
		System.out.println("Enter the element you want to search : ");
		x=input.nextInt();
		for(i=0;i<numbers.length;i++){
		if(i == m){
		 index=i;
			
		}
		}
		for(i=index;i<numbers.length;i++){
			
			
		}
		
		
		
	}

}
