package satiwan;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Qllist q1= new Qllist();
		q1.Enqueue(25);
		q1.Enqueue(55);
		q1.Enqueue(35);
		q1.Enqueue(65);
		q1.Enqueue(75);
		
		q1.dequeue();
		q1.display();

	}

}
