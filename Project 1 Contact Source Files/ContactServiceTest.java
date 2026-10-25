/*
 * Ian Sheppard
 * CS 320 Module 3 Milestone
 * 9/20/26
 */



package contact;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



//ContactServiceTest class
class ContactServiceTest {
	
	//Private variables for the test class
	private ContactService testContactList;
	private Contact testContact;
	
	//Use before each so that each test has a fresh object with valid inputs
	@BeforeEach
	void setUp() {
		testContactList = new ContactService();
		testContact = new Contact("123456789", "Ronald", "Weasley", "5554443322", "123 Not Privet Dr");
	}
	
	/*
	 * Test adding a contact to a contact list, tested by adding the contact twice
	 * and getting an exception because it creates a duplicate exception.
	 * Doing it this way because contactList is private in ContactService.java
	 */
	@Test
	void testAddContact() {
		testContactList.addContact(testContact);
		
		assertThrows(IllegalArgumentException.class, () -> {
			testContactList.addContact(testContact);
		});
	}
	
	/*
	 * Test by adding a contact, then deleting it. When junit adds the contact in
	 * if there's no exception, then a duplicate wasn't created and the deletion worked.
	 */
	@Test
	void testDeleteContact() {
		testContactList.addContact(testContact);
		
		testContactList.deleteContact("123456789");
		
		assertDoesNotThrow(() -> {
			testContactList.addContact(testContact);
		});
	}
	
	//Test trying to delete an invalid contact
	@Test
	void testDeleteInvalidContact() {
		
		assertThrows(IllegalArgumentException.class, () -> {
			testContactList.deleteContact("111111111");
		});
	}
	
	//Test updating the first name by adding the test object to the list then updating it
	@Test
	void testUpdateFirstName() {
		testContactList.addContact(testContact);
		
		testContactList.updateFirstName("123456789", "Ian");
		
		assertEquals("Ian", testContact.getFirstName());
	}
	
	//Test trying to update a first name to an invalid contact
	@Test
	void testUpdateFirstNameInvalidContact() {
		
		assertThrows(IllegalArgumentException.class, () -> {
			testContactList.updateFirstName("111111111", "Ian");
		});
	}
	
	//Test updating the last name by adding the test object to the list then updating it
	@Test
	void testUpdateLastName() {
		testContactList.addContact(testContact);
		
		testContactList.updateLastName("123456789", "Sheppard");
		
		assertEquals("Sheppard", testContact.getLastName());
	}
	
	//Test trying to update a last name to an invalid contact
	@Test
	void testUpdateLastNameInvalidContact() {
		
		assertThrows(IllegalArgumentException.class, () -> {
			testContactList.updateLastName("111111111", "Sheppard");
		});
	}
	
	//Test updating the phone number by adding the test object to the list then updating it
	@Test
	void testUpdatePhone() {
		testContactList.addContact(testContact);
		
		testContactList.updatePhone("123456789", "1112223344");
		
		assertEquals("1112223344", testContact.getPhone());
	}
	
	//Test trying to update a phone number to an invalid contact
	@Test
	void testUpdatePhoneInvalidContact() {
		
		assertThrows(IllegalArgumentException.class, () -> {
			testContactList.updatePhone("111111111", "1112223344");
		});
	}
	
	//Test updating the address by adding the test object to the list then updating it
	@Test
	void testUpdateAddress() {
		testContactList.addContact(testContact);
		
		testContactList.updateAddress("123456789", "1234 Abc St");
		
		assertEquals("1234 Abc St", testContact.getAddress());
	}
	
	//Test trying to update an address to an invalid contact
	@Test
	void testUpdateAddressInvalidContact() {
		
		assertThrows(IllegalArgumentException.class, () -> {
			testContactList.updateAddress("111111111", "1234 Abc St");
		});
	}

}



























