
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;


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
	
	static XStream xstream = new XStream(new DomDriver());

	public static void main(String[] args) {
		
		try {
			
			Scanner personsFile = new Scanner(new File(Persons_File));
			File personOutput = new File ("data/Persons.xml");
			PrintWriter personWrite = new PrintWriter(personOutput);
			while (personsFile.hasNextLine()) {
				String line = personsFile.nextLine();
				String parts[] = line.split(",");
				if (parts.length != 1) {
					String personCode = parts[0];
					String type = parts[1];
					String lastName = parts[2];
					String firstName = parts[3];
					String street = parts[4];
					String city = parts[5];
					String state = parts[6];
					String zip = parts[7];
					String country = parts[8];
					List <String> emails = new ArrayList<>();
					for (int i = 9; i < parts.length; i++) {
						emails.add(parts[i]);
					}
					Address address = new Address(street, city, state, zip, country);
					Persons person = new Persons(personCode, type, lastName, firstName, address, emails);
					String xml = xstream.toXML(person);
					personWrite.println(xml);
				}
			}
			personWrite.close();
			personsFile.close();
			Scanner itemsFile = new Scanner(new File(Items_File));
			while (itemsFile.hasNextLine()) {
				String line = itemsFile.nextLine();
				String parts[] = line.split(",");
				if (parts.length != 1) {
				Services services = new Services(null, null, null, 0.0);
				Subscriptions subscription = new Subscriptions(null, null, null, 0.0);
				Product product = new Product(null, null, null, 0.0);
					if (parts[1].equals("SV")) {
						services.setCode(parts[0]);
						services.setSV(parts[1]);
						services.setName(parts[2]);
						services.setHourlyRate(Double.parseDouble(parts[3]));
					} 
					if (parts[1].equals("SB")) {
						subscription.setCode(parts[0]);
						subscription.setSB(parts[1]);
						subscription.setName(parts[2]);
						subscription.setAnnualFee(Double.parseDouble(parts[3]));
					}
					if (parts[1].equals("PN") || parts[1].equals("PU") || parts[1].equals("PG")) {
						product.setCode(parts[0]);
						product.setType(parts[1]);
						product.setName(parts[2]);
						product.setBasePrice(Double.parseDouble(parts[3]));
					}
					Items items = new Items(product, services, subscription);
				}	
			}
			itemsFile.close();
			Scanner storesFile = new Scanner(new File(Stores_File));
			File storeOutput = new File ("data/Stores.xml");
			PrintWriter storeWrite = new PrintWriter(storeOutput);
			while (storesFile.hasNextLine()) {
				String line = storesFile.nextLine();
				String parts[] = line.split(",");
				if (parts.length != 1) {
					String storeCode = parts[0];
					String managerCode = parts[1];
					String street = parts[2];
					String city = parts[3];
					String state = parts[4];
					String zip = parts[5];
					String country = parts[6];
					Address address = new Address(street, city, state, zip, country);
					Stores store = new Stores(storeCode, managerCode, address);	
					String xml = xstream.toXML(store);
					storeWrite.println(xml);
				}
			}
			storeWrite.close();
			storesFile.close();
			} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}

//public class DataConverter {
//	
//	private static final String Persons_File = "data/Persons.csv";
//	
//	private static final String Items_File = "data/Items.csv";
//	
//	private static final String Stores_File = "data/Stores.csv";
//
//	public static void main(String[] args) {
//		
//		
//		try {
//			
//			Scanner personsFile = new Scanner(new File(Persons_File));
//			int n = 0;
//			while (personsFile.hasNextLine()) {
//				if (n != 0) {
//					String line = personsFile.nextLine();
//					String parts[] = line.split(",");
//					String personCode = parts[0];
//					String type = parts[1];
//					String lastName = parts[2];
//					String firstName = parts[3];
//					String street = parts[4];
//					String city = parts[5];
//					String state = parts[6];
//					String zip = parts[7];
//					String country = parts[8];
//					List <String> emails = new ArrayList<>();
//					for (int i = 9; i < parts.length; i++) {
//						emails.add(parts[i]);
//					}
//					Address address = new Address(street, city, state, zip, country);
//					Persons person = new Persons(personCode, type, lastName, firstName, address, emails);
//				}
//				n++;
//			}
//			n = 0;
//			Scanner itemsFile = new Scanner(new File(Items_File));
//			while (itemsFile.hasNextLine()) {
//				if (n != 0) {
//					String line = itemsFile.nextLine();
//					String parts[] = line.split(",");
//					Services services = new Services(null, null, null, 0.0);
//					Subscriptions subscription = new Subscriptions(null, null, null, 0.0);
//					Product product = new Product(null, null, null, 0.0);
//					if (parts[1].equals("SV")) {
//						services.setCode(parts[0]);
//						services.setSV(parts[1]);
//						services.setName(parts[2]);
//						services.setHourlyRate(Double.parseDouble(parts[3]));
//					} 
//					if (parts[1].equals("SB")) {
//						subscription.setCode(parts[0]);
//						subscription.setSB(parts[1]);
//						subscription.setName(parts[2]);
//						subscription.setAnnualFee(Double.parseDouble(parts[3]));
//					}
//					if (parts[1].equals("PN") || parts[1].equals("PU") || parts[1].equals("PG")) {
//						product.setCode(parts[0]);
//						product.setType(parts[1]);
//						product.setName(parts[2]);
//						product.setBasePrice(Double.parseDouble(parts[3]));
//					}
//					Items items = new Items(product, services, subscription);
//				}
//				n++;
//			}
//			n = 0;
//			Scanner storesFile = new Scanner(new File(Stores_File));
//			while (storesFile.hasNextLine()) {
//				if (n != 0) {
//					String line = storesFile.nextLine();
//					String parts[] = line.split(",");
//					String storeCode = parts[0];
//					String managerCode = parts[1];
//					String street = parts[2];
//					String city = parts[3];
//					String state = parts[4];
//					String zip = parts[5];
//					String country = parts[6];
//					Address address = new Address(street, city, state, zip, country);
//					Stores store = new Stores(storeCode, managerCode, address);
//				}
//				n++;
//			}
//			
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//	}
//}
