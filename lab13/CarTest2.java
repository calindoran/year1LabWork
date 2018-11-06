package Lab13;

public class CarTest2 {
	
	public static void main(String args[])
	{
		
		Car car2 = new Car();
		
		car2.setWheels(4);
		car2.setPass(7);
		car2.setType("people carrier");

		System.out.println("Car2: ");
		System.out.print("Wheels: " + car2.getWheels());
		System.out.print(" Passengers: " + car2.getPass());
		System.out.println(" Type: " + car2.getType());
	}
}