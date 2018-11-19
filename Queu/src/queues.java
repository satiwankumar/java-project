
public class queues {
	
	int [] a = new int[5];
	int rear ,front,size;
	
	queues(){
		this.rear=-1;
		this.front=-1;
		this.size=a.length;
	}
	
	public void Enqueue(int x){
		if(rear==size){
			System.out.println("Queue is full");
		}
		else if ((front == -1 ) && (rear== -1)){
			
			front=0;
		}
		rear++;
		a[rear]=x;
		
	}
	public void Dequeue(){
		if((front ==-1 )&& (rear ==-1)){
			System.out.println("Queue is Empty");
		}
		else if (front==rear)	{
			System.out.println("Stack is full ");
			
		front=-1;
		rear=-1;
		
		}
			else
			{
				front++;
				
			}
		
		}
		
		
		
		
		
	
	public void display(){
		for(int i=front;i<=rear;i++){
			System.out.println(a[i]);
			
		}
	}
}
