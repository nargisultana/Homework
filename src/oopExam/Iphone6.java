package oopExam;

public class Iphone6 extends Iphone5 {
	private static final int Int = 0;

	public void compassinfo() {// Here compass information

	}

	public void printInfo() {// Here PrintInformation

	}

	// method overloading is inside same class have same method name but different
	// parameter is called method overloading.
	// one class have same method name with same parameters with different system or
	// logic its called override.

	public int materials(int rampprice, int cameraprice) {
		int total1 = rampprice + cameraprice;
		System.out.println("total will from iphone6 class" + total1);

		return total1;

	}

	public int materials(int rampprice, int cameraprice, String processorprice) {
		int total2 = rampprice + cameraprice + Integer.parseInt(processorprice);
		System.out.println(" this area everything totalprice" + total2);

		return total2;

	}

	public static int materials(int rampprice, int cameraprice, String processorprice, int watchprice) {
		int total3 = rampprice + cameraprice + Integer.parseInt(processorprice) + watchprice;
		System.out.println(" Here all price will be total" + total3);

		return total3;

	}

	public final int materials(Integer rampprice, int cameraprice, String procerrrorprice, int phoneprice) {
		int total4 = rampprice + cameraprice + Integer.parseInt(procerrrorprice) + phoneprice;
		System.out.println("Here will be total price" + total4);
		return total4;

	}

	public void materials() {
		System.out.println(" This is void type no argument method");

	}

	public int materials(int ramprice, int cameraprice, int phoneprice) {
		int total6 = ramprice + cameraprice + phoneprice;
		System.out.println(" This will be total" + total6);
		return total6;

	}


		
	

	/*
	 * First write about method over loading and method overriding with multiple
	 * line comments here Now, Think about Iphone6. It also has 6 methods with the
	 * same name as materials(). For example -- They are return type parameterized
	 * method (int ramPrice, int cameraPrice), another one return type parameterized
	 * method (int ramPrice, int cameraPrice, String ProcessorPrice), etc. Can you
	 * use the void, parameterized(return type), final (return type), or static
	 * (return type) method here as the same method name? if yes, create them and
	 * take more int variable of your own. What kind of concept you can use?
	 * [points: 70]. Instantiate the class in TestPhone and initialize those
	 * methods. [points: 70]. Now think about a regular class Name ConfiguredIphone6
	 * which extends Iphone6. Override those methods of Iphone6 and change the logic
	 * at your own to show the changes. [points: 50]. Show the output in TestPhone
	 * (how many methods is possible to extends). [points: 50].
	 * 
	 * Please make sure you organize the code in every class
	 * 
	 * Paste the github link for the package below
	 * 
	 */
}