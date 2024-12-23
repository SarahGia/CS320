import java.util.ArrayList;

public class ContactService {
	
	private ArrayList<Contact> contacts;
	


//constructor

public ContactService() {
	contacts = new ArrayList<>();
	
}

//add new contact

public void addContact(Contact contact) {
    contacts.add(contact);
}

//delete contact

public void deleteContact(String contactId) {
    for (int i = 0; i < contacts.size(); i++) {
        if (contacts.get(i).getContactId().equals(contactId)) {
            contacts.remove(i);
            break; 
        }
    }
}
//update a contact

public void updateContact(String contactId, String firstName, String lastName, String Number, String Address) {
    for (Contact contact : contacts) {
        if (contact.getContactId().equals(contactId)) {
           
            if (firstName != null && firstName.length() <= 10) {
                contact.setFirstName(firstName);
            }
            if (lastName != null && lastName.length() <= 10) {
                contact.setLastName(lastName);
            }
            if (Number != null && Number.length() == 10) {
                contact.setNumber(Number);
            }
            if (Address != null && Address.length() <= 30) {
                contact.setAddress(Address);
            }
            break; 
        }
    }
}

public ArrayList<Contact> getContacts() {
    return contacts;
}

}