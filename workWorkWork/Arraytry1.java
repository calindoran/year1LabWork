package workworkwork;

import java.util.Scanner;					//to count backwards i=numinArray; i>somethin.lenght; i--

public class Arraytry1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		int [] Array = new int[5];
		int sum = 0;
		
		for (int i = 0; i<Array.length; i++){

				System.out.println("Enter values: ");
				Array[i] = in.nextInt();
			}
		
		for (int i = 0; i<Array.length; i++){
			
			//System.out.println("Value "+(i+1)+ " is: " );
			//System.out.println(Array[i]);
			sum += Array[i];
		}
		
		System.out.println("The sum is " +sum);
	
		for (int x=4; x>=0; x--){
		
		System.out.println(Array[x]);
	}
}
}