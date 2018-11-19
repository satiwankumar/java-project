package pratice;

public class llist {
	Node header;
	
	llist(){
		
		header = new Node();
		
	}
	
	public void insert_front(int d){
		
		Node ptr=new Node();
		ptr.link=header.link;
		header.link=ptr;
		ptr.data=d;
		
	}

public void insert_End(int d){
		
		Node ptr=new Node();
		ptr=header.link;
		while(ptr.link!=null){
			ptr=ptr.link;
			
		}
		Node n = new Node();
		ptr.link=n;
		n.data=d;
		
		
			
	}	
public void insert_middle(int d,int k){
	Node ptr=new Node();
	ptr=header.link;
	while (ptr.link!=null && ptr.data!=k){
		
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
	
	Node ptr= new Node();
	ptr = header.link;
	Node ptr1= new Node();
	ptr1=header;
	while(ptr.link!=null){
		ptr1=ptr;
		ptr=ptr.link;	
	}
	ptr1.link=null;
	
	
	
}

public void delete_midddle(int k){
	Node ptr = new Node();
	Node ptr1= new Node();
	ptr=header.link;
	ptr1=header;
	while(ptr.link!=null & ptr.data!=k){
		ptr1=ptr;
		ptr=ptr.link;
	}
	ptr1.link=ptr.link;	
}

public void copy_ll(llist p){

	Node ptr,ptr1;
	ptr=p.header.link;
	Node n;
	ptr1=header;
	while(ptr!=null)
	{
		n= new Node();
		n.data=ptr.data;
		ptr1.link=n;
		ptr1=n;
		ptr=ptr.link;
	
	}

	
}		






	public void display(){
		
		Node ptr = new Node();
		ptr=header.link;
		while(ptr!=null){
			System.out.println(ptr.data+"  "+ ptr.link);
			ptr=ptr.link;
		}
		
	}

}
