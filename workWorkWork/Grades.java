package workworkwork;
import java.util.Scanner;
public class Grades {
		
		public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		
		
		System.out.print("Enter your grade: ");
		int grade = in.nextInt();
		
		in.close();
		
		if(grade >=90){
			System.out.print("You got an A! Sound job!");
		}
		else if(grade >=80){
			System.out.print("You done good boi! Heres a B.");
		}
		else if(grade >=70){
			System.out.print("Lad, sound job, got a B!");
		}
		else if(grade >=60){
			System.out.print("Not bad, could to better.C");
		}
		else if(grade >=50){
			System.out.print("Not bad, could do better.C");
		}
		else if(grade >=40){
			System.out.print("You get a D, for do better.");
		}
		else if(grade <=40){
			System.out.print("You failed, with an F no less.");
		}
		}
}
		
		/*public static void main(String[] args){
		
		Scanner keyboard = new Scanner(System.in);
		int count = 0;
		double finalmark =0, total =0, average =0;
		
		System.out.print("Enter number of tests: ");
		int numTests = keyboard.nextInt();
		
		//while (finalmark >= 0){
        	for (int i = 0; i<numTests; i++){
            
        		System.out.println("Enter mark " + (i+1) +": ");
        		
        		finalmark = keyboard.nextDouble();
            total = total + finalmark; 
        }
        average = total / numTests;

        System.out.println("Total Tests: " + numTests);
        System.out.println("Total Score " + total);
        System.out.println("Average is " + average);
	}	
	}
*/