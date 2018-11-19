package Programs;
import java.util.*;
public class arrayp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your number : ");
		int[] number  = new int[5];
		
		for(int i=0;i<number.length;i++){
			
		number[i] = input.nextInt();	
		
	}	
		System.out.println("Sorted Array");
		for(int i=0;i<number.length;i++)
		{
			
				Arrays.sort(number);
				 System.out.println("Sorted numeric array : "+Arrays.toString(number));
		System.out.println();
		}
			
		
		
	}

}

