package hw11Abstraction;

public abstract class EngineeringSchool extends NYUniversity {
	public EngineeringSchool() {

	}

	public abstract void mechanicalLab();

	public void computerLab() { // This is non-abstract method.
		System.out.println("This is a non abstract method from abstract class EngineeringSchool");

	}
}