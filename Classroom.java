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
			System.out.println("male or female?");
			String gender = sc.next().toLowerCase();
			listGPA[i] = new Student(sName, sGPA, gender);
		}

		gpaAverage = 0;
		if(size == 0){
			System.out.println("There are no students in this class, so no" +
				" GPA can be calculated");
		}
		else{
			System.out.println("The average GPA is: " + getAvgGPA());
			System.out.println("Lets find the student with the highest" +
				" and lowest GPAs in this class.");
			Student aceStudent = new Student("Dummy Student",0.0, "Male");
			for(Student stud: listGPA){
				if(stud.compareTo(aceStudent) > 0){
					aceStudent = stud;
				}
			}

			Student dudStudent = new Student("uh", 0.0, "Female");
			for(Student dud: listGPA){
				if(dud.compareTo(dudStudent) < 0){
					dudStudent = dud;
				}
			}

			System.out.println("The student with the highest gpa is " + 
				aceStudent.getName() + " with a gpa of: " +
				aceStudent.getGPA());
			System.out.println("The student with the lowest gpa is " +
				dudStudent.getName() + " with a gpa of: " +
				dudStudent.getGPA());
		}
	}

	public int getClassSize(){
		return classSize;
	}

	public double getAvgGPA(){
		for(int i = 0; i < classSize; i++){
			gpaAverage += listGPA[i].getGPA();
		}
		return gpaAverage;
	}
}