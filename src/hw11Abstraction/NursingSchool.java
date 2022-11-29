package hw11Abstraction;

public abstract class NursingSchool extends RockefellerUniversity {

	public NursingSchool() { // Constructor can be created in abstract class.

	}

	public void hygiene() {

		System.out.println("This is non abstract method from abstract class NursingSchool");

	}

	public abstract void caring();

}