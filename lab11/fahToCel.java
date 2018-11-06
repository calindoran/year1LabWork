package Lab11;

public class fahToCel {
	
	private double celsius;
	
	public double getCelsius()
	{
		return celsius;
	}
	public double getFahrenheit()
	{
		return (celsius *9/5) + 32;
	}
	public void setFahrenheit(double fahr)
	{
		this.celsius = (fahr - 32) * 5 / 9;
	}

}
