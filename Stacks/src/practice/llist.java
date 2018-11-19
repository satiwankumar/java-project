package practice;

public class llist {
	Node header,top;
public llist(){
	header= new Node();
	top = header.link;
	
}
 public void push(int d){
	 Node n = new Node();
	 n.link=top;
	 n.data=d;
	 top=n;
	 header.link=n;
	 
 }
 public void pop(){
	 
	 if(top==null){
		 System.out.println("Stack is Empty");
	 }
	 else{
			 int x = top.data;
			 header.link=top.link;
			 top=header.link;
			 
			 
		 }
		 
	 }
	 
	 
	 
	 
 
 public void display(){
	 Node ptr = new Node();
	 ptr=header.link;
	 while(ptr!=null){
		 System.out.println(ptr.data+" "+ptr.link);
		 ptr=ptr.link;
	 }
	 
 }



}
