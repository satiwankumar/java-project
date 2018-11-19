package Loops;
import java.util.*;
public class Array {
	
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		int [][] mda = new int [3][3];
		
		for(int i=0;i<mda.length;i++){
			
				for(int j=0;j<mda.length;j++){
					
					System.out.println("Enter your input : \n ");
						{
							int values = input.nextInt();
							mda[i][j] = values;
						}
				
				}
		}
						for(int i=0;i<mda.length;i++){
							
								for(int j=0;j<mda.length;j++){
								
										System.out.println(mda[i][j]);
					
													}
							
						System.out.println("\t");
						}
			}
			
		}
		
	


