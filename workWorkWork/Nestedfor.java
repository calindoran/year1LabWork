package workworkwork;

public class Nestedfor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// outer loop iterates 5 times.
		for (int i = 1; i <= 5; i++) {   
			
			// for each iteration of outer loop,
		    for (int j = 1; j <= 10; j++) { 
		    	
		    	// inner loop iterates 10 times
		        System.out.print((i * j) + " ");
		    }
		    System.out.println();
		}
	}

}
