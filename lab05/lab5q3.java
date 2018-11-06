package Lab5;
import java.util.Scanner;
public class lab5q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int input;
		
		System.out.println("Enter a number to check if it is odd or even: ");
		input = in.nextInt();
		
		if (input % 2 == 0)
			System.out.println("You entered an even number.");
		else
			System.out.println("You entered an odd number.");
	}

}
