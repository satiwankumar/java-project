package practice;

public class Main {
	public static void main(String [] args){

	arrayStacks out= new arrayStacks();
	out.push(24);
	out.push(36);
	out.push(66);
	
	out.display();
	System.out.println("pop function called");
	out.pop();
	out.display();
	System.out.println(out.sum());
	out.status();
	llist list = new llist();
	list.push(25);
	list.push(35);
	list.push(55);
	list.pop();
	
	list.display();
	}	
	
}
