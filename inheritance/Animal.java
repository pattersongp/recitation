/*
	This class models an Animal.
*/
public class Animal {
	
	private String sound;
	private String name;

	public Animal(String initName, String initSound){
		name = initName;
		sound = initSound;
	}

	public void makeSound(){
		System.out.println(this.sound+"!");
	}

	public void eat(){
		System.out.println("mmmmmmmmmmm!");
	}
	public String toString(){
		return this.name;
	}
	
}