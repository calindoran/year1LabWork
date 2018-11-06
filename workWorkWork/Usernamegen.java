package workworkwork;
import java.util.Scanner;
public class Usernamegen {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner in_text = new Scanner(System.in);
			
			//where the 1st+lstname are taken
			System.out.print("Enter your first name: ");
			String firstname = in_text.nextLine();
			System.out.print("Enter your last name: ");
			String lastname = in_text.nextLine();
			//where username is created useing username and lowercase cmd
			String username = firstname.charAt(0)+lastname;
			String usernamel = username.toLowerCase();
			//where its all put together
			System.out.println(usernamel+"@itcarlow.ie");
			
		}

	}
