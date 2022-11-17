package hw8Abstraction;

public abstract class MedicalSchool {
	public abstract void anatomyLab();

	public String anatomyLab; // Yes, This is default constructor.

	public void bioChemistryLab() {

		System.out.println("This method is from non abstract class");

	}
}