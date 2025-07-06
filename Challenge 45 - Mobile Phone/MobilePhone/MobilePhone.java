package MobilePhone;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }


    boolean addNewContact(Contact contact) {
        // Check if contact with same name already exists
        for (Contact existingContact : myContacts) {
            if (existingContact.getName().equals(contact.getName())) {
                return false; // contact already exists
            }
        }

        myContacts.add(contact); // contact is new
        return true;
    }


    boolean updateContact(Contact oldContact, Contact newContact) {
        return true;
    }

    boolean removeContact(Contact contact) {
        return true;
    }

    private int findContact(Contact contact) {
        return -1;
    }
}
