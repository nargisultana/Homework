package oopExam;

public class Iphone2 extends Iphone1 {

	public char userofIhone2 = 'F';

	public Iphone2() {
		super();
		super.iphoneInfo();
		super.name = " Mahamoda Khaton";

		System.out.println(" This is default constructor");

	}

	public Iphone2(char userofIhone2) { // Parameterize Constructor
		this.userofIhone2 = userofIhone2;
	}

	public void regularclassInfo() {
		System.out.println(" Regular class can extend Abstract class"
				+ " and Abstract class can extend regular class /n Also regular class and Abstract class "
				+ " can implement interface class + In Regular class method implemented not declared "
				+ " In interface class two type method Default and Static" + " Regular class instinciated");
	}

	public void youtubeInfo() {
		System.out.println("If you open youtube,you can see advertise about Enthrall It course");

	}

	public void dropboxInfo() {
		System.out.println(" This is dropbox info");

	}

	public void iphone2Info() { // This is void type method

	}

	public void iphone2Info(int a, String name) {// This is parameterize method

	}

}