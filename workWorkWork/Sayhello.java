package workworkwork;
import javax.swing.JOptionPane;
public class Sayhello {

		public static void main(String[] args) {

//			System.out.print("Hello World, I'm a Java Program. P.S. I will take over the world. :) \n");

			String title = JOptionPane.showInputDialog("What up? ");
			
			JOptionPane.showMessageDialog(null, "Hay " + title);
		}

	}
