package oopExam;

public class ConfiguredIphone6 extends Iphone6 {
	
	
	public static ConfiguredIphone6 cn;

	// Return type parameterize method.
	@Override
	public int materials(int rampprice, int cameraprice) {
		int total1 =  rampprice +  cameraprice/4;
		System.out.println("total will from iphone6 class" + total1);
		
		return total1;}
	
	@Override
	public void materials() { // void type no argument method.
		System.out.println(" This is void type no argument method");
		
	}
	@Override // void type parameterize method
	public int materials( int ramprice,int cameraprice, int phoneprice) {
		int total6 =  ramprice/2 +  cameraprice +  phoneprice;
		System.out.println( " This will be total" + total6);
		return total6;
		
	}
	/*
	 * will not work in this return type parameterize method because of Static method.
		@Override 
	  public static int iphone6(int rampprice,int cameraprice,String processorprice, int watchprice) {
		int total3 = Int rampprice + int cameraprice + Integer.parseInt(processorprice)+ int watchprice;
		System.out.println( " Here all price will be total" + total3);
		 
		return total3;
				
				
	}
   //@override will not work in this case because method is final
	public final int iphone6(integer rampprice,int cameraprice,String procerrrorprice,int phoneprice) {
		int total4 = int rampprice +int cameraprice +Integer. parseInt(procerrrorprice)  +int phoneprice;
		System.out.println("Here will be total price" + total4);
		return total4;
	}
	*/
	
	public void configuredIphone6() { //This is regular method
		
	
		

	}

	
	}