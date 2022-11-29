package hw11Abstraction;

public class TestInstitute {
	
	public static void main(String[] args) {
		System.out.println("\n------------------------------------------\n");
		ColumbiaUniversity columbiaUniversity = new ColumbiaUniversity() ;
		columbiaUniversity.biology();
		ColumbiaUniversity.nargis(); //This is static method from ColumbiaUniversity called by the class name.
		columbiaUniversity.lawInfo();
		columbiaUniversity.anatomyLab();
		columbiaUniversity.caring();
		columbiaUniversity.commonRoom();
		columbiaUniversity.laboratory();
		columbiaUniversity.languageClub();
		columbiaUniversity.emergencyRoom();
		columbiaUniversity.surgeryRoom();
		columbiaUniversity.cafeteria();
		columbiaUniversity.vocationalInfo();
		columbiaUniversity.classSize();
		columbiaUniversity.playGround();
		columbiaUniversity.teacher();
		columbiaUniversity.bioChemistryLab();
		columbiaUniversity.gymnasium();
		columbiaUniversity.vocationalInfo();
		
		System.out.println("\n-----------------------------------------------\n");
		University university = new ColumbiaUniversity();
		university.classSize();
		university.playGround();
		university.teacher();
		university.gymnasium();
		University.library(); //Here static method of University Interface called by itself.
		university.commonRoom();
		university.laboratory();
		university.languageClub();
		university.dorm();
		university.emergencyRoom();
		university.surgeryRoom();
		university.cafeteria();
		university.morgue();
		
		
		System.out.println("n-----------------------------------------University-------------\n");
		MedicalSchool medicalSchool =new ColumbiaUniversity();
		medicalSchool.anatomyLab();
		medicalSchool.bioChemistryLab();
		MedicalSchool.nargis(); //Here static method of MedficalSchool class.
		medicalSchool.hygiene();
		medicalSchool.lawInfo();
		medicalSchool.caring();
		medicalSchool.lawInfo();
		medicalSchool.aeronauticalInfo();
		medicalSchool.anthropology();
		medicalSchool.maths();
		medicalSchool.mechanicalLab();
		medicalSchool.computerLab();
				
	}

}
