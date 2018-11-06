package Lab8;

import java.util.Scanner;

public class lab8q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		int[] Array = new int[10];
		
		for (int i = 0; i<Array.length; i++){
			
			System.out.println("Enter values: " +(i+1));
			Array[i] = in.nextInt();
		}
	}
}
