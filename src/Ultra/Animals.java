package Ultra;

 class Animals {

	public void animalsounds() {
		
		System.out.println("Animals makes some sound");
	}
	
 }
		
	class pig extends Animals{
		
		public void Pigsound() {
			
			System.out.println("Pig doing wee wee");
		
			
			
	}}
		
		class dog extends Animals{
			
			public void animalsounds() {
				
				System.out.println("dog doing bho bho");
			
		}
		}
			
			public class main{
				
				
				public static void main(String[] args ) {
					
				  Animals myanimals = new Animals();
				  
				  Animals mypig = new pig();
				  
				  Animals mydog = new dog();
				  
				  myanimals.animalsounds();
				  
				  mypig.animalsounds();
				  
				  mydog.animalsounds();
				  
				}}