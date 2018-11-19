package data;

public class llist {

	Node header;
	public llist(){
		
		header= new Node();
		
	}
	 
	public void  insert_Front(int d){
		
		Node n = new Node();
		n.link=header.link;
		header.link=n;
		n.data=d;
		
		
		}
	public void display(){
		Node ptr= new Node();
		ptr=header.link;
		while(ptr!=null){
			
			System.out.println(ptr.data+" "+ptr.link);
			ptr=ptr.link;
		}
	}
	
	
	
	
	
}
