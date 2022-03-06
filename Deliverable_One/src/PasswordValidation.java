import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class PasswordValidation {
	
	public static boolean validPwd(String pwd) {
		//Start at the beginning of the String and check if at min 1 lowercase/uppercase, 
		//a number is present, characters between 7-12 exist, and if an exclamation mark is present. Then note the end of the string
		Pattern p = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).{8,12}(?=.*[!]).+$");
		Matcher m = p.matcher(pwd);
		boolean b = m.matches();
		
		System.out.println(b);
		return b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scrn = new Scanner(System.in); //Create a Scanner Object for password
		System.out.println("Please provide a password with the following requirements: At least one lowercase and uppercase letter, "
				+"\n"+ "at least minimum of 7 characters, a maximum of 12 charcters, and an exclamation point:! "+ "\n");
		
		String pwd = scrn.nextLine(); //Read user input
	
		if (validPwd(pwd)) {
			System.out.println("Password valid and accepted");
		}
		else {
			System.out.println("Error");
		}
	
	
	}
}
