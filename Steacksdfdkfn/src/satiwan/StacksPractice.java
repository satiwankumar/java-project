package satiwan;


public class StacksPractice {
	
	int top;
	int size;
	
	int a [] = new int[5];
	
	public StacksPractice(){
		top=-1;
		size=a.length;
	}
	
	
	public void push(int d){
		if(top>=size){
			System.out.println("stack is full");
		}
		else
		{
			top++;
			a[top]=d;
			
		}
	
	}
	public void pop( ){
		if(top==-1){
			System.out.println("Stack is empty");
		}
		else{
			top--;
			System.out.println("pop called ");
		}
		
		
	}
	 
		
	
	
	public void display(){
		for(int i=0;i<=top;i++)
		System.out.println("Stack is +"+a[i]);
		
	}
	

}

	


