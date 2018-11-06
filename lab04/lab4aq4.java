package lab04;
import java.util.Scanner;

public class lab4aq4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

        System.out.print("Enter First Integer: ");
        int num1 = in.nextInt();
        System.out.print("Enter Second Integer: ");
        int num2 = in.nextInt();
        System.out.print("Enter Third Integer: ");
        int num3 = in.nextInt();

        int sum = num1 + num2 + num3;
        int average = sum / 3;
        int product = num1 * num2 * num3;

        int largest = num1;
        int smallest = num1;

        if(num2 > largest)
            largest = num2;

        if(num3 > largest)
            largest = num3;

        if(num2 < smallest)
            smallest = num2;

        if(num3 < smallest)
            smallest = num3;

        System.out.println("The sum is " + sum);
        System.out.println("The product is " + product);
        System.out.println("The average is " + average);

        System.out.println("Largest of three integers is " + largest + " and the smallest is "+ smallest + ".");
    }
}