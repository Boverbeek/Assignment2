import java.util.List;

/**
 * 
 * @author Brennon Overbeek, Sam Hamacher
 *
 *
 * TODO: make documentation
 */
public class Persons {

		private String personCode;
		private String type;
		private String firstName;
		private String lastName;
		private Address address;
		private List <String> emails;
		
		public Persons (String personCode, String type, String firstName, String lastName, Address address, List <String> emails) {
			this.personCode = personCode;
			this.type = type;
			this.firstName = firstName;
			this.lastName = lastName;
			this.address = address;
			this.emails = emails;
		}

		public String getPersonCode() {
			return personCode;
		}

		public void setPersonCode(String personCode) {
			this.personCode = personCode;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public Address getAddress() {
			return address;
		}

		public void setAddress(Address address) {
			this.address = address;
		}

		public List<String> getEmails() {
			return emails;
		}

		public void setEmails(List<String> emails) {
			this.emails = emails;
		}
		
		
	}
