package Programs;
import java.util.*;
public class Tables {
	public static void main(String [] args){
		Scanner input = new  Scanner(System.in);
		System.out.println("Enter your table number : ");
		int b = input.nextInt();
		for(int i=1;i<=10;i++){
			
			System.out.println(	b+"*"+i +"="+b*i);
		}
	
	}



}