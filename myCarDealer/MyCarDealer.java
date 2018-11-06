package MyCarDealer;
import java.util.*;

public class MyCarDealer {

	private static final int INVENTORY_SIZE = 12;
	private static stock [] stocks;

	public static void main (String [] args){
	    MyCarDealer();



	}

	private static void MyCarDealer() {
		
		Scanner console = new Scanner(System.in);
		
	    for (int i = 0; i<INVENTORY_SIZE; i++){

	    System.out.println ("Car's name:");
	    String carName = console.next();

	    System.out.println ("Car's price:");
	    int carPrice = console.nextInt();

	    System.out.println ("Numbers of car's: ");
	    int numberCars= console.nextInt();

	          stocks [0]= new stock(carName, carPrice, numberCars);
	    }
	}

	public MyCarDealer() {
	    stocks = new stock [INVENTORY_SIZE];

	}
}