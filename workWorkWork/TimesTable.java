/* 
 * 1. outer loop counts 9 times
 * 2. inner loop counts 9 times
 * 2.1 system print (i*x) to get multiplication numbers
 * 3. system prints new line of table of numbers
 */

package workworkwork;
import java.util.Scanner;
public class TimesTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Scanner in = new Scanner(System.in);
		 * double count;
		 * int numb;
		 */
		
		//outer loop counts 9 times
		for (int i=1; i<=9; i++){
			
			//inner loop counts 9 times
			for (int x=1; x<=9; x++){
				
				//i and x are multiplied
				System.out.print((i * x) + "	");
				}
			
			//all of the data is printed out
			System.out.println();
			}
}
}