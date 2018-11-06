package Lab5;

import java.util.Scanner;

public class lab5q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		
		System.out.print("Enter your value: ");
		int value = in.nextInt();
		
		in.close();
		
		if(value >=0){
			System.out.print("You got greater than zero!");
		}
		else if(value <=0){
			System.out.print("You got less than or equal to zero!");
	}

}
}