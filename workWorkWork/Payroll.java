package workworkwork;
import java.util.Scanner;
public class Payroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter your hours: ");
		int hours = in.nextInt();
		System.out.print("Enter your rate: ");
		double rate = in.nextInt();
			double pay = rate*hours;
			
				if (hours > 40){
					int overtime = hours - 40;
					pay += overtime *(rate*0.5);
				}
					System.out.print("Netpay: "+pay);
				}
}
