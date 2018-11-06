/*This is for method programming
 * 
 */

package workworkwork;

public class Squares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0; i<=10; i++){
			
			System.out.print(i + "\t");
			System.out.print(Square(i));
			System.out.println();
		}//end for
	}//end method main

	public static int Square(int x){
		
		int y= x*x;
		return y;
	}//end method square
}//end class

