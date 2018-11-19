
public class Main {

	public static void main(String[] args)
	{
		llist l = new llist();
		
	l.insert_front(1024);
	l.insert_front(56);
	l.insert_front(65);
	l.insert_front(234);
	l.insert_front(900);
	llist copiedlist = new llist();
	copiedlist.copy_ll(l);
	
	llist listtomerge=new llist();
	listtomerge.insert_front(12);
	listtomerge.insert_front(24);
	listtomerge.insert_front(36);
	listtomerge.insert_front(48);
	l.merge_ll(listtomerge);
	l.display();
	
		
	}
	


public class Node {
	int data;
	Node link;
	Node()
	{
		data =0;
		link = null;
	}
}






}
