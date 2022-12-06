package hw12Polymorphism;

public class Sister {
	public void sister() {
		System.out.println("This is void type method from sister class");
	}

	public int sister(int age1, int age2, int age3, String age4, int age5, int age6) {
		int multiply = age1*age2*age3*Integer.parseInt(age4)*age5*age6;
		System.out.println("Multiply all the age: " + multiply);
		return multiply;
	}

	public int sister(int age1, int age2, int age3 , String age4, int age5) {
		int multiply1 = age1*age2*age3*Integer.parseInt(age4) *age5;
		System.out.println("Multiply all the age: " + multiply1);
		return multiply1;
	}
	
	public int sister (int age1, int age2, String age3, int age4, int age5, int age6) {
		int multiply2 = age1*age2*Integer.parseInt(age3)*age4*age5;
		System.out.println("Multiply all the age :" + multiply2);
		return multiply2;
		
	}

	public static int sister (int age1,int age2, int age3,int age5, int age6) {
		int multiply3 =age1*age2*age3*age5*age6;
		System.out.println("Multiple all the age: " + multiply3);
		return multiply3;
	}


	public final int sister (int age1, int age2, int age3, int age5) {
		int multiply4 = age1* age2 *age3 *age5;
		System.out.println("Add all the age:" + multiply4);
		return multiply4;
	}

	/*
	 * When multiple method is created is created by the same name,
	 *  But parameter are different is called method overloading.
	 * Method overloading is also called static polymorphism.
	 * Method overloading happen during compile time.
	 * 
	 */
}