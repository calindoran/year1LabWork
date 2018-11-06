package workworkwork;
import java.util.Scanner;
public class Tempregulator {

		public static void main(String[] args) {
		
			Scanner in = new Scanner(System.in);
			
			System.out.print("Enter temperature: ");
			int temp = in.nextInt();
			
			if(temp <50){
				System.out.print("Nips are razorblades lad.");
			}
			else if(temp >90){
				System.out.print("Boil the arse off yeh!");
			}
			else{
				System.out.print("Grand");
			}
			in.close();
			// TODO Auto-generated method stub

		}

	}
