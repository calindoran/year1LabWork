package Lab12;

public class DogTest { // begin DogTest

	public static void main(String args[]) 
	{ // being main method

		Dog myDog = new Dog("Sandy", "Brown", "Cockapoo");		// Create an instance of our Dog class
		Dog myOtherDog = new Dog("Butch", "Black", "Pitbull");	// Create an instance of our Dog class
		Cat myCat = new Cat("Lucy", "Black", 9);		// Create an instance of our Cat class
		Cow myCow = new Cow("Daisy", "Black and White", "Friesian");		// Create an instance of our Cat class

		System.out.println("My dog's name is " + myDog.name);
		System.out.println("My dog's colour is " + myDog.colour );
		System.out.println("My dog's breed is " + myDog.breed );
		myDog.eat();
		myDog.bark();
		myDog.sleep();

		System.out.println();
		System.out.println("My other dog's name is " + myOtherDog.name);
		System.out.println("My other dog's colour is " + myOtherDog.colour );
		System.out.println("My other dog's breed is " + myOtherDog.breed );
		myOtherDog.eat();
		myOtherDog.bark();
		myOtherDog.sleep();

		System.out.println();
		System.out.println("My Cat's name is " + myCat.name);
		System.out.println("My Cat's colour is " + myCat.colour );
		System.out.println("My Cat has " + myCat.numLives + " lives.");
		myCat.eat();
		myCat.prrrr();
		myCat.sleep();

		System.out.println();
		System.out.println("My Cow's name is " + myCow.name);
		System.out.println("My Cow's colour is " + myCow.colour );
		System.out.println("My Cow's breed is " + myCow.breed);
		myCow.eat();
		myCow.defecate();
		myCow.moo();
		myCow.sleep();

	} // end main
} // end class DogTest
