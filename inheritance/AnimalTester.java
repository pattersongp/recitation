import java.util.*;

public class AnimalTester {

	public static void main(String[] args){

		// Our parent class Animal, doing animal things
		// Animal myAnimal = new Animal(args[0], args[1]);
		// myAnimal.makeSound();
		// myAnimal.eat();

		// our dog doing everything as expected
		// Dog clifton = new Dog(args[0], args[1]);
		// clifton.digHole();
		// clifton.eat();

		// What about this? This is different
		//Animal clifton = new Dog(args[0], args[1]);

		// // Doesn't work? Might work?
		// // We cannot call functions of a subclass from an
		// // object reference of its parenting class
		// clifton.digHole();

		// // We can instead cast it to a Dog for the call
		// ((Dog)clifton).digHole();

		// // Can we do this with other subclasses of the
		// // same parenting class?
		// ((Cat)clifton).digHole();
		// // Cats don't dig holes!

		Animal nino = new Cat("nino", "purrrr");
		Animal clifton = new Dog("Cliffy", "bark!");
		Animal doggo = new Dog("doggo", "Doggo barking!");

		// Who cares?
		// We can build a data structure with 'different'
		// objects, then do cool stuff with them

		ArrayList<Animal> onlyFriends = new ArrayList<Animal>();
		onlyFriends.add(clifton);
		onlyFriends.add(nino);
		onlyFriends.add(doggo);

		for (Animal friend: onlyFriends){
			System.out.println(friend);
			friend.makeSound();
			friend.eat();
			System.out.println();
		}



	}
}