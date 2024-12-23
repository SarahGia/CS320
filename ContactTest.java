import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ContactTest {
	
	@Test
	
	void testContact() {
		
		Contact contact = new Contact("12345", "Frodo", "Baggins", "1234567890", "123 Road");  //creates the contact
        
		assertTrue(contact.getContactId().equals("12345"));
        assertTrue(contact.getFirstName().equals("Frodo"));
        assertTrue(contact.getLastName().equals("Baggins"));
        assertTrue(contact.getNumber().equals("1234567890"));
        assertTrue(contact.getAddress().equals("123 Road"));   //these assertions are to test if the fields are filled correctly
    }
	
	@Test
	
	void testContactIdTooLong() {
		
		Contact contact = new Contact("12345678909", "Frodo", "Baggins", "1234567890", "123 Road");
        assertEquals("Invalid", contact.getContactId());  //tests for when the contact id is too long
    }

	@Test
	
	void testFirstNameIsNull() {
		
		Contact contact = new Contact("123", null, "Baggings", "1234567890", "123 Road");
        assertEquals("Invalid", contact.getFirstName());   //when first name is null
    }
	
	@Test
	
	void testPhoneTooShort() {
		 
		Contact contact = new Contact("123", "Frodo", "Baggins", "123", "123 Road");
		 assertEquals("Invalid", contact.getNumber());  //when phone number is too short
	}
	}


	

