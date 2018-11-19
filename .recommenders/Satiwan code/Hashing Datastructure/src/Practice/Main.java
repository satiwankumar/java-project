package Practice;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value[] = new int[10];
		int index[] = new int[10];
		int i, j;
		int array[] = new int[10];
		Hash a = new Hash();

		Scanner input = new Scanner(System.in);
		System.out.println("Enter your number ");
		for (i = 0; i < array.length; i++) {
			value[i] = input.nextInt();
		}

		for (i = 0; i < value.length; i++) {
			for (j = 0; j < index.length; j++) {

				 
					index[j] = a.hashFunction(value[i]);
					array[index[j]]=value[i];
			}

			
			
		}

		for (i = 0; i < 10; i++)

		{
			System.out.println(" inserted array using hashing technique is : " + array[i]);

		}

	}
}
