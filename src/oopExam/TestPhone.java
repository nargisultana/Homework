package oopExam;

public class TestPhone {

	private static Iphone6 cn;

	public static void main(String[] args) {

		Iphone1 iphone1 = new Iphone1(780, "Mahamoda Khaton", 'f', false);
		System.out.println(" The Iphone price is :" + iphone1.getPrice() + "Iphone1info:" + iphone1.getInfo()
				+ "Iphone1user:" + iphone1.getUser() + " is Iphone1madein Usa:" + iphone1.getUsa());

		iphone1.interfaceInfo();
		iphone1.iphoneInfo();
		iphone1.isMadeinUsa();
		iphone1.applewatcchInfo();
		iphone1.callInfo();
		iphone1.classInfo();
		iphone1.getInfo();
		iphone1.getPrice();
		iphone1.wireless();

		AppleWatch appleWatch = new Iphone1();// Static method
		appleWatch.classInfo();
		appleWatch.applewatcchInfo();
		appleWatch.watch();
		appleWatch.getClass();

		System.out.println("**************************************************************************");

		Phone phone = new Iphone1();

		phone.interfaceInfo();
		phone.message();
		phone.callInfo();
		phone.camera();
		phone.pager();
		phone.wireless();
		phone.callInfo();
		phone.getClass();

		System.out.println("*****************************************************************************");

		Iphone6 iphone6 = new Iphone6();
		iphone6.compassinfo();
		iphone6.printInfo();
		iphone6.emailInfo();
		System.out.println(" This is return type method");
		iphone6.materials(500, 800); // Return type method
		iphone6.materials(500, 800, 200);// Return type method
		iphone6.materials(500, 300, 800);// Return void type method
		//iphone6.materials(400,200,600,100);//Static method
		iphone6.classInfo();
		iphone6.compassinfo();
		iphone6.photosInfo();
		iphone6.regularclassInfo();
		iphone6.wireless();
		iphone6.interfaceInfo();
		iphone6.message();
		iphone6.callInfo();
		iphone6.camera();
		iphone6.pager();
		iphone6.wireless();
		iphone6.getClass();
		
		// Here connfigure class instinciate
		ConfiguredIphone6 cn = new ConfiguredIphone6();
		System.out.println(" This is override method call here");
		cn.materials();
		cn.materials(400, 200);
		cn.materials(500,800,600);
		System.out.println(" This is overload method call here");
		cn.materials( 600, 300);
		cn.materials(200,400,"600");
		cn.materials();
		cn.materials(300,500,600);
		
	}
	
	//Iphone6 inherit Iphone5 is single inheritance.
	//Iphine6 inherit Iphone5,than Iphone5 inherit Iphone4 is called Mulilevel Inheritance.
	//Iphone2 inherit Iphone1,and Iphone3 also inherit Iphone1 is called
	// Hierarchical Inheritance.
	

}
