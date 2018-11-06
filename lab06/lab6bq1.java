package Lab6;

public class lab6bq1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count;
		int runningTotal;
		
		count =1;
		runningTotal=0;
		while(count >=50 && count <=100)
		{
			runningTotal=runningTotal+count;
			System.out.println(count);
			count=count +1;
		}
		System.out.println("Total = "+runningTotal);
	}

}
