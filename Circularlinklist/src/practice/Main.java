package practice;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		llist list= new llist();
		list.insert(55);
		list.insert(15);
		list.insert(25);
		list.insert(45);
		list.insert_End(36);
		list.insert_middle(56, 25);
		list.display();
		System.out.println("Delete called");
		
	}

}
