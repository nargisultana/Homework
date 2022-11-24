package hw9Abstraction;

public class ColombiaUniversity {

	public ColombiaUniversity () {
		
	}
	
	// abstract method can not be created in the class
	
	/*
	 * public abstract void chemistry();
	 */
	
	

	public void biology() {
		System.out.println("This is non abstract method from ColumbiaUniversity Class");

		// This is a regular class so we can not create an abstract method.
		/*
		 * Extends keyword is used for the inheritance in regular class.
		 * Regular class can't inherit Interface by extends key word.
		 * Regular class can inherit other Regular class by extends key word.
		 * Regular class can inherit abstract class by extends key word.
		 * Regular class can inherit one abstract class or one regular class.
		 */
	 
	}
}