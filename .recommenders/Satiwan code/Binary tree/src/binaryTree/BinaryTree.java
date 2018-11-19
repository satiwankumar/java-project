package binaryTree;

public class BinaryTree {
	Node root;

	BinaryTree() {
		root = null;
	}

	BinaryTree(int data) {
		root = new Node(data);
	}

	
public void add(int data ){
	Node ptr = new Node(data);
	if(root == null){
		root=ptr;
	}
	
	insert(root,ptr);
	
}	
public void insert(Node node ,Node ptr){
	
	if(ptr.data<node.data){
		insert(node.left,ptr);
	}
	else if (ptr.data>node.data){
		
		insert(node.right,ptr);
	}
	
		
}



	
	
	
	
	
	
	
	
	
	
}
/*	public void insert(int value) {

		Node ptr = new Node(value);
		ptr = root;
		if (value <= ptr.data) {
			if (ptr.left == null) {
				ptr.left = new Node(value);
			} else {
			
			}
			
		}else{
			
			if(ptr.right== null){
				
				ptr.right=new Node(value);
			}else{
				ptr.right.insert(value);
			}
		}

	}
}
*/