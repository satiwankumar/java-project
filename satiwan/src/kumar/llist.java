package kumar;

public class llist {
Node header;
	
	public llist(){
		header =new  Node();
		
	}
public void insert_front(int d){
		
		Node  ptr = new Node();
		ptr.link=header.link;
		header.link=ptr;
		ptr.data=d;
		
	}


public void insert_end(int d){
	Node ptr=new Node();
	Node ptr1=new Node();
	ptr=header;
	while(ptr.link!=null){
		ptr=ptr.link;
	}
	ptr.link=ptr1;
	ptr1.data=d;
	
}

public void middle(int d, int key){
	Node ptr = new Node();
	ptr=header;
	while(ptr.link!=null && ptr.data != key ){
ptr = ptr.link;

	}
	
	Node ptr1 = new Node();
	ptr1.link = ptr.link;
	ptr.link = ptr1;
	ptr1.data = d;	
	
}
public void delete_Front(){
	Node ptr= new Node();
	ptr=header;
	Node ptr1= new Node();
	ptr1=ptr.link;
	header.link=ptr1.link;
	System.out.println("Item Deleted");
}


public void delete_End(){
	
	Node ptr=new Node();
	ptr=header;
	Node ptr1 = new Node();
	while(ptr.link!=null){
		ptr1=ptr;
		ptr=ptr.link;
		
	}
	ptr1.link=null;
	
	System.out.println("deleted at the End");
	
}

public void delete_middle(int k){
	
	Node ptr=new Node();
	Node ptr1=new Node();
	ptr=header;
	while(ptr.link!=null && ptr.data!=k){
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
	
	Node ptr=new Node();
	Node ptr1 = new Node();
	ptr=header.link;
	ptr1=header;
	while(ptr!=null && ptr1!=null){
		
		System.out.println(ptr.data+"   "+ptr.link);
		System.out.println(ptr1.data+" "+ptr1.link);
		ptr=ptr.link;
		ptr1=ptr1.link;
	}	
	
	
	
}

}
