import java.util.Scanner;

/**
 * MonoTextCube
 *
 * @author Matthew Farr
 * 
 * This class defines a main method for a program which takes in user input from the console and
 * generates an ASCII text art cube made from the text.
 */
public class MonoTextCube {
	
	private static final int VALID_INPUT = 0;
	private static final int ERROR_SHORT_INPUT = 1;
	private static final int ERROR_NON_SYMMETRIC_INPUT = 2;
	private static final int ERROR_SHORT_NON_SYMMETRIC_INPUT = 3;
	
	public static void main(String[] args) 
	{
		// Get text input
		Scanner scanner = new Scanner(System.in);
		System.out.print("\nInput text to make into a text-cube: ");
		String input = scanner.nextLine();
		
		// Filter the input text of whitespace and non alphanumeric characters
		input = filterInput(input);
		System.out.println("Filtered input: " + input);
		
		int check = checkInput(input);
		// Test print error msg numbers
		System.out.println("Check input: " + check);
	}
	
	/**
	 * filterInput
	 * 
	 * Method for filtering the input string of non alphanumeric characters. Used to make input
	 * suitable for creating the monospace text cube with edges with a solid appearance.
	 *
	 * @param str: The string to be filtered
	 *
	 */
	private static String filterInput (String str)
	{
		return str.replaceAll("[^A-Za-z0-9]", "").toUpperCase();
	}
	
	/**
	 * checkInput
	 * 
	 * Method for checking the filtered input string is long enough to create a cube with distinct
	 * front and back faces and that the first and last letter of the string are the same
	 *
	 * @param str: The filtered input string
	 */
	private static int checkInput(String str)
	{
		int value = 0;
		
		int len = str.length();
		if (len < 5)
			value += ERROR_SHORT_INPUT;
		if (str.charAt(0) != str.charAt(len-1))
			value += ERROR_NON_SYMMETRIC_INPUT;
		
		return value;
	}
	
}