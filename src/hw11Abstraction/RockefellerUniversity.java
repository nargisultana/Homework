package hw11Abstraction;

public class RockefellerUniversity extends EngineeringSchool implements AeronauticalSchool {

	public void maths() {
		System.out.println("This is from non-abstract method");
// This is non-abstract method.
	}

	@Override
	public void aeronauticalInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void mechanicalLab() {
		// TODO Auto-generated method stub

	}
}