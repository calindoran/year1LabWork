package workworkwork;
import java.util.Scanner;
public class diliverychardassinment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String pkg, service;
	    int ounces;
	    

	    System.out.println("Enter the package type (letter or box): ");
	    pkg = input.next();
	    System.out.println("Enter the type of delivery service (P - for Priority, S - for Standard): ");
	    service = input.next();
	    System.out.println("Please enter the weight of the package in ounces: ");
	    ounces = input.nextInt();

	    

	    
	    //System.out.println("The fee is "+ +"for a package with");
		System.out.println("Type: "+pkg);
		System.out.println("Service: "+service);
		System.out.println("Ounces:"+ounces);
	}

}
