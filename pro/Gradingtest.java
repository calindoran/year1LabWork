package pro;
import java.util.Scanner;

public class Gradingtest {
	
	public static void main(String[] args){
	
	//scanner to get input from user	
	Scanner in = new Scanner(System.in);
	
	System.out.print("Enter your grade: ");
	int grade = in.nextInt();
	
	in.close();
	
	//Check if age is greater than 18
	if(grade >=90){
		System.out.print("You got and A lad! ");
	}
	else if(grade >=80){
		System.out.print("You done good boi! Heres a B.");
	}
	else if(grade >=70){
		System.out.print("Chap! Sound job, got a C!");
	}
	else if(grade >=60){
		System.out.print("Your shit.. get out! With your f**k'n D..");
		
	}
}
}