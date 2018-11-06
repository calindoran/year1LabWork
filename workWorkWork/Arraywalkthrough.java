package workworkwork;
import java.util.Scanner;
public class Arraywalkthrough {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int sum = 0;
		int product = 0;
		
		int[] numbArray = {2, 4, 6, 9, 5, 4, 5, 7, 12, 15, 21, 32, 45, 5, 6, 7, 12};
		
		for (int i = 0; i<numbArray.length; i++){
			
			sum += numbArray[i];
			product += numbArray[i]*numbArray[i];
	}

		System.out.println("The sum is " + sum);
        System.out.println("The product is " + product);
}
}