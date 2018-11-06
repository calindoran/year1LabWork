package Lab12;

public class Dog { // begin Dog
	
	String name;	// more about private later
	String colour;	// name is accessible to all methods in this class
	String breed;
		
	public Dog(String dogsName, String dogsColour, String dogsBreed)			// constructor method #1
	{
		name = dogsName;		
		colour = dogsColour;
		breed = dogsBreed;
	}
	
	public void bark()
	{
		System.out.println(name + " says Woof! Woof!");
	}
	public void eat()
	{
		System.out.println(name + " is eating...");
	}
	public void sleep()
	{
		System.out.println(name + " is sleeping...");
	}
		
} // end class Dog
