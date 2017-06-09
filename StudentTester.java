public class StudentTester{
	
	public static void main(String[] args){
		
		Student joe = new Student("joe", 4.2);

		joe.addHours(8);
		joe.addHours(7);
		joe.addHours(5);
		joe.addHours(9);

		System.out.println("Expecting 7.25");
		System.out.println(joe.getAverageSleep());

		System.out.println("Expecting 4.2");
		System.out.println(joe.getGPA());

		joe.updateGPA(3.0);
		System.out.println("Expecting 3.0");
		System.out.println(joe.getGPA());
		
	}
}