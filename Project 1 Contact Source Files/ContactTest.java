/*
 * Ian Sheppard
 * CS 320 Module 3 Milestone
 * 9/20/26
 */



package contact;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//Create the Contact Test class
class ContactTest {
	
	//Create instance variable for test class
	private Contact testContact;

	//Use before each so that each test has a fresh object with valid inputs
	@BeforeEach
	void setUp() {
		testContact = new Contact("123456789", "Ronald", "Weasley", "5554443322", "123 Not Privet Dr");
	}
	
	
	//Test the invalid inputs
	
	//Test contact ID validation
	@Test
	void invalidContactIdChars() {
		
		//Verify a contact ID longer than 10 characters throws an exception
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345678901","Harry", "Potter", "9998887766", "4 Privet Dr");
		});
	}
	
	@Test
	void invalidContactIdNull() {
		
		//Verify a contact ID that's null throws an exception
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "Harry", "Potter", "9998887766", "4 Privet Dr");
		});
	}
	
	//Test first name validation
	@Test
	void invalidFirstNameChars() {
		
		//Verify a first name longer than 10 characters throws an exception
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123456789","HarrisonFord", "Potter", "9998887766", "4 Privet Dr");
		});
	}
	
	@Test
	void invalidFirstNameNull() {
		
		//Verify a first name that's null throws an exception
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1232456789", null, "Potter", "9998887766", "4 Privet Dr");
		});
	}
	
	//Test last name validation
	@Test
	void invalidLastNameChars() {
		
		//Verify a last name longer than 10 characters throws an exception
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123456789","Harry", "Pottersonville", "9998887766", "4 Privet Dr");
		});
	}
	
	@Test
	void invalidLastNameNull() {
		
		//Verify a last name that's null throws an exception
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1232456789", "Harry", null, "9998887766", "4 Privet Dr");
		});
	}
	
	//Test phone number validation
	@Test
	void invalidPhoneCharsShort() {
		
		//Verify a phone number shorter than 10 characters throws an exception
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123456789","Harry", "Potter", "8887766", "4 Privet Dr");
		});
	}
	
	@Test
	void invalidPhoneCharsLong() {
		
		//Verify a phone number longer than 10 characters throws an exception
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123456789","Harry", "Potter", "19998887766", "4 Privet Dr");
		});
	}
	
	@Test
	void invalidPhoneNull() {
		
		//Verify a phone number that's null throws an exception
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1232456789", "Harry", "Potter", null, "4 Privet Dr");
		});
	}
	
	@Test
	void invalidPhoneDigits() {
		
		//Verify a phone number that's NOT all digits throws an exception
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1232456789", "Harry", "Potter", "999888776H", "4 Privet Dr");
		});
	}
	
	//Test address validation
	@Test
	void invalidAddressChars() {
		
		//Verify an address longer than 30 characters throws an exception
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123456789","Harry", "Potter", "9998887766", "4 Privet Somewhere Over the Rainbow Dr");
		});
	}
	
	@Test
	void invalidAddressNull() {
		
		//Verify an address that's null throws an exception
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1232456789", "Harry", "Potter", "9998887766", null);
		});
	}


	//Test the getters
	@Test
	void testGetContactId() {
		assertEquals("123456789", testContact.getContactId());
	}
	
	@Test
	void testGetFirstName() {
		assertEquals("Ronald", testContact.getFirstName());
	}
	
	@Test
	void testGetLastName() {
		assertEquals("Weasley", testContact.getLastName());
	}
	
	@Test
	void testGetPhone() {
		assertEquals("5554443322", testContact.getPhone());
	}
	
	@Test
	void testGetAddress() {
		assertEquals("123 Not Privet Dr", testContact.getAddress());
	}
	
	//Test the setters for valid inputs
	@Test
	void testSetFirstName() {
		
		//First change the variable via the method
		testContact.setFirstName("Ian");
		
		//Now use assertion to confirm update
		assertEquals("Ian", testContact.getFirstName());
	}
	
	@Test
	void testSetLastName() {
		
		//First change the variable via the method
		testContact.setLastName("Sheppard");
		
		//Now use assertion to confirm update
		assertEquals("Sheppard", testContact.getLastName());
	}
	
	@Test
	void testSetPhone() {
		
		//First change the variable via the method
		testContact.setPhone("5556667788");
		
		//Now use assertion to confirm update
		assertEquals("5556667788", testContact.getPhone());
	}
	
	@Test
	void testSetAddress() {
		
		//First change the variable via the method
		testContact.setAddress("1234 Abc St");
		
		//Now use assertion to confirm update
		assertEquals("1234 Abc St", testContact.getAddress());
	}
	
	
	//Test the setters for invalid inputs
	
	//Verify an invalid first name throws an exception
	@Test
	void testSetFirstNameInvalidChar() {
				
		assertThrows(IllegalArgumentException.class, () -> {
			testContact.setFirstName("HarrisonFord");
		});
	}
	
	@Test
	void testSetFirstNameInvalidNull() {
				
		assertThrows(IllegalArgumentException.class, () -> {
			testContact.setFirstName(null);
		});
	}
	
	//Verify an invalid last name throws an exception
	@Test
	void testSetLastNameInvalidChar() {
				
		assertThrows(IllegalArgumentException.class, () -> {
			testContact.setLastName("Pottersonville");
		});
	}
	
	@Test
	void testSetLastNameInvalidNull() {
		
		assertThrows(IllegalArgumentException.class, () -> {
			testContact.setLastName(null);
		});
	}
	
	//Verify an invalid phone number throws an exception
	@Test
	void testSetPhoneInvalidCharsShort() {
				
		assertThrows(IllegalArgumentException.class, () -> {
			testContact.setPhone("4443322");
		});
	}
	
	@Test
	void testSetPhoneInvalidCharsLong() {
				
		assertThrows(IllegalArgumentException.class, () -> {
			testContact.setPhone("15554443322");
		});
	}
	
	@Test
	void testSetPhoneInvalidNull() {
				
		assertThrows(IllegalArgumentException.class, () -> {
			testContact.setPhone(null);
		});
	}
	
	@Test
	void testSetPhoneInvalidDigits() {
				
		assertThrows(IllegalArgumentException.class, () -> {
			testContact.setPhone("555444332H");
		});
	}
	
	//Verify an invalid address throws an exception
	@Test
	void testSetAddressInvalidChar() {
				
		assertThrows(IllegalArgumentException.class, () -> {
			testContact.setAddress("4 Privet Somewhere Over the Rainbow Dr");
		});
	}
	
	@Test
	void testSetAddressInvalidNull() {
				
		assertThrows(IllegalArgumentException.class, () -> {
			testContact.setAddress(null);
		});
	}
	
}
