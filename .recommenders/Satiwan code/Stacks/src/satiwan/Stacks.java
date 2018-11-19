package satiwan;

public class Stacks {

	int top;
	int size;
	int[] array = new int[10];

	public Stacks() {

		top = -1;
		size = array.length;

	}

	public void push(int item) {

		if (top >= size) {

			System.out.println("Array is full");

		} else {

			top++;
			array[(int) top] = item;
		}

	}

	public int  pop() {

		if (top >= 0) {

			int x = array[(int) top];
			top--;
			return x;
		} else {

			System.out.println("Stack is empty");
		}
		return 0;
	}

	public void display() {
		for (int i = 0; i <=top; i++) {
			System.out.println(array[i]);
		}
	}

}
