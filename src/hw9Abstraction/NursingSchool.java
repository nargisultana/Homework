package hw9Abstraction;

public abstract class NursingSchool {
	public NursingSchool() {
	}// Constructor can be created in the abstract class.

	public void hygine() {
		System.out.println("This is non abstract method from abstract class NursingSchool");
	}
	// This is abstract method.

	public abstract void caring();

}