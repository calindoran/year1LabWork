package lab04;
import java.util.Scanner;

public class lab4aq2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		System.out.println("Input kilometers: ");
		int km = in.nextInt();
		System.out.println("Input time spent traveling: ");
		int time = in.nextInt();
		System.out.println("Input amount of litres of fuel used: ");
		int fuel = in.nextInt();
		
		int sum = km + time + fuel;
		int average = sum / 3;
		System.out.println("The average kilometers per hour: "+average);
		System.out.println("The number of kilometers per litre: "+sum);
	}
	}

