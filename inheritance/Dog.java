/*
	This class models a Dog which is a subclass
	of the Animal class.
*/
public class Dog extends Animal{

	String name;
	String sound;

	public Dog(String initName, String initSound){
		super(initName, initSound);
	}

	public void eat(){
		System.out.println("Slobbber--Slobber!!");
	}

	public void digHole(){
		System.out.println("Digs a hole!");
	}

}
