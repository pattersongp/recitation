public class Dog {

	//Truth: Everything in Java is passed by value.
	//Objects, however, are never passed at all. 

	//Truth: The values of variables are always primitives
	//	 or references, never objects.

	String name;

	public Dog(String initName){
		name = initName;
	}

	public void setName(String newName) {
		this.name = newName;
	}
	
	public String toString() {
		return this.name;
	}
}
