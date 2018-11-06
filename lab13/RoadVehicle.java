package Lab13;

public class RoadVehicle
{
	private int wheels;	    //How many wheels it has
	private int passengers; //How many passengers it can carry

	public RoadVehicle() {
 		this(0,0);	
	}

	public RoadVehicle(int w, int p) { 
		setWheels(w);
		setPass(p);
	}

	public int getPass() {
		return passengers;
	}

	public int getWheels() {
		return wheels;
	}

	public void setPass(int num) {
		passengers = num;
	}

	public void setWheels(int num) {
		wheels = num;
	}
}
