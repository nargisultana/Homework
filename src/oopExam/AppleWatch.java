package oopExam;
/* Abstract class can extend Regular class by extend word. 
*Abstract Class contains both abstract and non abstract methods
*Abstract Class names starts with UpperCase 
*They follow Camel case or Snake case pattern.
*CamelCase or Snake_case feature considered from second word, not from first word
*We can inherit Abstract class to Abstract class by extend keyword.
*Also this class can inherit interface class by implement word
*/

public abstract class AppleWatch extends AppleWatchSeries5 implements Watch, DigitalWatch {

	// we can variable initialize in abstract class.yes we declared constructor. we
	// can not instantiate abstract class.

	public int Applewatch = 700;

	public AppleWatch() {

		System.out.println(" This constructor is from abstract class");
	}

	public abstract void classInfo(); // This is abstract method in abstract class

	public void applewatcchInfo() {
		System.out.println(" This is none abstract method in abstract class");

	}
	

}

