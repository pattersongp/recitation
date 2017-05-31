

public class CarTest{

	public static void main(String[] args){

		Car fastCar = new Car("blue", 1234.23, 10000);
		Car fastCar2 = new Car("red", 12312.343, 120000);
		Car fastCar3 = new Car(123123.232);

		System.out.println("-----------------------------------------------");
		fastCar.drive(3000);
		fastCar.print();
		fastCar.drive(10000);
		fastCar.print();
		System.out.println("allTogether: " + fastCar.getConcatonate());
		System.out.println("-----------------------------------------------");

		System.out.println("-----------------------------------------------");
		fastCar2.drive(3000);
		fastCar2.print();
		fastCar2.drive(10000);
		fastCar2.print();
		System.out.println("-----------------------------------------------");

		System.out.println("fastCar3 specs: " + fastCar3.getConcatonate());
	}
}