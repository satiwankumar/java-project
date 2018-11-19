package practice;



public class llist {
	Dnode header;
	int size;

	public llist() {

		header = new Dnode();
		size = 0;
	}

	public void insert_front(int d) {
		
		Dnode n = new Dnode();
		n=header.rlink;
		Dnode ptr1= new Dnode();
		ptr1 = header.rlink;
		if(header.rlink!=null ){
			ptr1.llink=n;
			ptr1.rlink=n.rlink;
			}
		n.llink=header;
		header.rlink=n;
		n.data=d;
		
		
		
	}


	void insert_end(int d){
		Dnode ptr= new Dnode();
		ptr=header.rlink;
		while(ptr.rlink!=null){
			ptr=ptr.rlink;
		}
		Dnode n = new Dnode();
		ptr.rlink=n;
		n.llink=ptr;
		n.data=d;
		
	}
	void insert_middle(int d ,int k){
		Dnode ptr  = new Dnode();
		ptr=header.rlink;
		while(ptr.rlink!=header && ptr.data!=k){
			ptr=ptr.rlink;
		}
		Dnode n= new Dnode();
		n.rlink=ptr.rlink;
		Dnode ptr1 =ptr.rlink;
		ptr.rlink=n;
		n.llink=ptr;
		ptr1.llink=n;
		n.data=d;
		
	}
	void delete_front(){
		Dnode ptr = new Dnode();
		ptr=header.rlink;
		header.rlink=ptr.rlink;
		ptr.llink=header;
		
		
	}
	void delete_End(){
		Dnode ptr = new Dnode();
		ptr=header.rlink;
		Dnode ptr1  =  new Dnode();
		ptr1=header;
		while(ptr.rlink!=header){
			ptr1=ptr;
			ptr= ptr.rlink;
		}
		ptr1.rlink=null;
		
		
		
		
	}
	
	void  delete_middle(int k){
		
		Dnode ptr = new Dnode();
		ptr=header.rlink;
		while(ptr.rlink!=header && ptr.data!=k){
			ptr=ptr.rlink;
		}
		Dnode ptr1=ptr.llink;
		ptr1.rlink=ptr.rlink;
		ptr.llink=ptr1;
	}
	
	

	public void display() {
		Dnode ptr = new Dnode();
		ptr = header;
		while (ptr.rlink!= header) {
			System.out.println(ptr.llink + " " + ptr.data + " " + ptr.rlink);
			ptr = ptr.rlink;
		}
		size++;
	}

}
