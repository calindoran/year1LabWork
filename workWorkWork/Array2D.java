package workworkwork;

public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int largest = 0;
		int smallest = 0;
		
		int [][] myNums = { {11, 3}, {10, 28}, {20, 31}, {99, 30}, {14, 11}, {56, 34}, {64, 6} };

		for (int i=0; i<myNums.length; i++){
			for(int x=0; x<myNums[0].length; x++){
				
				System.out.print(myNums[i][x]+"\t"); //print them out with a "tab"  
				
				if (myNums[i][x] > largest){
			      	largest = myNums[i][x];
				}				
			}
			System.out.println(); //print it all out in the line
		}		
		System.out.println("Largest is: "+largest); //print the largest
		smallest = largest;
		
		for (int i=0; i<myNums.length; i++){
			for(int x=0; x<myNums[0].length; x++){
				
				if (myNums[i][x] < smallest){
			      	smallest = myNums[i][x];
			}
		}
		}
		System.out.println("Smallest is: "+ smallest); //print the smallest
	}
}