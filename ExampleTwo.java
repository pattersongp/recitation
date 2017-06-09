public class ExampleTwo {

	//Truth: Everything in Java is passed by value.
	//Objects, however, are never passed at all. 

	//Truth: The values of variables are always primitives
	//	 or references, never objects.
	public static void main(String[] args){
	
		//Make a new Dog object with the name Clifton
		Dog goodBoy = new Dog("Clifton");
		System.out.println("His name is " + goodBoy); //

		//What is going to happen here?
		nameSwap(goodBoy);
		System.out.println("His name is " + goodBoy);
        
	        //what is going to happen here?
		nameSwap2(goodBoy);
        	System.out.println("His name is " + goodBoy);
	}

	public static void nameSwap(Dog d) {
        // What kind of method is this?
        // what is the scope of d?
        
		d.setName("Boshy");
	}
    
    public static void nameSwap2(Dog d) {
        // What is the scope of localBoy?

        Dog localBoy = new Dog("Rex");
        d = localBoy;
    }
}
