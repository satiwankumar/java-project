package ali;

public class Bicycle extends cycle{
	
	
	String brand;
	
Bicycle(){
	
	this.weight=40;
	this.brand = "hero";
}	
	
	//overriding 
	public  void info(){
		System.out.println("subclass method "+ brand+weight);
	}
	

}
