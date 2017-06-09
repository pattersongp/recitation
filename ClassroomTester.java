/*
	Tester class for Classroom
*/
import java.util.Scanner;
public class ClassroomTester{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("What is the size of your class?");
		int size = sc.nextInt();
		Classroom newClass = new Classroom(size);
	}
}