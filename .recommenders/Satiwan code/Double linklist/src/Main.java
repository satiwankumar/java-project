
public class Main {
	public static void main(String[] args) {
		
		Llist  list = new Llist();
		list.insert(25);
		list.insert(35);
		list.insert(45);
		list.insert(55);
		
		
		list.display();
		System.out.println("insert at the End");
		list.insert_End(25);
		list.display();
		
		
		System.out.println("Inserted int he middle ");
		list.insert_Middle(66, 35);
		list.display();
		
		
		System.out.println("Delete called");
		
		list.delete_front();
		list.display();
System.out.println("Delete  End called");
		
		list.delete_End();
		list.display();
		
		
System.out.println("Delete  Middle called");
		
		list.delete_middle(66);
		list.display();
	
	}
}
