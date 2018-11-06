package Lab11;

public class TestMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Intro Text = new Intro("Introduction to Java methods");
		Thermometer therm = new Thermometer();
		double temp = therm.getCelsius();
		
		System.out.println(Text.toString());
		System.out.println(temp + " Fahrenheit = " + therm.getCelsius());
	}
}