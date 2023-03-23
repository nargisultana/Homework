package oopExam;
// Regular class can extend abstract class one time.

//Class is a blueprint from which individual objects are created.
//Contains only non abstract methods, doesn't contain abstract methods.
// Methods only implemented but can't be declared.
//implements and extends keyword is used for inheritance

//But Regular class can implement interface class 

public class Iphone1 extends AppleWatch implements Phone {
	
	
	
	public String name; // This is public variable for super keyword method in Iphone2 class.

	
	
	private int price;
	private String info;
	private char user;
	private boolean madeinUsa;

	public Iphone1() {// This is Default constructor
	}

	public Iphone1(int price, String info, char user, boolean madeinUsa) {
		this.price = price;
		this.info = info;
		this.user = user;
		this.madeinUsa = madeinUsa;
	}

	public void iphoneInfo() {
		System.out.println(" This is Iphoneinformation");

	}

	public int getPrice() {
		return price;
	}

	public String getInfo() {
		return info;
	}

	public char getUser() {
		return user;
	}

	public boolean isMadeinUsa() {
		return madeinUsa;
	}

	@Override
	public void interfaceInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void message() {
		// TODO Auto-generated method stub

	}

	@Override
	public void camera() {
		// TODO Auto-generated method stub

	}

	@Override
	public void wireless() {
		// TODO Auto-generated method stub

	}

	@Override
	public void pager() {
		// TODO Auto-generated method stub

	}

	@Override
	public void watch() {
		// TODO Auto-generated method stub

	}

	@Override
	public void callInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void classInfo() {
		// TODO Auto-generated method stub

	}

	public String getUsa() {
		// TODO Auto-generated method stub
		return null;
	}

}