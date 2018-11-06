package workworkwork;
import java.util.Scanner;
public class Switchmonth {

	public static void main(String[] args) {
		
		//Glowstone open minecraft server code
		
		System.out.println("Enter the month (with caps)... ");
		
		Scanner keyboard = new Scanner(System.in);
		String month = keyboard.next();

		switch (month)
		{
		case "January":
			System.out.println("The number of the month is 1");
			break;
		case "February":
			System.out.println("The number of the month is 2");
			break;
		case "March":
			System.out.println("The number of the month is 3");
			break;
		case "April":
			System.out.println("The number of the month is 4");
			break;
		case "May":
			System.out.println("The number of the month is 5");
			break;
		case "June":
			System.out.println("The number of the month is 6");
			break;
		case "July":
			System.out.println("The number of the month is 7");
			break;
		case "August":
			System.out.println("The number of the month is 8");
			break;
		case "September":
			System.out.println("The number of the month is 9");
			break;
		case "October":
			System.out.println("The number of the month is 10");
			break;
		case "November":
			System.out.println("The number of the month is 11");
			break;
		case "December ":
			System.out.println("The number of the month is 12");
			break;
		default:
			System.out.println(month+", this is not a valid input.");
		}
		
	}

}
