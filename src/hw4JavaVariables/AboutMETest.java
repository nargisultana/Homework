package hw4JavaVariables;

public class AboutMETest {
	public static void main(String[] args) {
		AboutMe aboutMe1 = new AboutMe();

		// constructor is initialized here
		// variables are initialized

		aboutMe1.name = " Nargis Sultana";
		aboutMe1.age = 66;
		aboutMe1.myMonthlySalary = 3899;
		aboutMe1.myYearlySalary = 130827784;
		aboutMe1.myWeight = 1.567889f;
		aboutMe1.myHeight = 3.600678532567;
		aboutMe1.myApartmentRent = 77549961200675566l;
		aboutMe1.sex = 'F';
		aboutMe1.myParmanentResidence = true;

		aboutMe1.aboutMe();

		System.out.println("\n----------------------------------------------\n");
		AboutMe aboutMeAlex = new AboutMe();
		// Variables are initialized
		aboutMeAlex.name = "Alex";
		aboutMeAlex.age = 63;
		aboutMeAlex.myMonthlySalary = 3500;
		aboutMeAlex.myYearlySalary = 140778467;
		aboutMeAlex.myWeight = 1.676234f;
		aboutMeAlex.myHeight = 3.75366446643663;
		aboutMeAlex.myApartmentRent = 8545533561300956654l;
		aboutMeAlex.sex = 'M';
		aboutMeAlex.myParmanentResidence = true;

		aboutMeAlex.aboutMe();

	}

}
