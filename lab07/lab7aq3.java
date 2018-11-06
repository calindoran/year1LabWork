package Lab7;

public class lab7aq3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0; 
		int i = 0;
		double average;
		
		do{
		      sum += i*i;
		      i++;
		      average=sum/i;
		      
		}while(i<100);{
			
		  System.out.println("The sum is " + sum);
		  System.out.println("The average is " + average);
	}
	}

}
