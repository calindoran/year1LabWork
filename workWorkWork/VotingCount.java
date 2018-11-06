package workworkwork;
import java.util.Scanner;
public class VotingCount {
				
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);	
		Scanner keyboard = new Scanner(System.in);
		Scanner in_total = new Scanner(System.in);
		String gender;
		int age;
		int numpeople;
		int total;
		
		
		System.out.println("How many people need to vote? ");
		numpeople = in_total.nextInt();
		
		for(total=1; total<=numpeople; total++){
				
		System.out.println("Enter M for male, or F for female");
		gender = keyboard.next();

		   if (gender.equalsIgnoreCase("m")){
		   gender = "Male";
		     }
		   else if (gender.equalsIgnoreCase("f")){
		   gender = "Female";
		   }
		   else {
		   gender = "Incorrect input, try again.";
		   System.exit(0);
		   }
		   System.out.println("This is the input for gender: " + gender);
		   
		System.out.println("Enter your age: ");
		age = in.nextInt();
		
			if(age >=18){
				System.out.println("You can vote!");
			}
			else{
				System.out.println("Sorry you cant vote.");
			}
		}
		System.out.println("This is how many people voted: " + total);
	}
}