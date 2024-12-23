
public class Contact {
	
	private final String contactId; //makes it so it is not updatable
	private String firstName;
	private String lastName;
	private String Number;
	private String Address;
	


public Contact(String contactId, String firstName, String lastName, String Number, String Address) {
	
	if (contactId == null || contactId.length() > 10) {
        this.contactId = "Invalid";
    } else {
        this.contactId = contactId;
    }
	
    if (firstName == null || firstName.length() > 10) {
        this.firstName = "Invalid";
    } else {
        this.firstName = firstName;
    }
    
    if (lastName == null || lastName.length() > 10) {
        this.lastName = "Invalid";
    } else {
        this.lastName = lastName;
    }
    
    if (Number == null || Number.length() != 10) { 
        this.Number = "Invalid";
    } else {
        this.Number = Number;
    }
    
    if (Address == null || Address.length() > 30) {
        this.Address = "Invalid";
    } else {
        this.Address = Address;
    }
    
}


//getters

public String getContactId() {
    return contactId;
}

public String getFirstName() {
    return firstName;
}

public String getLastName() {
    return lastName;
}

public String getNumber() { 
    return Number;
}

public String getAddress() {
    return Address;
}


//setters

public void setFirstName(String firstName) {
    this.firstName = firstName;
}

public void setLastName(String lastName) {
    this.lastName = lastName;
}


public void setNumber(String Number) {
    this.Number = Number;
}

public void setAddress(String Address) {
    this.Address = Address;
}

}
