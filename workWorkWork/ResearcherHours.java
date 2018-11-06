package workworkwork;
import java.util.Scanner;
public class ResearcherHours {
	
	/*
	 * [Input name]
	 * 		||
	 * 		\/
	 * [Input hours worked]
	 * 			||
	 * 			\/
	 * <Calculate average hour>
	 * 			||
	 * 			\/
	 * [Add to #assistance]
	 * 			||
	 * 			\/
	 * <Would you like to add more?>----YES---->[Input name]
	 * 			||
	 * 			NO
	 * 			\/
	 * [system.out.print DATA]
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in_text = new Scanner(System.in);
		Scanner in_num = new Scanner(System.in);
		Scanner keyboard = new Scanner(System.in);
		
		int sum;
		int average = 0;
		int hours = 0;
		double finalhours;
		double finalaverage = 0; 
		//Takes data from the user on number of assistants
		System.out.print("Enter number of research assistants: ");
		int numAssist = keyboard.nextInt();
		
		while (finalaverage >= 0){
			
			for (int i = 0; i<numAssist; i++){
		//Where it takes the name		
				System.out.println("Please enter your name: ");
				String text = in_text.next();
			//where its takes the hours worked
				System.out.println("Please enter hours worked per day: ");
				hours = in_num.nextInt();
				//where it calculates the average hours worked
				sum = hours*5;
				average = sum / 2;
					//prints out the total and average data
				System.out.println(text+ " total number of hours worked: "+sum);
				System.out.println(text + " average hours worked a week: "+average);
				}
		//where it adds up all of the data to a final total and average
		finalhours = hours+numAssist;
		finalaverage = average/numAssist;
		System.out.println("Total number of hours worked "+finalhours);
		System.out.println("Total average number of hours worked "+finalaverage);
}
}
}