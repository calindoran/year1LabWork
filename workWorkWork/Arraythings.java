package workworkwork;
import java.util.Scanner;
public class Arraythings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		double[] salesArray = new double[10];
		
		//takes info from user
		for (int i = 0; i<salesArray.length; i++){
			
			System.out.println("Enter values: " +(i+1));
			salesArray[i] = in.nextInt();
		}
		//outputs the information
		for (int i = 0; i<salesArray.length; i++){
			
			System.out.println("Value "+(i+1)+ " is: " );
			System.out.println(salesArray[i]);
		}
	}
}
