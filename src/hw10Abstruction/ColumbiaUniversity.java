package hw10Abstruction;

public class ColumbiaUniversity extends MedicalSchool implements University, VocationalSchool {

	public ColumbiaUniversity () {
		
	}
	
	// abstract method can not be created in the class
	
	/*
	 * public abstract void chemistry();
	 */
	
	

	public void biology() {
		System.out.println("This is non abstract method from ColumbiaUniversity Class");

		// This is a regular class so we can not create an abstract method.
		/*
		 * Extends and implements keyword are used for the inheritance in regular class.
		 * Regular class can't inherit Interface by extends key word.
		 * Regular class can inherit other Regular class by extends key word.
		 * Regular class can inherit abstract class by extends key word.
		 * Regular class can inherit one abstract class or one regular class.
		 * Regular class can inherit multiple Interface by implements key word.
		 * One Inheritance is possible.
		 */
	 
	}

	@Override
	public void commonRoom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void laboratory() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void languageClub() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void emergencyRoom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void surgeryRoom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cafeteria() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void lawInfo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void vocationalInfo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void classSize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playGround() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void teacher() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void anatomylab() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void caring() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hygine() {
		// TODO Auto-generated method stub
		
	}
}