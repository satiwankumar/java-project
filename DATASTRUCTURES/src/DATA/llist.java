package DATA;

public class llist {

	Node header;
public llist(){
	
	 header = new Node();
	
	
}	
	
public void Insert_begining(int d){
	Node n=new Node();
	n.link=header.link;
	n.data=d;
	header.link=n;
	
	
	
}
/*public void Insert_Middle(int d,int k){
	Node c=new Node();
	Node n=new Node();
	c=header;
	while(c!=null && c.data!=k){
		c=c.link;
		
	}
	n.link=c.link;
	c.link=n;
	n.data=d;	
}
public void Insert_End(int d){
	Node c = new Node();
	c= header;
	while (c.link!=null){
		c=c.link;
	}
	Node n = new Node();
	c.link=n;
	n.data=d;
	
	
}

public void delete_front(){
	
	Node ptr=new Node();
	ptr=header;
	header=ptr.link;
	System.out.println("delted");
	
	
}

public void del_End(){
	
	Node ptr = new Node();
	ptr=header;
	Node ptr1=new Node();
	ptr1=header.link;
	while(ptr.link!=null){
		
		ptr1=ptr;
		ptr=ptr.link;
	}
		
	ptr1.link=null;
	System.out.println("Deleted at the End");
}
	public void del_Middle(int d,int k)
	{
		Node ptr =new Node();
		ptr=header;
		while(ptr.link!=null && ptr.data==k ){
			
			
			
		}
		
	}	
*/

public void display(){
	Node ptr = new Node();
	ptr=header.link;
while (ptr!=null){
System.out.println(ptr.data+" "+ptr.link);
ptr=ptr.link;
}
}


}
