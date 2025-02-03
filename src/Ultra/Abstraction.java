package Ultra;

abstract class Abstraction {
	
	public abstract void animalsound();{
	}
	public void sleep() {
		
		System.out.println("ZZZZZ");
		
	}
	
	}
	

 class Pig extends Abstraction {
	
	public void animalsound() {
	
	System.out.println("We are here");
	
 
}


}
 
  class main {
	 
	 public static void main(String[] args) {
		 
		 Pig mypig = new Pig();
	 
		 mypig.animalsound();
		 mypig.sleep();
		 
 
	 }}