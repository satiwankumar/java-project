package Practice;

public class Hash {

	int key;	
	public Hash(){
		
		this.key=key;
	}
	public  Hash(int key){
		this.key=key;
	}
	
	public int  hashFunction(int key){

		int index;
		
		index = key % 10;
		return index;
	}
	
}
