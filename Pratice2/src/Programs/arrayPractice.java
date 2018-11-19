package Programs;
import java.util.*;
public class arrayPractice {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double []values = new double[5];
		double sum = 0;
		int count =0;
		System.out.println("Enter your number to sum  : ");
		for(int  i=0;i<5;i++)
			
		{
			values[i] = input.nextDouble();
			sum =sum  + values[i];
			count++;
		}
		
		
		System.out.println("Sum of the Above number is " + sum);
		System.out.println("Average is "+ sum/count);
		
		
	}

}