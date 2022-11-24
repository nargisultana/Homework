package hw10Abstruction;

public abstract class EngineeringSchool {
	public abstract void medicalLab();
	// This is abstract method.

	public void computerLab() { // This is non-abstract method.
		System.out.println("This is a non abstract class");
	}
}