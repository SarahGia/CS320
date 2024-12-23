import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class ContactServiceTest {
	
	@Test
    void testAddingContact() {
        
		ContactService contactService = new ContactService();
        Contact contact = new Contact("123", "Frodo", "Baggins", "1234567890", "123 Road");
        
        contactService.addContact(contact);  //adds contact then tests if it is added
        assertEquals(1, contactService.getContacts().size()); 
        assertEquals("Frodo", contactService.getContacts().get(0).getFirstName());
        

}
	
	@Test
	void testDuplicateId() {
		
		ContactService contactService = new ContactService();
		
		Contact contact1 = new Contact("1", "Frodo", "Baggins", "1234567890", "123 Road"); 
		Contact contact2 = new Contact("1", "Sam", "Gamgee", "0987654321", "456 Lane");
        contactService.addContact(contact1);
        contactService.addContact(contact2);
	}
	
	@Test
	void testDeletingContact() {
		
		ContactService contactService = new ContactService();
		Contact contact = new Contact("1", "Frodo", "Baggins", "1234567890", "123 Road");
		
		contactService.addContact(contact);
		contactService.deleteContact("1");
		
        ArrayList<Contact> contacts = contactService.getContacts();
        assertTrue(contacts.isEmpty());

	}
	
	@Test 
	void testUpdatingContact() {
		
		ContactService contactService = new ContactService();
		Contact contact = new Contact("1", "Frodo", "Baggins", "1234567890", "123 Road");
        
		contactService.addContact(contact);
		contactService.updateContact("1", "Samwise", null, "0987654321", "456 Lane");
        
		ArrayList<Contact> contacts = contactService.getContacts();
		
		assertEquals("Samwise", contacts.get(0).getFirstName());
        assertEquals("Baggins", contacts.get(0).getLastName());
        assertEquals("0987654321", contacts.get(0).getNumber());
        assertEquals("456 Lane", contacts.get(0).getAddress());
    }
	}

