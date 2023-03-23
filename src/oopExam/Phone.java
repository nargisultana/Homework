package oopExam;

// Interface is blue print of java./n Interface class start with upper case.\t Interface class can extend interface class more than one.

   public interface Phone extends Pager, Wakitoki {

	
 //Interface class can not create variable and constructor.
	  
	
	public abstract void interfaceInfo();
	
	public abstract void message();


	public abstract void callInfo();
	
	
	public abstract void camera();
		

	/*
	 * Method can not be implemented inside interface only declared.
	 * so Battery is non abstract method from java 1.8 following this version.
	 * also wireless is non abstract method from java 1.8 version .
	 */
	 
	public static void battery() {
    System.out.println(" Battery is a method from java 1.8 version");		
		
	}
	
	public default void wireless() {
		System.out.println( " Wireless is a method from java 1.8 version");
	}
	
	}




