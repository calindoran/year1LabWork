package Lab9;

import java.util.Scanner;

public class lab9aq1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		int[] Array = new int[10];
		
		for (int i = 0; i<Array.length; i++){

			System.out.println("Enter values: ");
			Array[i] = in.nextInt();
		}
		
		for (int i = 0; i<Array.length; i++){
			
			System.out.println(Array[i]);
		}
	}
}