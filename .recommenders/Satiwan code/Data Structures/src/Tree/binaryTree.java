package Tree;

public class binaryTree {

	Node root;

	binaryTree() {
		root = null;
	}

	binaryTree(int data) {
		root = new Node(data);
	}

	public void insert(int value) {

		Node ptr = new Node(value);
		ptr = root;
		if (value <= ptr.data) {
			if (ptr.left == null) {
				ptr.left = new Node(value);
			} else {
				ptr.left.insert(value);
			}
			
		}else{
			
			if(ptr.right== null){
				
				ptr.right=new Node(value);
			}else{
				ptr.right.insert(value);
			}
		}

	}

	void printPostorder(Node node) {
		if (node == null)
			return;

		printPostorder(node.left);
		printPostorder(node.right);

		System.out.print(node.data + " ");
	}

	void printPostorder() {
		printPostorder(root);
	}
}
