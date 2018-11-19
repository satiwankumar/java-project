package practice;

public class arrayStacks {

	int a[] = new int[6];

	int top,size;
	public arrayStacks(){
		
		this.top=-1;
		this.size=a.length;
		
	}
	
	public void push(int x){
		if(top>=size){
			System.out.println("Array is full");
		}
		else{
		
		top++;
		a[top]=x;
		}
	}
	
	
	public void pop(){
		int x;
		if(top>=0){
			x=a[top];
			top--;
			
		}
		else{
			System.out.println("Stack is empty");
		}
		
		
	}
	
	public int sum(){
		int sum=0;
		while(top>-1){
			
		
			sum=sum+a[top];
			top--;
		}
		return sum;
		
		
	}
	
	public void status(){
		
		if(top<0){
			
			System.out.println("Stack is empty");
		}else if (top>=0 && top!=size){
		float x = (top/size)*100;
		System.out.println("Stack is" + x + "percent full");
		}
		else{
			System.out.println("Stack is full");
		}
		
	}
	
	
	public void display(){
		
		for(int i=0;i<=top;i++){
			
			System.out.println(a[i]);
		}
		
	} 
	
	
	}


