package lab04;
import java.util.Scanner;
public class lab4aq5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int loanamount;
		double interestrate;
		int years;
		double totalamount;
		
		System.out.println("Enter how much of a loan you would like.");
		loanamount = in.nextInt();
		System.out.println("The number you entered was �" + loanamount);
		//System.out.println("Enter your interest rate");
		interestrate = 0.03875;
		System.out.println("The interest rate is %" + interestrate);
		System.out.println("Enter number of years ");
		years = in.nextInt();
		System.out.println("The number of years you enter was " + years);
		totalamount = loanamount*interestrate*years;
		System.out.println("The total amount that will be paid in interest is �"+totalamount);
		

	}

}
