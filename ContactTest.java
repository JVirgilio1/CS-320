/**Jacob Virgilio
*  CS-320
*  9-22-2024
*/

 package Tests;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import Contact.Contact;

class ContactTest{

	@DisplayName("Test valid constructor")
	@Test
	public void testGoodConstructor() {
        String contactId = "1";
      	String firstName = "George";
        String lastName = "Foreman";
        String phoneNumber = "1234567890";
        String address = "919 Grill Street";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);
        
		assertEquals(1, testContact.getContactID());
		assertEquals(firstName, testContact.getFirstName());
		assertEquals(lastName, testContact.getLastName());
		assertEquals(phoneNumber, testContact.getPhoneNumber());
		assertEquals(address, testContact.getAddress());
	}
	
		@DisplayName("Test invalid constructor")
	@Test
	public void testBadConstructor() {
        String contactId = "2";
      	String firstName = "George";
        String lastName = "Grillman";
        String phoneNumber = "6";
        String address = "919 Fore Street";       
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	new Contact(contactId, firstName, lastName, phoneNumber, address);
        });
	}
	
	@DisplayName("Test valid setFirstName")
	@Test
	public void testGoodSetFirst() {
        String contactId = "3";
      	String firstName = "George";
        String lastName = "Farman";
        String phoneNumber = "1234567890";
        String address = "919 Close Street";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        testContact.setFirstName("Test");        
        assertEquals("Test", testContact.getFirstName());
	}
	
	@DisplayName("Test invalid null setFirstName")
	@Test
	public void testBadSetFirst() {
        String contactId = "3";
      	String firstName = "George";
        String lastName = "Fromman";
        String phoneNumber = "1234567890";
        String address = "919 There Street";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	testContact.setFirstName(null);
        });
	}
	
	@DisplayName("Test invalid length setFirstName")
	@Test
	public void testLongSetFirst() {
        String contactId = "3";
      	String firstName = "George";
        String lastName = "Farmman";
        String phoneNumber = "1234567891";
        String address = "919 Grow Street";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	testContact.setFirstName("BigOlGeorgeForemanGrill");
        });
	}
	
	@DisplayName("Test getID")
	@Test
	public void testGetID() {
        String contactId = "3";
      	String firstName = "George";
        String lastName = "Golfman";
        String phoneNumber = "1234567890";
        String address = "919 Putt Street";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        assertEquals(3, testContact.getContactID());
	}
	
	@DisplayName("Test bad getID")
	@Test
	public void testBadGetID() {
        String contactId = "3";
      	String firstName = "George";
        String lastName = "Foreman";
        String phoneNumber = "1234567890";
        String address = "919 Cook Street";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        assertNotEquals("3", testContact.getContactID());
	}
	
	@DisplayName("Test too long getID")
	@Test
	public void testlongGetID() {
        String contactId = "22446677910051214";
      	String firstName = "George";
        String lastName = "Foremna";
        String phoneNumber = "1234567891";
        String address = "919 First Street";
		
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	new Contact(contactId, firstName, lastName, phoneNumber, address);
        });
	}
	
	@DisplayName("Test invalid null setLastName")
	@Test
	public void testBadSetLast() {
        String contactId = "3";
      	String firstName = "George";
        String lastName = "Bandman";
        String phoneNumber = "1234567891";
        String address = "919 Music Street";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	testContact.setLastName(null);
        });
	}
	
	@DisplayName("Test an invalid length setLastName")
	@Test
	public void testLongSetLast() {
        String contactId = "3";
      	String firstName = "George";
        String lastName = "Smellman";
        String phoneNumber = "1234567891";
        String address = "919 Stink Street";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	testContact.setLastName("ReallyLongLastNameThatShouldntWork");
        });
	}
	
	@DisplayName("Test valid setLastName")
	@Test
	public void testGoodsetLast() {
        String contactId = "3";
      	String firstName = "George";
        String lastName = "Foreman";
        String phoneNumber = "1234567890";
        String address = "919 George Street";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        testContact.setLastName("Test");        
        assertEquals("Test", testContact.getLastName());
	}
	
	@DisplayName("Test invalid null setPhoneNumber")
	@Test
	public void testBadSetPhone() {
        String contactId = "3";
      	String firstName = "George";
        String lastName = "Bowman";
        String phoneNumber = "1234567890";
        String address = "919 Arrow Street";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	testContact.setPhoneNumber(null);
        });
        
	}
	
	@DisplayName("Test invalid length setPhoneNumber")
	@Test
	public void testWrongLengthPhone() {
        String contactId = "3";
      	String firstName = "George";
        String lastName = "Heartman";
        String phoneNumber = "1234567890";
        String address = "919 Snow Street";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	testContact.setPhoneNumber("1");
        });
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	testContact.setPhoneNumber("123456789101112131415");
        });
	}
	
	@DisplayName("Test valid length setPhoneNumber")
	@Test
	public void testGoodPhone() {
        String contactId = "3";
      	String firstName = "George";
        String lastName = "Foreman";
        String phoneNumber = "1234567890";
        String address = "919 Eat Street";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   

        testContact.setPhoneNumber("1987654321");        
        assertEquals("1987654321", testContact.getPhoneNumber());

	}
	
	@DisplayName("Test an invalid null setAddress")
	@Test
	public void testNullSetAddress() {
        String contactId = "3";
      	String firstName = "George";
        String lastName = "Foreman";
        String phoneNumber = "1234567890";
        String address = "919 Eat Street";

		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	testContact.setAddress(null);
        });
        
	}
	
	
	@DisplayName("Test invalid length setPhoneNumber")
	@Test
	public void testWrongLengthAddress() {
        String contactId = "3";
      	String firstName = "George";
        String lastName = "Foreman";
        String phoneNumber = "1234567890";
        String address = "919 Eat Street";


		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	testContact.setAddress("9191919 Extreamly long address that should throw an error or else I did something wrong Street");
        });
	}
	@DisplayName("Test a valid length setAddress")
	@Test
	public void testGoodAddress() {
        String contactId = "3";
      	String firstName = "George";
        String lastName = "Foreman";
        String phoneNumber = "1234567890";
        String address = "123 Grill Street";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   

        testContact.setAddress("919 Valid Address");        
        assertEquals("919 Valid Address", testContact.getAddress());

	}
	
}
