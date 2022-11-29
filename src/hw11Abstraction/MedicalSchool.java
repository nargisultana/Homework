package hw11Abstraction;

public abstract class MedicalSchool extends NursingSchool implements LawSchool {

	public MedicalSchool() { // Yes, A constructor can be created in abstract class.

	}

	public abstract void anatomyLab();

	public void bioChemistryLab() {
		System.out.println("This is non abstract method");

	}
	public static String nargis() {
	          return null ;
	}
	// default method can't be created in abstract class.
	
	/*
	 * public default void name () {
	 * 
	 * }
	 */
	
	/*
	 *  Extends and implements keyword are used for the inheritance in abstract class.
	 *  Abstract class can't inherit Interface by extends key word.
	 *  Abstract class can inherit other abstract class by extends key word.
	 *  Abstract class can inherit regular class by extends key word.
	 *  Abstract class can inherit one abstract class or One regular class.
	 *  Abstract class can inherit Interface by implements key word.
	 *  Abstract class can inherit multiple Interface by implements key word.
	 */
	
}