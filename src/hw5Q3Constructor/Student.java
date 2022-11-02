package hw5Q3Constructor;

public class Student {

	public String stName;
	public int stID;
	public char stSex;
	public float stGrade;
	public boolean stProgrammar;
	// default constructor declared

	public Student() {
		System.out.println("This is default constructor is from student class");

	}

	// parameterized constructor declared
	public Student(String stName, int stID, char stSex, float stGrade, boolean stProgrammar) {

		this.stName = stName;
		this.stID = stID;
		this.stSex = stSex;
		this.stGrade = stGrade;
		this.stProgrammar = stProgrammar;

		System.out.println(" This Student Name is: " + stName + " Student id: " + stID + " Student Sex: " + stSex
				+ " Student Grade:" + stGrade + " Java Programmer ? Ans : " + stProgrammar);

	}

}
