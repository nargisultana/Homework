package hw8Abstraction;

public class ColombiaUniversity {

	public String Chemistry; // This is default Constructor.
	public String Biology;

	// This is non abstract method.
	// This method is implemented.
	public void chemistry() {
		System.out.println("This is from non abstract method");
	}

	public void biology() {
		System.out.println("This is from biology class");

		// This is a regular class so we can not create an abstract method.
		//

	}
}