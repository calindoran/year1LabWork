package Lab12;

public class Cow {

	String name;
	String colour;
	String breed;
	
	public Cow(String cowsName, String cowsColour, String cowsBreed){
		
		name = cowsName;
		colour = cowsColour;
		breed = cowsBreed;
	}
	
	public void defecate()
	{
		System.out.println(name + " is sitting on my house...");
	}
	public void eat()
	{
		System.out.println(name + " is eating...");
	}
	public void moo()
	{
		System.out.println(name + " is mooing...");
	}
	public void sleep()
	{
		System.out.println(name + " is sleeping...");
	}
}
