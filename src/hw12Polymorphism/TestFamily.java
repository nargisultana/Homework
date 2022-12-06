package hw12Polymorphism;

public class TestFamily {
	
	public static void main(String[] args) {
		
		System.out.println("\n---------------------------Sister class--------------\n");
		
		Sister sister =new Sister();
		//Method overloaded are called here from sister class.
		sister.sister();
		sister.sister(22,16,27, "33", 55, 79);
		sister.sister(54,44,23,"9", 10);
		sister.sister(12, 43,32,"22",56,5);
		Sister.sister(50, 13, 33,28, 72);
		sister.sister(5,2,6,33);
		
		System.out.println("\n-------------------------Niece class------------------\n");
		
		Niece niece =new Niece();
		//Method overridden are called here from Niece class
		niece.sister();
		niece.sister(12, 55,98, "65" , 12, 89);
		niece.sister(32, 76, 17, "9" ,85);
		niece.sister (62, 7, "3" ,25, 88, 92);
		
	}
}
