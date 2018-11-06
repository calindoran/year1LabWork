package workworkwork;

import java.util.Scanner;

public class Forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner in_text = new Scanner(System.in);

		Scanner in_num = new Scanner(System.in);

		System.out.println("Write somthing.. ");

		String text = in_text.next();

		System.out.println("How many times would you like to print this? ");

		int times = in_num.nextInt();
		in_text.close();
		in_num.close();
		
		
		for(int x=1; x<=times; x++){

		System.out.print(text);

		}
	}
}
/*other work
package workworkwork;

import java.util.Scanner;

public class Forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);

		for(int x=0; x<=9; x++){	
		System.out.println("Input Miles ");
		
		int miles = in.nextInt();
		double km = miles*1.609;
		System.out.println("Distance in kilometers is: "+km);
*/