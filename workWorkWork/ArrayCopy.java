package workworkwork;

public class ArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] days1 = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int [] days2 = new int[days1.length];
		for (int index=0; index<days2.length; index++)
		{		
			days2[index] = days1[index];	
	}
	}
}