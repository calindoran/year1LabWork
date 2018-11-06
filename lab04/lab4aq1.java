package lab04;
import java.util.Scanner;

public class lab4aq1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		for(int x=0; x<=9; x++){	
			System.out.println("Input inches: ");

			int inches = in.nextInt();
			double centi = inches*2.54;
			System.out.println("Inches to centimeters is: "+centi);
		
	}
}
}
