package hw9Encapsulation;

public class Employee {
	private String Name;
	private int Age;
	private char Sex;
	private boolean UsCitizen;

	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int Age) {
		this.Age = Age;
	}

	public char getSex() {
		return Sex;
	}

	public void setSex(char Sex) {
		this.Sex = Sex;
	}

	public boolean getUsCitizen() {
		return UsCitizen;
	}

	public void setUsCitizen(boolean UsCitizen) {
		this.UsCitizen = UsCitizen;
	}

}