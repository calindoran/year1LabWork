package workworkwork;
import javax.swing.JOptionPane;
public class Calculator {
		
		public static void main(String args[]){

		//Strings where the user puts the numbers in	
		
		JOptionPane.showMessageDialog(null, "I'm a Calculator");	
			
		String firstNum = JOptionPane.showInputDialog("Enter number 1: ");
		String secondNum = JOptionPane.showInputDialog("Enter number 2: ");
		
		//Convert words to proper numbers
		int num1 = Integer.parseInt(firstNum);
		int num2 = Integer.parseInt(secondNum);
		
		//Where the two strings are added
		int restultadd = num1 + num2;
		
		JOptionPane.showMessageDialog(null, "The answer is: " +restultadd);
			
		}

	}
