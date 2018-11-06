package workworkwork;
import java.util.Scanner;
public class cunt {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 double [] rainfall = new double [7];
		 double sum =0;
		 double average=0;
		 Scanner in = new Scanner(System.in);
		 double largest = rainfall[0];
	     double smallest = rainfall[0];
			
			for (int i=0; i<rainfall.length; i++){
				
				System.out.println("Enter rain value for day " +(i+1));
				rainfall[i] = in.nextInt();
				sum += rainfall[i];
				average = sum/3;
			}
			for (int i=0; i<rainfall.length; i++){
				
				if(rainfall[i] > largest){
                    largest = rainfall[i];
			}
				
			else if(rainfall[i] < smallest){
                    smallest = rainfall[i];
				
			}	

			System.out.println("Total rainfall is: "+sum);
			System.out.println("Average rainfall is: "+average);
			System.out.println("Maximum rainfall in a day is: "+largest);
            System.out.println("Minimum rainfall in a day is: "+smallest);
			

}}}
