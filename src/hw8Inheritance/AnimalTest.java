package hw8Inheritance;

public class AnimalTest {
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.animalInfo(); // Animal is the Parent Class of Mammal, Reptile & Birds
		System.out.println("--------------------------------------------");

		Mammal mammal = new Mammal();
		mammal.mammalInfo();
		mammal.animalInfo(); // Mammal is child class of Animal class
		System.out.println("-----------------------------------------------");

		Reptile reptile = new Reptile();
		reptile.reptileInfo();
		reptile.animalInfo();
		/*
		 * A derived class "Reptile", inherits the properties from a single parent class
		 * (Animal). That is a example of single inheritance.
		 */
		System.out.println("-------------------------------------------------");
		Birds birds = new Birds();
		birds.birdsInfo();
		birds.animalInfo();
		/*
		 * There are several derived class is created from a single parent class.
		 * Mammal,Reptile & Birds extends to one base class Animal. It is a example of
		 * Hierarchical Inheritance.
		 */
		System.out.println("----------------------------------------------------");
		Dog dog = new Dog();
		dog.dogInfo();
		dog.mammalInfo();
		dog.animalInfo();
		System.out.println("-----------------------------------------------------");
		Snake snake = new Snake();
		snake.snakeInfo();
		snake.reptileInfo();
		snake.animalInfo();
		System.out.println("------------------------------------------------------");
		Robin robin = new Robin();
		robin.robinInfo();
		robin.birdsInfo();
		robin.animalInfo();
		System.out.println("-------------------------------------------------------");
		BullDog bullDog = new BullDog();
		bullDog.bulldogInfo();
		bullDog.dogInfo();
		bullDog.mammalInfo();
		bullDog.animalInfo();
		System.out.println("-------------------------------------------------------");
		Cobra cobra = new Cobra();
		/*
		 * Cobra extends Snake, Snake extends Reptile extends Animal. A derived class is
		 * created from another derived class. This is Multilevel inheritance.
		 */
		cobra.cobraInfo();
		cobra.snakeInfo();
		cobra.reptileInfo();
		cobra.animalInfo();
	}

}
