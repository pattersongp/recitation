import java.util.*;

public class Student implements Comparable<Student>{
	/*
		This class models a student with a GPA and who sleeps.
		Written by Graham Patteson
	*/

		private String name;
		private double gpa;
		private String gender;
		private ArrayList<Integer> hours_of_sleep;

	public Student(String name, double initGPA, String gender){
		this.name = name;
		gpa = initGPA;
		this.gender = gender;
		hours_of_sleep = new ArrayList<Integer>();
	}

	public double getGPA(){
		return gpa;
	}

	public String getName(){
		return name;
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

	
	@Override
	// compareTo method for the Comparable interface
	public int compareTo(Student stud){
		Student doe = stud;
		if(getGPA()<doe.getGPA()){
			return -1;
		}
		if(getGPA()>doe.getGPA()){
			return 1;
		}
		return 0;

	}

}