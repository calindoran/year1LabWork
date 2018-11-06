package Lab12;

public class Cat {

	String name;
	String colour;
	int numLives;
	
	public Cat(String catsName, String catsColour, int catsLives)
	{
		name = catsName;
		colour = catsColour;
		numLives = catsLives;
		
	}
	
	public void eat()
	{
		System.out.println(name + " is eating...");
	}
	public void prrrr()
	{
		System.out.println(name + " is purring...");
	}
	public void sleep()
	{
		System.out.println(name + " is sleeping...");
	}
	
}
