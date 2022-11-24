package hw8Abstraction;

public abstract class MedicalSchool {
	public abstract void anatomyLab();

	public String anatomyLab; // This is default constructor.

	public MedicalSchool() { // Yes, This is a constructor.
		System.out.println("This Constructor is from Medical School");

	}

	public void bioChemistryLab() { // This is non abstract class.

		System.out.println("This method is from non abstract class");

	}
}