package workworkwork;
import java.util.Scanner;
public class DeliveryCharge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		String [] packageT = {"letter", "box"};
		String [] serviceT = {"priority", "standard"};
		int [] packageW = {1, 2, 3, 4, 5, 6, 7, 8};
		
		String packagetype;
		String servicetype;
		int packageweight;
		double totalcost;
		
		System.out.println("Enter package type (letter or box): ");//the user enters latter or box
		packagetype = in.nextLine();
		System.out.println("Enter type of service (priority, standard): ");//the user enters priority or standard
		servicetype = in.nextLine();
		
		for (int i = 0; i<packageW.length; i++){
			
			System.out.println("Enter box weight in pounds (number): "+(i*1.25));// where the user is to enter the weight
			packageW[i] = in.nextInt();
			
			System.out.println("The fee is "+packageW+"for a package with"); // where all the information is printed out
			System.out.println("Type: "+packagetype);
			System.out.println("Service: "+servicetype);
		}
		
		/*Scanner input = new Scanner(System.in);
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
		System.out.println("Ounces:"+ounces);*/

		
		/*for (int i = 0; i<packageT.length; i++){
			
			System.out.println("Enter package type (letter or box): ");
			packageT[i] = in.nextLine();
		}*/
		/*for (int i = 0; i<serviceT.length; i++){
			
			System.out.println("Enter type of service (priority, standard): ");
			serviceT[i] = in.nextLine();
		}*/
		
		//System.out.println("Ounces:"+packageweight);
	
}
}
