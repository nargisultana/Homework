package hw12Polymorphism;

public class Niece extends Sister {
	
	@Override 
	public void sister () {
		System.out.println("This is void type method from Sister class");
		
	}
	
	 @Override
	public int sister(int age1, int age2, int age3, String age4, int age5, int age6) {
		int add = age1 + age2 + age3 + Integer.parseInt(age4) + age5 + age6+ 66;
		System.out.println("Add all the age: " + add);
		return add;
	}
	
	@Override
	public int sister (int age1,int age2, int age3, String age4, int age5) {
		int substract = age1 / 2 - age2- age3- Integer.parseInt(age4) - age5 - 5;
		System.out.println("Substract all the age: " + substract);
		return substract;
	}
	@Override
	public int sister(int age1, int age2,String age3, int age4,int age5, int age6) {
		int multiply = age1 *age2*Integer.parseInt(age3) *age4*age5*age6 *4;
		System.out.println("multiply all the page: " + multiply);
		return multiply;
	}
	
	/*
	 * Multiple method by the same the name and parameter are also same but
	 * the logic are different is called method Overridden.
	 * During run time method overriding is happen.
	 * It also called dynamic polymorphism.
	 * Final method can not be overridden, since the method is final and used for the same class.
	 * Static method can't be overridden too, but static method can be implemented in 
	 * child class without @Override annotation.
	 */

}
