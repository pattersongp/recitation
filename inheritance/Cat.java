/*
	This class models a Dog which is a subclass
	of the Animal class.
*/
public class Cat extends Animal{

	public Cat(String initName, String initSound){
		super(initName, initSound);
	}

	public void eat(){
		System.out.println("Nah I only chill...");
	}

}