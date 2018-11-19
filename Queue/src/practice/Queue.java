package practice;

public class Queue {
	int[] a = new int[10];
	int front ,rear,size;
	public Queue(){
		this.front=-1;
		this.rear=-1;
		this.size=a.length;
		
	}
	
	public void enQueue(int x){
		
		if(rear == size){
			System.out.println("Queue is full ");
			
		}
		else if ((front==- 1) && (rear == -1)){
			
			front=0;		
		
		}

		rear++;
		a[rear]=x;	
		
	}
	
	public void deQueue(){
		int x;
		if(front==-1 && rear ==-1 ){
			System.out.println("Queue is Empty ");
		}
		else {
			
			x=a[front];
			if(front == rear ){
				front=-1;
				rear=-1;
			}
			else{
			front++;
			
			}
		}
		
	}
	public void display(){
		
		for(int i=front ; i<=rear;i++){
			System.out.println(a[i]);
		}
	}
	
	
	
	
}
