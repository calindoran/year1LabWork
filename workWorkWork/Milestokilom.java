package workworkwork;
import java.util.Scanner;

public class Milestokilom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		String cont = "Y";
		
		while (cont == "Y");{
		
		System.out.print("Enter distance: ");
		
		int miles = in.nextInt();
		
		double km = miles*1.609;
		
		System.out.printf("Miles to Kilometers is: ", + km);
		
		System.out.print("Do you want to Continue? ");
		
		}
		
	}

}
/*package workworkwork;
import java.util.Scanner;
 * public class Milestokilom
 * public static void main(String[] args) {
// TODO Auto-generated method stub

	Scanner in = new Scanner(System.in);

	for(int x=0; x<=9; x++){	
	System.out.println("Input Miles ");

	int miles = in.nextInt();
	double km = miles*1.609;
	System.out.println("Distance in kilometers is: "+km);
}
}

}
*/