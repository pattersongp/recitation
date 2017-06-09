/*
	Classroom class
*/

import java.util.Scanner;

public class Classroom{

	Student[] listGPA;
	int classSize;
	double gpaAverage;

	public Classroom(int size){
		classSize = size;
		listGPA = new Student[size];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < size; i++){
			System.out.println("Please enter the name of a student");
			String sName = sc.next();
			System.out.println("Please enter the student's GPA");
			double sGPA = sc.nextDouble();
			listGPA[i] = new Student(sName, sGPA);
		}

		gpaAverage = 0;
		if(size == 0){
			System.out.println("There are no students in this class, so no" +
				" GPA can be calculated");
		}
		else{
			getAvgGPA();
		}
	}

	public double getAvgGPA(){
		for(int i = 0; i < classSize; i++){
			gpaAverage += listGPA[i].getGPA();
		}
		return gpaAverage;
	}
}
