package satiwan;

public class Qllist {

	Node header;
	int front ,rear;
	
	public Qllist(){
		
		header=  new Node();
		front=-1;
		rear=-1;
	}
	
	public void Enqueue(int d){
		
		Node q = new Node();
		front =0;
		rear ++;
		q.data=d;
		q.link=header.link;
		header.link=q;
		
	}
	
	public void dequeue(){
		
	if(front==-1){
		System.out.println("link list is empty");
	}	
	else if (front==rear){
		
		front=-1;
		rear=-1;
		
		Node ptr= new Node();
		Node ptr1= new Node();
		ptr= header.link;
		ptr1=header;
		while(ptr1.link!=null){
			ptr1=ptr;
			ptr=ptr.link;
		}
		ptr1.link=null;
		}
		
		
		else{
			Node ptr= new Node();
			Node ptr1= new Node();
			ptr= header.link;
		ptr1=header;
		while(ptr1.link!=null){
			ptr1=ptr;
			ptr=ptr.link;
		}
		rear--;
		ptr1.link=null;
		
			
			
			
		}
		
		
	
	}	
	
	public void display(){
		Node p= new Node();
		p=header.link;
		while (p!=null){
			System.out.println(p.data+ " "+ p.link);
			p=p.link;
		}
		
		
		
	}
}
