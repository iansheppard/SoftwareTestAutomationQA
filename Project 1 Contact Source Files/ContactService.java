/*
 * Ian Sheppard
 * CS 320 Module 3 Milestone
 * 9/20/26
 */



package contact;

import java.util.ArrayList;





//Contact Service class
public class ContactService {
	
	//Instance variable, made it private for encapsulation
	private ArrayList<Contact> contactList;
	
	
	//Constructor for initialization
	public ContactService() {
		contactList = new ArrayList<Contact>();
	}
	
	//Method for adding contacts to the list
	public void addContact(Contact contact) {
		
		//For loop to ensure contact IDs are unique
		for (Contact existingContact: contactList) {
			if (existingContact.getContactId().equals(contact.getContactId())) {
				throw new IllegalArgumentException("That ID already exists.");
			}
		}
		
		//If no duplicates are found, add the new contact to the contact list
		contactList.add(contact);
	}
	
	//Method for deleting a contact via contact ID
	public void deleteContact(String contactId) {
		
		//Variable to store a contact to delete
		Contact contactToDelete = null;
		
		//For loop to locate the contact to remove
		for (Contact existingContact: contactList) {
			if (existingContact.getContactId().equals(contactId)) {
				contactToDelete = existingContact;
			}
		}
		
		//Delete the found contact from the list or throw an exception if that ID isn't found
		if (contactToDelete != null) {
			contactList.remove(contactToDelete);
		}
		
		else {
			throw new IllegalArgumentException("There is no contact matching this ID");
		}
	}
	
	//Method for updating a first name
	public void updateFirstName(String contactId, String newFirstName) {
		
		//Variable to store boolean value if a contact is found
		boolean contactFound = false;
		
		//Use a for loop to find the contact to update
		for (Contact existingContact: contactList) {
			if (existingContact.getContactId().equals(contactId)) {
				existingContact.setFirstName(newFirstName);
				contactFound = true;
			}
		}
		
		//If statement for not finding a matching contact throws an exception
		if (!contactFound) {
			throw new IllegalArgumentException("There is no contact matching this ID");
		}
	}
	
	//Method for updating a last name
	public void updateLastName(String contactId, String newLastName) {
		
		//Variable to store boolean value if a contact is found
		boolean contactFound = false;
		
		//Use a for loop to find the contact to update
		for (Contact existingContact: contactList) {
			if (existingContact.getContactId().equals(contactId)) {
				existingContact.setLastName(newLastName);
				contactFound = true;
			}
		}
		
		//If statement for not finding a matching contact throws an exception
		if (!contactFound) {
			throw new IllegalArgumentException("There is no contact matching this ID");
		}
	}
	
	//Method for updating a phone number
	public void updatePhone(String contactId, String newPhone) {
		
		//Variable to store boolean value if a contact is found
		boolean contactFound = false;
		
		//Use a for loop to find the contact to update
		for (Contact existingContact: contactList) {
			if (existingContact.getContactId().equals(contactId)) {
				existingContact.setPhone(newPhone);
				contactFound = true;
			}
		}
		
		//If statement for not finding a matching contact throws an exception
		if (!contactFound) {
			throw new IllegalArgumentException("There is no contact matching this ID");
		}
	}
	
	//Method for updating an address
	public void updateAddress(String contactId, String newAddress) {
		
		//Variable to store boolean value if a contact is found
		boolean contactFound = false;
		
		//Use a for loop to find the contact to update
		for (Contact existingContact: contactList) {
			if (existingContact.getContactId().equals(contactId)) {
				existingContact.setAddress(newAddress);
				contactFound = true;
			}
		}
		
		//If statement for not finding a matching contact throws an exception
		if (!contactFound) {
			throw new IllegalArgumentException("There is no contact matching this ID");
		}
	}

}
