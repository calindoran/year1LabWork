package workworkwork;
import java.util.Scanner;
public class Password {

		public static void main(String[] args) {

	final String PASS="Honey123";

	int numguesses=3;

	boolean guessedCorrect=false;

	Scanner in = new Scanner(System.in);

	System.out.print("Input password: "+numguesses+" reamining ");

	String passguess = in.next();

	while(!guessedCorrect){
		numguesses--;
	if(passguess.equalsIgnoreCase(PASS)){
		guessedCorrect=true;
		System.out.print("Correct Password.");
	}
	else if(passguess.equalsIgnoreCase(PASS)&&numguesses>0){
		System.out.print("Re-enter Password"+numguesses+" remaining");
		passguess=in.next();
	}
	else{
		System.out.print("Incorrect password, your account is locked.");
		guessedCorrect=true;
	}
	}
	}
	}