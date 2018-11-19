import java.util.*;

public class llist {
	Scanner input= new Scanner(System.in);
	Node header;
	llist ()
	{
		header = new Node();
		
	}
	public void insert_front(int d)
	{
		Node n=new Node();
		n.data=d;
		n.link = header.link;
		header.link = n ;
		
	}
	public void insert_end(int d)
	{
		Node n = new Node();
		
		Node P = header;
		while(P.link!=null)
		{
			P=P.link;
			
		}
		n.data=d;
		P.link = n;
		
	}
	public void insert_middle(int d)
	{
		Node n = new Node();
		System.out.println("insert the value in between which after which you want to insert the number " + d);
		int key = input.nextInt();
		
		
		Node P = header;
		while(P.data!=key && P.link!=null)
		{
			P=P.link;
			
		}
		n.data=d;
		n.link=P.link;
		P.link = n;
		
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
	public void delete_front()
	{
		Node ptr;
		ptr=header.link;
		if(ptr==null)
		{
			System.out.println("No data available");
			return;
			
			
		}
		else
		{
			header.link=ptr.link;
		}
	}
	public void delete_end()
	{
		Node n;
		n=header;
		
		
		Node P = header.link;
		while(n.link!=null)
		{
			P=n;
			n=n.link;
			
		}
		P.link=null;
		
	}
	public void delete_middle(int d)
	{
		Node n =new Node();
		n=header;
		
		
		Node P = header.link;
		while(n.link!=null && n.data!=d)
		{
			P=n;
			n=n.link;
			
		}
		
		P.link=n.link;
		
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

	public void merge_ll(llist l2)
	{
		Node p;
		Node ptr = null;
		p=header;
		while(p!=null)
		{
			ptr=p;
			
			p=p.link;
		}
		ptr.link=l2.header.link;
		
		}

	
}
	