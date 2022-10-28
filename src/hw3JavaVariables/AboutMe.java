package hw3JavaVariables;

public class AboutMe {
//	variables Declared
	public String communityName;
//	variables initialized
	public String name = "Nargis Sultana.";
	public byte age = 75;
	public short myMonthlyIncome = 16577;
	public int myYearlyIncome = 198924789;
	public long myTotalAssest = 78914009632114677l;
	public float myHairLength = 1.667089f;
	public double myWeight = 4.669025377791465;
	public char gender = 'F';
	public boolean maritalStatus = true;

	public static void main(String[] args) {

		AboutMe aboutMe = new AboutMe();
		System.out.println("My name is " + aboutMe.name);
		System.out.println("My gender is " + aboutMe.gender + ". My Yearly income " + aboutMe.myYearlyIncome
				+ ". My marital status " + aboutMe.maritalStatus);

	}

}