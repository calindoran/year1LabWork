package workworkwork;
import java.util.Scanner;
public class Voting {
		
		public static void main(String[] args){
		
		//scanner to get input from user	
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter your age: ");
		int age = in.nextInt();
		
		in.close();
		
		//Check if age is greater than 18
		if(age >=18){
			System.out.print("You can vote!");
		}

		else{
			System.out.print("Sorry you cant vote.");
		}
	}
	}