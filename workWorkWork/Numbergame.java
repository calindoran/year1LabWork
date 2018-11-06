package workworkwork;
import java.util.Scanner;
public class Numbergame {

		public static void main(String[] args) {
		
			int Luckynumber = 13;
			
			Scanner in = new Scanner(System.in);
			
			System.out.print("Take a Guess! ");
			int Guess = in.nextInt();
			
			while (Guess != Luckynumber){
					System.out.print("Guess again! ");
					Guess = in.nextInt();
			}
		
			System.out.print("Good Guess!");
			
		}
	}
