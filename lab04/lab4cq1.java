package lab04;
import java.util.Scanner;
public class lab4cq1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		String firstname;
		String lastname;
		
		System.out.print("Enter your first name: ");
		firstname = in.nextLine();
		System.out.print("Enter your last name: ");
		lastname = in.nextLine();
		System.out.println("Your name is "+firstname+" "+lastname);
		
	}
}