package MyCalculator;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CalculatorProject {

	public static void doAddition() throws Exception {
	
	    String strNo1, strNo2;
	    int no1, no2;
	    int result;
	
	    System.out.println("Enter Number one: ");
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    strNo1 = br.readLine();
	
	    System.out.println("Enter Number two: ");
	    BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
	    strNo2 = br1.readLine();
	
	    no1 = Integer.parseInt(strNo1);
	    no2 = Integer.parseInt(strNo2);
	
	    result = no1 + no2;
	
	    System.out.println("Equils: " + result);
	}

public static void doDivision() throws Exception {

    String strNo1, strNo2;
    int no1, no2;
    float result;

    System.out.println("Enter Number one: ");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    strNo1 = br.readLine();

    System.out.println("Enter Number two: ");
    BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
    strNo2 = br1.readLine();

    no1 = Integer.parseInt(strNo1);
    no2 = Integer.parseInt(strNo2);

    result = no1 / no2;

    System.out.println("Equils: " + result);
}

public static void doMultiplication() throws Exception {

    String strNo1, strNo2;
    int no1, no2;
    int result;

    System.out.println("Enter Number one: ");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    strNo1 = br.readLine();

    System.out.println("Enter Number two: ");
    BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
    strNo2 = br1.readLine();

    no1 = Integer.parseInt(strNo1);
    no2 = Integer.parseInt(strNo2);

    result = no1 * no2;

    System.out.println("Equils: " + result);
}

public static void doSquareroute() throws Exception {

    String strNo1;
    int no1;
    float result;

    System.out.println("Enter Number to Square: ");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    strNo1 = br.readLine();

    no1 = Integer.parseInt(strNo1);

    result = no1 * no1;

    System.out.println("Equils: " + result);
}

public static void doSubstraction() throws Exception {

    String strNo1, strNo2;
    int no1, no2;
    float result;

    System.out.println("Enter Number one: ");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    strNo1 = br.readLine();

    System.out.println("Enter Number two: ");
    BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
    strNo2 = br1.readLine();

    no1 = Integer.parseInt(strNo1);
    no2 = Integer.parseInt(strNo2);

    result = no1 - no2;

    System.out.println("Equils: " + result);
}
public static void main(String[] args) throws Exception {
    System.out.println("******Calculator******");
    System.out.println("1. Add");
    System.out.println("2. Substract");
    System.out.println("3. Multiply");
    System.out.println("4. Divide");
    System.out.println("5. Squared");
    System.out.println("0. Exit");
    System.out.println("**********************");
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    int usrChoice;

    usrChoice = Integer.parseInt(str);

    switch (usrChoice) {
        case 1:
            doAddition();
            break;
        case 2:
        	doSubstraction();
            break;
        case 3:
        	doMultiplication();
            break;
        case 4:
            doDivision();
            break;
        case 5:
        	doSquareroute();
        	break;
        case 0:
            System.out.println("Thank you");
            break;
        default:
            System.out.println("Invalid Value");
    }
    System.out.println("End");
}
}