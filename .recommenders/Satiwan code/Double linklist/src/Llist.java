
public class Llist {

	Dnode header;

	Llist() {

		header = new Dnode();
	}

	public void insert(int d) {
		Dnode n = new Dnode();
		n.rlink = header.rlink;

		Dnode ptr1 = header.rlink;
		if (header.rlink != null) {
			ptr1.llink = n;
		}

		header.rlink = n;
		n.llink = header;
		n.data = d;

	}

	public void insert_End(int d) {
		Dnode ptr = new Dnode();
		ptr = header;
		while (ptr.rlink != null) {
			ptr = ptr.rlink;
		}
		Dnode n = new Dnode();
		n.llink = ptr;
		ptr.rlink = n;
		n.data = d;

	}

	public void insert_Middle(int d, int key) {

		Dnode ptr = new Dnode();
		ptr = header.rlink;
		Dnode ptr1 = header; 
		while (ptr.rlink != null && ptr.data != key) {
			ptr1=ptr;
			ptr = ptr.rlink;
		}
		Dnode n = new Dnode();
		n.rlink=ptr1.rlink;
		ptr.llink=n;
		ptr1.rlink=n;
		n.llink=ptr1;
		n.data=d;
		

	}
	
	public void delete_front(){
		Dnode ptr= new Dnode();
		ptr=header.rlink;
		Dnode ptr1=ptr;
		header.rlink=ptr.rlink;
		ptr1.llink=header;
		
		
	}

	public void delete_End(){
		Dnode ptr = new Dnode();
		ptr= header.rlink;
		Dnode ptr1 =header.rlink;
		while(ptr.rlink!=null){
			ptr1=ptr;
			ptr=ptr.rlink;
			
		}
		ptr1.rlink=null;
		
		
		
	}
	
void  delete_middle(int k){
		
		Dnode ptr = new Dnode();
		ptr=header.rlink;
		while(ptr.rlink!=null && ptr.data!=k){
			ptr=ptr.rlink;
		}
		Dnode ptr1=ptr.llink;
		ptr1.rlink=ptr.rlink;
		Dnode ptr2=ptr1.rlink;
		ptr2.llink=ptr1;
	
	}
	
	
	
	
	public void display() {
		Dnode ptr = new Dnode();
		ptr = header;
		while (ptr != null) {
			System.out.println(ptr.llink + " " + ptr.data + " " + ptr.rlink);
			ptr = ptr.rlink;
		}

	}
}
