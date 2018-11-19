package practice;

public class pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*

		int i, j,count=1;
		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= 5; j++) {
				if( j<=i){
					System.out.print(i  + " ");
					count++;
					
				}
				else{
				System.out.print("* ");
				}
			}
			System.out.println("\n");
		}
*/		

	/*	int i, j,count=1;
		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= 5; j++) {
				if( i<=j){
					System.out.print(i  + " ");
					count++;
					
				}
				else{
				System.out.print("* ");
				}
			}
			System.out.println("\n");
		}
	*/
		int i, j,count=1;
		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= i; j++) {
				if(i==1 ||i==5 || j==5 || j==1 || i==j || j==i){
					System.out.print(" @");
				
				}
				else{
					System.out.print("  ");
				}
				
			}
			System.out.println("\n");
		}
	
	

		
		
		
		
		
		
	
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

