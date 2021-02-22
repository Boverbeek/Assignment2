<<<<<<< HEAD
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 
 * @author Brennon Overbeek, Sam Hamacher
 * 
 * TODO: make documentation
 *
 */
public class DataConverter {

	public static void main(String[] args) {
		
		try {
			
			Scanner inputFile = new Scanner(new File(args[0]));
			while (inputFile.hasNextLine()) {
				
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
=======
/**
 * 
 * @author Brennon Overbeek, Sam Hamacher
 * 
 * TODO: make documentation
 *
 */
public class DataConverter {

	public static void main(String[] args) {
		
>>>>>>> branch 'master' of https://github.com/Boverbeek/Assignment2.git
	}
}
