package Lab12; //This is the method

public class Thermometer
{ // begin Thermometer
	private double celsius;	// more about private later
							// celsius is accessible to all methods in this class
	
	public Thermometer()			// constructor method #1
	{
		setCelsius(0);		
	}
		
	public Thermometer(double cel)	// constructor method #2 {creates new things/objects}
	{
		setCelsius(cel);
	}

	public double getCelsius()
	{
		return celsius;
	}

	public double getFahrenheit()
	{
		return (celsius *9/5) + 32;
	}
	public void setCelsius(double cel)
	{
		celsius = cel;		
	}
	public void setFahrenheit(double fahr)
	{
		this.celsius = (fahr - 32) * 5 / 9;
	}
	
} // end class Thermometer
