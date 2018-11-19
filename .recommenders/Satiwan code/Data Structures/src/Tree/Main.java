package Tree;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		

		binaryTree tree =  new binaryTree();
		
		tree.root= new Node(1);
		tree.root.left= new Node(2);
		tree.root.right= new Node(3);
		tree.root.left.left = new Node(5);
		tree.root.right.left=new Node(6);
		System.out.println("Preorder traversal of binary tree is ");
        tree.printPostorder();
 
       
	}

}
