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
	
	public static void main(String[] args) 
	{
		// Get text input
		Scanner scanner = new Scanner(System.in);
		System.out.print("\nInput text to make into a text-cube: ");
		String input = scanner.nextLine();
		
		// Filter the input text of whitespace and non alphanumeric characters
		input = filterInput(input);
		System.out.println("Filtered input: " + input);
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
	
}