package Lab13;

public class Sphere extends Circle {
	
	public Sphere(double radius)
	{	
		super(radius);
	}
	
	@Override
	public double area(){
		
		return 4*Math.PI*Math.pow(getRadius(), 2);
		
	}
		
	@Override
	public String toString(){
		
		return (super.toString()+" Area: "+area()+" Volume: "+volume());
	}

	public double volume(){
		
		return 4.0/3.0*Math.PI*Math.pow(getRadius(), 3);
	}
	}
