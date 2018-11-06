package Lab5;

import java.util.Scanner;

public class lab5q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter your grade: ");
		int grade = in.nextInt();
		
		in.close();
		
		if(grade >=70){
			System.out.print("You got a Distinction");
		}
		else if(grade >=69){
			System.out.print("You got a Merit1");
		}
		else if(grade >=62){
			System.out.print("You got a Merit2");
		}
		else if(grade >=54){
			System.out.print("You got a Pass");
		}
		else if(grade <=39){
			System.out.print("You Failed");
	}

}
}