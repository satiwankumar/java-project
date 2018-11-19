package satiwan;

public class llist {
	
	Node header;
	
	public llist(){
	Node header=new Node();
				
	}
	
	public void insert_Front(int d){
		Node n=new Node();
		n=header;
		n.data=d;
		n.link = header.link;
		header.link = n ;
		
	} 

	public void display()
	{
		Node P = new Node();
		P = header.link;
		while(P!=null)
		{
			System.out.println(P.data + " " + P.link);
			P=P.link;
		}
		
		
	}
}
