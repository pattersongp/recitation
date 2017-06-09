public class Car{



	String color;

	double endMiles;

	double startingMileage;

	public Car(String c, double startingMileage, double m){

		color = c;

		endMiles = m;

		this.startingMileage = startingMileage;

		cancatonate();



	}


        
	public Car(){



		color = "Black";

		endMiles = 1000;

		startingMileage = 50;

		cancatonate();

	}
        


	public Car(String c){

		color = c;

		endMiles = 1000;

		startingMileage = 40;

		cancatonate();

	}



	public Car(double num){

		color = "Black";

		endMiles = num;

		startingMileage = 50;

		cancatonate();

	}

	// method that will keep track of miles driven



	public void drive(double milesDriven){

		startingMileage = startingMileage + milesDriven;

	}



	String allTogether;
        
        // Setter
	private void cancatonate(){

		allTogether = color + " " + endMiles + " " + startingMileage;

	}


        // Getter method
	public String getConcatonate(){

		return allTogether;

	}



	public void print(){

		double milesLeft = endMiles - startingMileage;

		System.out.println("Miles Remaining (If negative your car needs service): " + milesLeft);

		System.out.print(" And the color of this car is " + color);

	}

}
