package hw4JavaVariables;

public class AboutMe {
//variable Declared.

	public String name;
	public byte age;
	public short myMonthlySalary;
	public int myYearlySalary;
	public float myWeight;
	public double myHeight;
	public long myApartmentRent;
	public char sex;
	public boolean myParmanentResidence;

//	This is constructor
//	Here constructor is Declared
	public AboutMe() {
		System.out.println("This is all about me; \n");
	}
//	This is method
//	Here method is implemented

	public void aboutMe() {

		System.out.println("My Name: " + name + "\nMy Age:" + age + "\nMy Monthly Salary: " + myMonthlySalary
				+ "\nYearly Salary: " + myYearlySalary + "\nMy Weight: " + myWeight + "\nMy Height: " + myHeight
				+ "\nMy Apartment Rent: " + myApartmentRent + "\nMy Gender:" + sex + "/nAm I Parmanent Residence? Ans: "
				+ myParmanentResidence);

	}

}