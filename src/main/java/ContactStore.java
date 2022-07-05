import model.Contact;

import java.util.Arrays;


public class ContactStore {

    private Contact[] allContacts;

    public ContactStore(Contact[] allContacts) {
        this.allContacts = allContacts;
    }

    public Contact[] getAllContacts() {
        return allContacts;
    }

    public void setAllContacts(Contact[] allContacts) {
        this.allContacts = allContacts;
    }

    public void addContact(Contact contact) {
        Contact[] newArray = new Contact[allContacts.length + 1];
        int counter = 0;
        for (Contact abc : allContacts) {
            newArray[counter] = abc;
            counter++;
        }
        newArray[counter] = contact;
        allContacts = newArray;
    }
}
