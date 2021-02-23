
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
	
	private static final String Persons_File = "data/Persons.csv";
	
	private static final String Items_File = "data/Items.csv";
	
	private static final String Stores_File = "data/Stores.csv";
	
	private static final String Sales_File = "data/Sales.csv";

	public static void main(String[] args) {
		
		try {
			
			Scanner personsFile = new Scanner(new File(Persons_File));
			while (personsFile.hasNextLine()) {
				String line = personsFile.nextLine();
				String parts[] = line.split(",");
				
			}
			
			Scanner itemsFile = new Scanner(new File(Items_File));
			while (itemsFile.hasNextLine()) {
				String line = itemsFile.nextLine();
				String parts[] = line.split(",");
				
			}
			
			Scanner storesFile = new Scanner(new File(Stores_File));
			while (storesFile.hasNextLine()) {
				String line = storesFile.nextLine();
				String parts[] = line.split(",");
				
			}
			
			Scanner salesFile = new Scanner(new File(Sales_File));
			while (salesFile.hasNextLine()) {
				
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
