package practice;



public class llist {
	
	Node header;
	
	public llist(){
		header =  new Node();
		
		
	}

	public void insert(int d){
		Node  n = new Node();
		n.link=header.link;
		header.link=n;
			n.data=d;
			if(n.link==null){
				n.link=header;
			}
	}
	public void insert_End(int d){
				
				Node ptr=new Node();
				ptr=header.link;
				while(ptr.link!=header){
					ptr=ptr.link;
					
				}
				Node n = new Node();
				
				
				n.link=ptr.link;
				ptr.link=n;
				n.data=d;
					
			}		
	
	public void insert_middle(int d,int k){
		Node ptr=new Node();
		ptr=header.link;
		while (ptr.link!=header && ptr.data!=k){
			
			ptr=ptr.link;
		}
		Node n= new Node();
		n.link=ptr.link;
		ptr.link=n;
		n.data=d;
		
	}
	
	public void delete_Front(){
		
		Node ptr = new Node();
		ptr=header.link;
		header.link=ptr.link;
		
	}	
	public void delete_End(){
		Node ptr = new Node();
		ptr=header.link;
		Node ptr1= new Node();
		ptr=header;
		while(ptr.link!=header){
			ptr1=ptr;
			ptr=ptr.link;
		}
		ptr1.link=header;
		
		
	}
	public void delete_middle(int k){
		Node ptr = new Node();
		ptr=header.link;
		Node ptr1 = new Node();
		ptr1=header.link;
		while(ptr.link!=header && ptr.data!=k){
			ptr1=ptr;
			ptr=ptr.link;
			
		}
		ptr1.link=ptr.link;
		
		
		
	}		
	
	
	
	public void display(){
		Node ptr = new Node();
		ptr= header;
		while(ptr.link!=header){
		System.out.println(ptr.data +" "+ ptr.link);
			ptr=ptr.link;
		}
		
		
	}
	
	
	
}
