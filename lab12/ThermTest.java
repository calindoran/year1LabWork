package Lab12; //This is the driver class

public class ThermTest
{ // begin class ThermTest
	public static void main(String args[]) 
	{ // being main method

		Thermometer thermA = new Thermometer();		// Create an instance of our Thermometer class
		Thermometer thermB = new Thermometer(10.0);
		
		
		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );
		thermA.setCelsius(20.0);
		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );
		
		//System.out.println("Temp. of Thermometer B is " + thermB.getCelsius() );
		//thermB.setCelsius(10.0);
		System.out.println("Temp. of Thermometer B is " + thermB.getCelsius() );
		
		double tempB = thermB.getCelsius();
		
		tempB = thermB.getFahrenheit();	//Should be 50F if set to 10C
		System.out.println("Temp. of Thermometer B in Fahrenheit is "+ tempB); //Set Fahrenheit
		thermB.setFahrenheit(100);	//37.77 in Celsius
		tempB = thermB.getCelsius();
		System.out.println("Temp. of Thermometer B is " + tempB);

	} // end main
} // end class ThermTest
