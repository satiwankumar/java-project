package Loops;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
//arrays of Strings
		String []fruits = new String[5];
		 
		for(int  i=0 ;i<fruits.length;i++){
			System.out.println("Enter your fruits name : ");
			fruits[i]=input.nextLine();
			
			
		}
		
		
		
		for(String values:fruits){
			if(values.equals("satiwan")){
				System.out.println("ali");
		
				
			} 
		}
		
		
		
		
	}
	

}

		/*
// 		initalizing Array by assigning values 
		int [] values = {1,3,4,5};
			
			for(int i=0;i<values.length;i++){
				System.out.println(values[i]);
				
			}
		
		
		
	}	
}
		*/
		
		
		/*		Scanner input = new Scanner(System.in); 
		int[] numbers = new int[5];
		for (int i=0;i<numbers.length;i++)
		{
			int num = input.nextInt();
			numbers[i] = num;
		}
		
		for(int i=0;i<numbers.length;i++){
			
			System.out.println(numbers[i]);

}
}
}
*/			


