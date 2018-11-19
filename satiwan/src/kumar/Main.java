package kumar;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		llist list =new llist();
		llist p= new llist();
		list.insert_front(45);
		list.insert_end(15);
		list.insert_end(57);
		list.copy_ll(p);
		list.display();

	}

}
