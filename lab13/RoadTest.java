package Lab13;

public class RoadTest {
	
	public static void main(String args[])
	{
		Car car1 = new Car();
		Car car2 = new Car();
		Hgv truck1 = new Hgv();
		Hgv truck2 = new Hgv();
		
		car1.setWheels(4);
		car1.setPass(6);
		car1.setType("saloon");

		System.out.println("Car1: ");
		System.out.print("Wheels: " + car1.getWheels());
		System.out.print(" Passengers: " + car1.getPass());
		System.out.println(" Type: " + car1.getType());
		
		car2.setWheels(4);
		car2.setPass(7);
		car2.setType("people carrier");

		System.out.println("Car2: ");
		System.out.print("Wheels: " + car2.getWheels());
		System.out.print(" Passengers: " + car2.getPass());
		System.out.println(" Type: " + car2.getType());
		
		truck1.setWheels(18);
		truck1.setPass(2);
		truck1.setCargo(3200);

		System.out.println("Truck1: ");
		System.out.print("Wheels: " + truck1.getWheels());
		System.out.print(" Passengers: " + truck1.getPass());
		System.out.println(" Cargo: " + truck1.getCargo());
		
		truck2.setWheels(6);
		truck2.setPass(3);
		truck2.setCargo(1200);

		System.out.println("Truck2: ");
		System.out.print("Wheels: " + truck2.getWheels());
		System.out.print(" Passengers: " + truck2.getPass());
		System.out.println(" Cargo: " + truck2.getCargo());
	}
}