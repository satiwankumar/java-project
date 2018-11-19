package Arrays;

import java.util.*;

public class Main {
	static double x;
	int i;

	public static void main(String[] args) {
		Main o = new Main();

		Scanner input = new Scanner(System.in);
		for(double i : insert()){
		 
			System.out.println(i);
		}
		
		}

	

	
	public static double[] insert() {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the size of an Array : ");
	int size = input.nextInt();
	double[] number = new double[size];
		
		System.out.println("Enter the Elements you wanna Enter : ");
				for (int  i = 0; i < number.length; i++) {
					x = input.nextDouble();
					number[i] = x;
								}
				return number;
				
				
	}
	}

