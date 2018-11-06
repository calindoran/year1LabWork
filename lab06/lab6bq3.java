package Lab6;

public class lab6bq3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 1;
		int sum = 0;

		while (number >= 1 && number <= 20){
			if (number < 20){
				
				sum=number+sum;
				number += 2;
				System.out.print(number + ", ");
				System.out.println("The sum of even numbers is: "+sum);
			
				sum=number+sum;
				number += 2;
				System.out.print(number + ", ");
				System.out.println("The sum of odd numbers is: "+sum);
			}
		}
		}
	}