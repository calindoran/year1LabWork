package workworkwork;
import java.util.Scanner;
public class Tickets {

	public static void main(String[] args) {
		
		System.out.println("Where would you like to sit? 1 - Orchestra, 2 - Mezzanine, 3 - Balcony");
		
		Scanner in = new Scanner(System.in);
		int numberoftickets =0;
		int seatlocation = in.nextInt();;
		int price =0;
		
		switch (seatlocation)
		{
		case 1:
			System.out.println("The Orchestra, lovely choice.");
			price = 40;
			break;
		case 2:
			System.out.println("The Mezzanine, very nice.");
			price = 30;
			break;
		case 3:
			System.out.println("The Balcony, you'll be able to see everything.");
			price = 15;
			break;
		default:
			System.out.println("That is not a correct input, please try again.");
			price = 0;
		}
	
		System.out.println("The price of those seats are €"+price);
		
		System.out.println("How many ticks would you like?");
		
		price = numberoftickets*price;
	}

}


