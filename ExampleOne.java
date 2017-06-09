public class ExampleOne{

	//Truth: Everything in Java is passed by value.
	//Objects, however, are never passed at all. 

	//Truth: The values of variables are always primitives
	//	 or references, never objects.
	public static void main(String[] args){
		
		int x = 1;
		int y = 1;

		passing(x, y);

		System.out.println("x: " + x);
		System.out.println("y: " + y);
	}

	public static void passing(int x, int y) {
		// What is the scope of x_local and y_local?
		int x_local = x;
		int y_local = y;

		x_local++;
		y_local++;
	}	




}
