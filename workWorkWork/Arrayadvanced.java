package workworkwork;

import java.util.Scanner;

public class Arrayadvanced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		double[] Array = new double[5];
		double sum = 0;
		
		for (int i = 0; i<Array.length; i++){
			
			System.out.println("Enter values: " +(i+1));
			Array[i] = in.nextInt();
		}
		
		//to count backwards i=numinArray; i>somethin.lenght; i--
		
		for (int i = 0; i<Array.length; i++){
			
			System.out.println("Value "+(i+1)+ " is: " );
			System.out.println(Array[i]);
			sum += Array[i];
		}
		
		System.out.println("The sum is " + sum);
		
	}
}