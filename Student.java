import java.util.*;

public class Student{
	/*
		This class models a student with a GPA and who sleeps.
		Written by Graham Patteson
	*/

		private String name;
		private double gpa;
		private ArrayList<Integer> hours_of_sleep;

	public Student(String name, double initGPA){
		name = name;
		gpa = initGPA;
		hours_of_sleep = new ArrayList<Integer>();
	}

	public double getGPA(){
		return gpa;
	}

	public void updateGPA(double update){
		this.gpa = update;
	}

	public void addHours(int hours){
		hours_of_sleep.add(hours);
	}

	public double getAverageSleep(){
		return this.makeAverage();
	}

	private double makeAverage() {
		int total = 0;
		int counter = 0;

		for(int entry: hours_of_sleep){
			total += entry;
			counter++;
		}

		// return (double) total/counter;
		return total/counter;
	}

}