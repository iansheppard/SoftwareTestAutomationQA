/*
 * Ian Sheppard
 * CS 320 Module 3 Milestone
 * 9/20/26
 */



package contact;

//Create the Contact class
public class Contact {
	
	//Create the instance variables, make them private for encapsulation
	private String contactId;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	//Create the constructor for initialization
	public Contact(String contactId, String firstName, String lastName, String phone, String address) {
		
		//Check for invalid contact IDs
		if(contactId == null || contactId.length() > 10) {
			throw new IllegalArgumentException("Invalid contact ID");
		}
		this.contactId = contactId;
		
		//Check for invalid first names
		if(firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid first name");
		}
		this.firstName = firstName;
		
		//Check for invalid last names
		if(lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid last name");
		}
		this.lastName = lastName;
		
		//Check for invalid phone numbers
		if(phone == null || !phone.matches("\\d{10}")) {
			throw new IllegalArgumentException("Invalid phone number");
		}
		this.phone = phone;
		
		//Check for invalid addresses
		if(address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid address");
		}
		this.address = address;
		
	}
	
	//Getter methods to retrieve Contact information
	public String getContactId() {
		return contactId;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public String getAddress() {
		return address;
	}
	
	
	//Setter methods update Contact information
	public void setFirstName(String firstName) {
		//Check for invalid first name
		if(firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid first name");
		}
		
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		//Check for invalid last name
		if(lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid last name");
		}
		
		this.lastName = lastName;
	}
	
	public void setPhone(String phone) {
		//Check for invalid phone number
		if(phone == null || !phone.matches("\\d{10}")) {
			throw new IllegalArgumentException("Invalid phone number");
		}
		
		this.phone = phone;
	}
	
	public void setAddress(String address) {
		//Check for invalid address
		if(address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid address");
		}
		
		this.address = address;
	}
}
